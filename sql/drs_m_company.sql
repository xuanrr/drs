create table m_company
(
    id          int auto_increment
        primary key,
    name        varchar(10)                        not null,
    isvendor    int                                null,
    iscustomer  int                                null,
    code        varchar(20)                        null,
    remark      varchar(255)                       null,
    available   int      default 1                 not null,
    create_by   varchar(20)                        null,
    create_time datetime default CURRENT_TIMESTAMP null,
    update_by   varchar(20)                        null,
    update_time datetime default CURRENT_TIMESTAMP null
);

INSERT INTO drs.m_company (id, name, isvendor, iscustomer, code, remark, available, create_by, create_time, update_by, update_time) VALUES (20, '供应商1', 1, 0, 'C22010006', '', 1, 'admin', '2022-01-04 10:53:17', 'admin', '2022-01-04 14:29:20');
INSERT INTO drs.m_company (id, name, isvendor, iscustomer, code, remark, available, create_by, create_time, update_by, update_time) VALUES (21, '客户1', 0, 1, 'C22010007', '', 1, 'admin', '2022-01-04 10:58:26', 'admin', '2022-01-04 14:29:51');
INSERT INTO drs.m_company (id, name, isvendor, iscustomer, code, remark, available, create_by, create_time, update_by, update_time) VALUES (22, '客户和供应商1', 1, 1, 'C22010008', '', 1, 'admin', '2022-01-04 10:58:36', 'admin', '2022-01-04 14:29:42');
