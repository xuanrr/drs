create table sys_role
(
    role_id     bigint auto_increment comment '角色ID'
        primary key,
    role_name   varchar(30)             not null comment '角色名称',
    role_key    varchar(100)            not null comment '角色权限字符串',
    role_sort   int                     not null comment '显示顺序',
    data_scope  char        default '1' null comment '数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）',
    status      char                    not null comment '角色状态（0正常 1停用）',
    del_flag    char        default '0' null comment '删除标志（0代表存在 2代表删除）',
    create_by   varchar(64) default ''  null comment '创建者',
    create_time datetime                null comment '创建时间',
    update_by   varchar(64) default ''  null comment '更新者',
    update_time datetime                null comment '更新时间',
    remark      varchar(500)            null comment '备注'
)
    comment '角色信息表';

INSERT INTO drs.sys_role (role_id, role_name, role_key, role_sort, data_scope, status, del_flag, create_by, create_time, update_by, update_time, remark) VALUES (1, '超级管理员', 'admin', 1, '1', '0', '0', 'admin', '2021-12-20 14:28:19', '', null, '超级管理员');
INSERT INTO drs.sys_role (role_id, role_name, role_key, role_sort, data_scope, status, del_flag, create_by, create_time, update_by, update_time, remark) VALUES (2, '普通角色', 'common', 2, '2', '0', '0', 'admin', '2021-12-20 14:28:19', 'admin', '2022-01-04 17:44:35', '普通角色');
