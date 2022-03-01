create table sys_user
(
    user_id         bigint auto_increment comment '用户ID'
        primary key,
    dept_id         bigint                    null comment '部门ID',
    login_name      varchar(30)               not null comment '登录账号',
    user_name       varchar(30)  default ''   null comment '用户昵称',
    user_type       varchar(2)   default '00' null comment '用户类型（00系统用户 01注册用户）',
    email           varchar(50)  default ''   null comment '用户邮箱',
    phonenumber     varchar(11)  default ''   null comment '手机号码',
    sex             char         default '0'  null comment '用户性别（0男 1女 2未知）',
    avatar          varchar(100) default ''   null comment '头像路径',
    password        varchar(50)  default ''   null comment '密码',
    salt            varchar(20)  default ''   null comment '盐加密',
    status          char         default '0'  null comment '帐号状态（0正常 1停用）',
    del_flag        char         default '0'  null comment '删除标志（0代表存在 2代表删除）',
    login_ip        varchar(128) default ''   null comment '最后登录IP',
    login_date      datetime                  null comment '最后登录时间',
    pwd_update_date datetime                  null comment '密码最后更新时间',
    create_by       varchar(64)  default ''   null comment '创建者',
    create_time     datetime                  null comment '创建时间',
    update_by       varchar(64)  default ''   null comment '更新者',
    update_time     datetime                  null comment '更新时间',
    remark          varchar(500)              null comment '备注'
)
    comment '用户信息表';

INSERT INTO drs.sys_user (user_id, dept_id, login_name, user_name, user_type, email, phonenumber, sex, avatar, password, salt, status, del_flag, login_ip, login_date, pwd_update_date, create_by, create_time, update_by, update_time, remark) VALUES (1, 103, 'admin', 'zxy', '00', 'nssol@cn.nssol.nipponsteel.com', '15888888888', '0', '/profile/avatar/2021/12/30/9aca024d-88af-4e44-acd4-308d5bd52aa4.png', '29c67a30398638269fe600f73a054934', '111111', '0', '0', '127.0.0.1', '2022-03-01 15:30:19', '2021-12-20 14:28:18', 'admin', '2021-12-20 14:28:18', '', '2022-03-01 15:30:19', '管理员');
INSERT INTO drs.sys_user (user_id, dept_id, login_name, user_name, user_type, email, phonenumber, sex, avatar, password, salt, status, del_flag, login_ip, login_date, pwd_update_date, create_by, create_time, update_by, update_time, remark) VALUES (100, 103, 'user1', '用户1', '00', 'zhouxuanyu5062@outlook.com', '18516637303', '0', '', '5f4070a8d6dd8044a0a160011d98d46a', 'a21c5c', '0', '0', '127.0.0.1', '2022-01-04 17:44:47', null, 'admin', '2022-01-04 17:42:37', '', '2022-01-04 17:44:47', null);
INSERT INTO drs.sys_user (user_id, dept_id, login_name, user_name, user_type, email, phonenumber, sex, avatar, password, salt, status, del_flag, login_ip, login_date, pwd_update_date, create_by, create_time, update_by, update_time, remark) VALUES (101, 101, 'User2', '用户2', '00', 'zhoux062@outlook.com', '18378787722', '0', '', '0a88ebea10d5d874787fbc3c51f1cac3', 'cb31dd', '0', '0', '', null, null, 'admin', '2022-02-22 13:19:07', '', null, null);
