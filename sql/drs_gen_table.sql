create table gen_table
(
    table_id          bigint auto_increment comment '编号'
        primary key,
    table_name        varchar(200) default ''     null comment '表名称',
    table_comment     varchar(500) default ''     null comment '表描述',
    sub_table_name    varchar(64)                 null comment '关联子表的表名',
    sub_table_fk_name varchar(64)                 null comment '子表关联的外键名',
    class_name        varchar(100) default ''     null comment '实体类名称',
    tpl_category      varchar(200) default 'crud' null comment '使用的模板（crud单表操作 tree树表操作 sub主子表操作）',
    package_name      varchar(100)                null comment '生成包路径',
    module_name       varchar(30)                 null comment '生成模块名',
    business_name     varchar(30)                 null comment '生成业务名',
    function_name     varchar(50)                 null comment '生成功能名',
    function_author   varchar(50)                 null comment '生成功能作者',
    gen_type          char         default '0'    null comment '生成代码方式（0zip压缩包 1自定义路径）',
    gen_path          varchar(200) default '/'    null comment '生成路径（不填默认项目路径）',
    options           varchar(1000)               null comment '其它生成选项',
    create_by         varchar(64)  default ''     null comment '创建者',
    create_time       datetime                    null comment '创建时间',
    update_by         varchar(64)  default ''     null comment '更新者',
    update_time       datetime                    null comment '更新时间',
    remark            varchar(500)                null comment '备注'
)
    comment '代码生成业务表';

INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (10, 'm_project', '项目', '', null, 'Project', 'crud', 'com.ruoyi.project.system', 'system', 'project', '项目', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2021-12-21 11:21:36', '', '2022-01-04 11:31:04', '');
INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (12, 'm_company', '公司', '', null, 'Company', 'crud', 'com.ruoyi.project.system', 'system', 'company', '公司', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2021-12-23 13:36:33', '', '2022-01-04 10:42:48', '');
INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (14, 'm_company_dep', '公司部门', '', null, 'CompanyDep', 'crud', 'com.ruoyi.project.system', 'system', 'companydept', '公司部门', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2022-01-04 17:50:45', '', '2022-02-22 16:01:49', '');
INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (15, 'm_project_member', '项目成员', '', null, 'ProjectMember', 'crud', 'com.ruoyi.project.system', 'system', 'projectmember', '项目成员', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2022-01-10 13:47:39', '', '2022-01-10 14:00:06', '');
INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (17, 'm_record', '运维记录', '', null, 'Record', 'crud', 'com.nssol.project.system', 'system', 'record', '运维记录', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2022-03-01 09:48:03', '', '2022-03-01 14:36:16', '');
INSERT INTO drs.gen_table (table_id, table_name, table_comment, sub_table_name, sub_table_fk_name, class_name, tpl_category, package_name, module_name, business_name, function_name, function_author, gen_type, gen_path, options, create_by, create_time, update_by, update_time, remark) VALUES (18, 'm_develop_type', '运维类型', '', null, 'DevelopType', 'crud', 'com.nssol.project.system', 'system', 'developtype', '运维类型', 'zxy', '0', '/', '{"parentMenuId":"2000","treeName":"","treeParentCode":"","parentMenuName":"主数据","treeCode":""}', 'admin', '2022-03-01 15:20:40', '', '2022-03-01 15:23:06', '');
