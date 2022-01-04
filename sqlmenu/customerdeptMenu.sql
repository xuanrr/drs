-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息', '2000', '1', '/system/customerdept', 'C', '0', 'system:customerdept:view', '#', 'admin', sysdate(), '', null, '客户部门信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息查询', @parentId, '1',  '#',  'F', '0', 'system:customerdept:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息新增', @parentId, '2',  '#',  'F', '0', 'system:customerdept:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息修改', @parentId, '3',  '#',  'F', '0', 'system:customerdept:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息删除', @parentId, '4',  '#',  'F', '0', 'system:customerdept:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('客户部门信息导出', @parentId, '5',  '#',  'F', '0', 'system:customerdept:export',       '#', 'admin', sysdate(), '', null, '');
