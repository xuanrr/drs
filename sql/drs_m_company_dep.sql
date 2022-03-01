create table m_company_dep
(
    id          int auto_increment
        primary key,
    name        varchar(100)                       not null,
    code        varchar(20)                        null,
    company_id  int                                null,
    create_time datetime default CURRENT_TIMESTAMP null,
    create_by   varchar(20)                        null,
    update_time datetime default CURRENT_TIMESTAMP null,
    update_by   varchar(20)                        null
);

INSERT INTO drs.m_company_dep (id, name, code, company_id, create_time, create_by, update_time, update_by) VALUES (4, '部门5', 'D22010003', 21, '2022-01-10 11:50:36', null, '2022-01-10 11:50:35', null);
INSERT INTO drs.m_company_dep (id, name, code, company_id, create_time, create_by, update_time, update_by) VALUES (5, '部门1', 'D22010004', 21, '2022-01-10 11:52:23', 'admin', '2022-01-10 11:52:23', 'admin');
INSERT INTO drs.m_company_dep (id, name, code, company_id, create_time, create_by, update_time, update_by) VALUES (6, '13212', 'D22020005', 21, '2022-02-21 11:43:27', 'admin', '2022-02-21 11:43:27', 'admin');
INSERT INTO drs.m_company_dep (id, name, code, company_id, create_time, create_by, update_time, update_by) VALUES (7, '部门2', 'D22020006', 20, '2022-02-22 16:53:31', 'admin', '2022-02-22 16:53:31', 'admin');
