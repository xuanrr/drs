create table m_record
(
    id              int auto_increment
        primary key,
    page            varchar(255)                       not null,
    project_id      int                                not null,
    develop_type_id int                                not null,
    problem         text                               null,
    develop_detail  text                               null,
    status          int      default 1                 not null,
    presentor       varchar(20)                        not null,
    present_date    date                               not null,
    operator        varchar(20)                        not null,
    manday          int                                not null,
    complete_date   date                               not null,
    confirm_date    date                               null,
    create_time     datetime default CURRENT_TIMESTAMP null,
    create_by       varchar(20)                        null,
    update_time     datetime default CURRENT_TIMESTAMP null,
    update_by       varchar(20)                        null
);

INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (2, '', 47, 1, null, '1', 1, '', '0000-00-00', '', 0, '0000-00-00', null, '2022-02-24 16:59:44', 'admin', '2022-02-24 16:59:44', 'admin');
INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (3, '', 47, 2, null, '对项目02进行运维', 1, '', '0000-00-00', '', 0, '0000-00-00', null, '2022-02-28 09:45:21', 'admin', '2022-02-28 09:45:21', 'admin');
INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (4, '', 52, 2, null, '1', 1, '', '0000-00-00', '', 0, '0000-00-00', null, '2022-02-28 10:37:56', 'admin', '2022-02-28 10:37:56', 'admin');
INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (5, '', 53, 2, null, '1', 1, '', '0000-00-00', '', 0, '0000-00-00', null, '2022-02-28 10:42:02', 'admin', '2022-02-28 10:42:02', 'admin');
INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (7, '画面1', 52, 2, '问题1', '操作操作操作操作操作操作操作操作操作操作操作操作操作操作操作操作', 1, '小周', '2022-03-01', '小周', 0, '2022-03-18', '2022-03-03', '2022-03-01 11:04:19', null, '2022-03-01 11:04:19', null);
INSERT INTO drs.m_record (id, page, project_id, develop_type_id, problem, develop_detail, status, presentor, present_date, operator, manday, complete_date, confirm_date, create_time, create_by, update_time, update_by) VALUES (8, '画面1', 52, 3, '问题1', '操作操作操作操作11111111111111', 2, '小周', '2022-03-01', '小周', 2332, '2022-03-02', '2022-03-02', '2022-03-01 15:33:06', null, '2022-03-01 15:33:34', null);
