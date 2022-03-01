create table qrtz_locks
(
    sched_name varchar(120) not null comment '调度名称',
    lock_name  varchar(40)  not null comment '悲观锁名称',
    primary key (sched_name, lock_name)
)
    comment '存储的悲观锁信息表';

INSERT INTO drs.qrtz_locks (sched_name, lock_name) VALUES ('RuoyiScheduler', 'STATE_ACCESS');
INSERT INTO drs.qrtz_locks (sched_name, lock_name) VALUES ('RuoyiScheduler', 'TRIGGER_ACCESS');
