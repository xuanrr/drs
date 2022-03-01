create table m_entrust_type
(
    code int auto_increment
        primary key,
    type varchar(10) null
);

INSERT INTO drs.m_entrust_type (code, type) VALUES (1, '请负');
INSERT INTO drs.m_entrust_type (code, type) VALUES (2, '委托');
