package pl.brzezins.shedlock.annotation;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class SchedulerLockIntegrationTest {
    @SpyBean
    SchedulerLockProxy schedulerLockProxy;

    @Test
    void schedulerLockAnnotationShouldPreventMultipleExecutions() {
        assertDoesNotThrow(() -> {
            for (int i = 0; i < 10; i++) {
                schedulerLockProxy.executeProxy();
            }
        });

        Mockito.verify(schedulerLockProxy, Mockito.times(1)).executeProxy();
    }
}
