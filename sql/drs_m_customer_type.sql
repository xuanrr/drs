create table m_customer_type
(
    type varchar(10) null,
    code int auto_increment
        primary key
);

INSERT INTO drs.m_customer_type (type, code) VALUES ('客户', 1);
INSERT INTO drs.m_customer_type (type, code) VALUES ('供应商', 2);
INSERT INTO drs.m_customer_type (type, code) VALUES ('客户+供应商', 3);
