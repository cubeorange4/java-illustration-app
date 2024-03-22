INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(1, 1, 'test', 'house01.jpg', 1, 2, 3, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(2, 1, 'test', 'house01.jpg', 1, 2, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(3, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(4, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(5, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(6, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(7, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(8, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(9, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(10, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(11, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');
INSERT IGNORE INTO illustration (id, user_id, name, image_name, category_a, category_b, category_c, category_d, category_e, description, start_date, finish_date) VALUES(12, 1, 'test', 'house01.jpg', 1, NULL, NULL, NULL, NULL, 'test', '2023-01-01', '2024-01-01');

INSERT IGNORE INTO category (id, user_id, name) VALUES(1, 1, 'house');
INSERT IGNORE INTO category (id, user_id, name) VALUES(2, 1, '家');
INSERT IGNORE INTO category (id, user_id, name) VALUES(3, 1, 'home');

INSERT IGNORE INTO roles (id, name) VALUES (1, 'ROLE_GENERAL');
INSERT IGNORE INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT IGNORE INTO users (id, name, role_id, email, password, enabled) VALUES (1, 'testUser', 1, 'test.user@example.com', '$2a$10$2JNjTwZBwo7fprL2X4sv.OEKqxnVtsVQvuXDkI8xVGix.U3W5B7CO', true);

INSERT IGNORE INTO album (id, user_id, name) VALUES (1, 1, 'testAlbum');

INSERT IGNORE INTO album_info (id, album_id, illustration_id) VALUES (1, 1, 1);