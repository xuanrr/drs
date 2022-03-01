create table m_develop_type
(
    id          int auto_increment
        primary key,
    name        varchar(100)                       null,
    code        varchar(20)                        null,
    sort        int                                null,
    remark      varchar(255)                       null,
    available   int      default 1                 null,
    create_by   varchar(20)                        null,
    create_time datetime default CURRENT_TIMESTAMP null,
    update_by   varchar(20)                        null,
    update_time datetime default CURRENT_TIMESTAMP null
);

INSERT INTO drs.m_develop_type (id, name, code, sort, remark, available, create_by, create_time, update_by, update_time) VALUES (1, '1222', '222', 22, '', 1, 'admin', '2022-02-21 13:15:27', 'admin', '2022-02-21 13:15:27');
INSERT INTO drs.m_develop_type (id, name, code, sort, remark, available, create_by, create_time, update_by, update_time) VALUES (3, '无效类型', '12321', 3, '', 0, 'admin', '2022-03-01 15:00:13', 'admin', '2022-03-01 15:30:43');
INSERT INTO drs.m_develop_type (id, name, code, sort, remark, available, create_by, create_time, update_by, update_time) VALUES (4, '运维类型1', '9239', 32, '', 1, 'admin', '2022-03-01 15:01:38', 'admin', '2022-03-01 15:01:38');
INSERT INTO drs.m_develop_type (id, name, code, sort, remark, available, create_by, create_time, update_by, update_time) VALUES (5, '类型10', '1999', 1, '1', 1, 'admin', '2022-03-01 15:16:08', 'admin', '2022-03-01 15:16:08');
