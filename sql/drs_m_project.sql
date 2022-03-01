create table m_project
(
    id            int auto_increment
        primary key,
    name          varchar(20)                        not null,
    code          varchar(20)                        not null,
    start_date    date                               null,
    end_date      date                               null,
    customer_id   int                                null,
    man_day       double                             null,
    vendor_needed int                                not null comment '是否需要供应商',
    entrust_type  int      default 0                 null comment '委托方式(请负1|委托2)',
    vendor_name   varchar(20)                        null,
    vendor_manday int                                null,
    available     int      default 1                 not null,
    remark        varchar(255)                       null,
    create_by     varchar(20)                        null,
    create_time   datetime default CURRENT_TIMESTAMP null,
    update_by     varchar(20)                        null,
    update_time   datetime default CURRENT_TIMESTAMP null,
    constraint m_project_code_uindex
        unique (code)
);

INSERT INTO drs.m_project (id, name, code, start_date, end_date, customer_id, man_day, vendor_needed, entrust_type, vendor_name, vendor_manday, available, remark, create_by, create_time, update_by, update_time) VALUES (47, '项目02', 'PJ00002', '2021-12-01', '2021-12-31', 21, 12, 1, 1, '', 123, 1, '', 'admin', '2022-02-22 13:17:55', 'admin', '2022-02-22 15:33:28');
INSERT INTO drs.m_project (id, name, code, start_date, end_date, customer_id, man_day, vendor_needed, entrust_type, vendor_name, vendor_manday, available, remark, create_by, create_time, update_by, update_time) VALUES (52, '项目3', 'P23132', '2021-12-01', '2021-12-10', 22, 1, 1, 1, '', null, 1, '', 'admin', '2022-02-22 13:40:29', 'admin', '2022-02-24 09:33:19');
INSERT INTO drs.m_project (id, name, code, start_date, end_date, customer_id, man_day, vendor_needed, entrust_type, vendor_name, vendor_manday, available, remark, create_by, create_time, update_by, update_time) VALUES (53, '项目23', 'sifja', '2021-12-01', '2021-12-16', 22, 1, 1, 0, '客户和供应商1', null, 1, '', 'admin', '2022-02-22 15:31:07', 'admin', '2022-02-22 15:31:07');
INSERT INTO drs.m_project (id, name, code, start_date, end_date, customer_id, man_day, vendor_needed, entrust_type, vendor_name, vendor_manday, available, remark, create_by, create_time, update_by, update_time) VALUES (54, '项目8', 'pj0008', '2021-12-02', '2021-12-17', 22, 1232, 0, 0, '', null, 1, '', 'admin', '2022-03-01 15:39:53', 'admin', '2022-03-01 15:39:53');
