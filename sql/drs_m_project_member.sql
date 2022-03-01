create table m_project_member
(
    user_id    bigint not null,
    project_id int    not null,
    primary key (user_id, project_id)
);

INSERT INTO drs.m_project_member (user_id, project_id) VALUES (100, 47);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (100, 52);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (100, 53);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (100, 54);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (101, 52);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (101, 53);
INSERT INTO drs.m_project_member (user_id, project_id) VALUES (101, 54);
