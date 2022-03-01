create table sys_user_online
(
    sessionId        varchar(50)  default '' not null comment '用户会话id'
        primary key,
    login_name       varchar(50)  default '' null comment '登录账号',
    dept_name        varchar(50)  default '' null comment '部门名称',
    ipaddr           varchar(128) default '' null comment '登录IP地址',
    login_location   varchar(255) default '' null comment '登录地点',
    browser          varchar(50)  default '' null comment '浏览器类型',
    os               varchar(50)  default '' null comment '操作系统',
    status           varchar(10)  default '' null comment '在线状态on_line在线off_line离线',
    start_timestamp  datetime                null comment 'session创建时间',
    last_access_time datetime                null comment 'session最后访问时间',
    expire_time      int          default 0  null comment '超时时间，单位为分钟'
)
    comment '在线用户记录';

INSERT INTO drs.sys_user_online (sessionId, login_name, dept_name, ipaddr, login_location, browser, os, status, start_timestamp, last_access_time, expire_time) VALUES ('147f6d02-9348-4a3d-ab2b-4cf4859740cb', 'admin', '研发部门', '127.0.0.1', '内网IP', 'Chrome 9', 'Windows 10', 'on_line', '2022-03-01 15:30:18', '2022-03-01 15:39:53', 1800000);
