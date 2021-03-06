package com.hitol.springboot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 定时任务 启动 需要在Application类中加注解 @EnableScheduling
 *
 * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
 * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
 * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
 *
 * @author: User
 * @date 2018/8/31
 **/
@Component
public class ScheduleTask {
    public static Logger logger = LoggerFactory.getLogger(ScheduleTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron="*/5 * * * * *")
    public void test(){
        logger.info("现在时间 ：" + dateFormat.format(new Date()));
//        System.out.println("现在时间 ： " + dateFormat.format(new Date()));
    }

}
