package pl.brzezins.shedlock.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerLockBeansConfig {
    @Bean
    public SchedulerLockProxy schedulerLockProxy() {
        return new SchedulerLockProxy();
    }
}
