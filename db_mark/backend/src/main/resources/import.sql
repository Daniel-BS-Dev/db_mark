INSERT INTO tb_hairdresser (name_user, type_user, dayoff, start_work, finished_work, hour_meal) VALUES ('Jose', 0, NOW(), NOW(), NOW(), NOW());
INSERT INTO tb_hairdresser (name_user, dayoff, start_work, finished_work, hour_meal) VALUES ('Paulo', NOW(), NOW(), NOW(), NOW());

INSERT INTO tb_client (name, phone) VALUES ('Benedito', '5555555555555');

INSERT INTO tb_haircut (hour, option, price, hairdresser_id, client) VALUES (NOW(), 1, 10.00, 1, 1);
