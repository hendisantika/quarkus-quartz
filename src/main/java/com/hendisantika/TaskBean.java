package com.hendisantika;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/18/23
 * Time: 05:30
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped
public class TaskBean {

    @Transactional
    @Scheduled(every = "10s", identity = "task-job")
    void schedule() {
        Task task = new Task();
        task.persist();
    }
}
//@ApplicationScoped
//public class TaskBean {
//
//    @Inject
//    org.quartz.Scheduler quartz;
//
//    void onStart(@Observes StartupEvent event) throws SchedulerException {
//        JobDetail job = JobBuilder.newJob(MyJob.class)
//                .withIdentity("myJob", "myGroup")
//                .build();
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("myTrigger", "myGroup")
//                .startNow()
//                .withSchedule(
//                        SimpleScheduleBuilder.simpleSchedule()
//                                .withIntervalInSeconds(10)
//                                .repeatForever())
//                .build();
//        quartz.scheduleJob(job, trigger);
//    }
//
//    @Transactional
//    void performTask() {
//        Task task = new Task();
//        task.persist();
//    }
//
//    // A new instance of MyJob is created by Quartz for every job execution
//    public static class MyJob implements Job {
//
//        @Inject
//        TaskBean taskBean;
//
//        public void execute(JobExecutionContext context) throws JobExecutionException {
//            taskBean.performTask();
//        }
//
//    }
//}
