create table qrtz_scheduler_state
(
    sched_name        varchar(120) not null comment '调度名称',
    instance_name     varchar(200) not null comment '实例名称',
    last_checkin_time bigint       not null comment '上次检查时间',
    checkin_interval  bigint       not null comment '检查间隔时间',
    primary key (sched_name, instance_name)
)
    comment '调度器状态表';

INSERT INTO drs.qrtz_scheduler_state (sched_name, instance_name, last_checkin_time, checkin_interval) VALUES ('RuoyiScheduler', 'ns-notepc7171646119811329', 1646120864461, 15000);
