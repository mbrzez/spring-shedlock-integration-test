package pl.brzezins.shedlock.annotation;

import net.javacrumbs.shedlock.core.LockAssert;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

public class SchedulerLockProxy {
    @SchedulerLock(name = "shedlock-proxy", lockAtLeastFor = "60s")
    public void executeProxy() {
        LockAssert.assertLocked();
    }
}
