INSERT INTO roles(role) VALUES('ADMIN');
INSERT INTO roles(role) VALUES('USER');

INSERT INTO users(email, password, is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled)
VALUES('admin@local','admin', true, true, true, true);

INSERT INTO users(email, password, is_account_non_expired, is_account_non_locked, is_credentials_non_expired, is_enabled)
VALUES('user@local','user', true, true, true, true);


INSERT INTO users_roles(user_id, role_id) VALUES(1, 1);
INSERT INTO users_roles(user_id, role_id) VALUES(1, 2);
INSERT INTO users_roles(user_id, role_id) VALUES(2, 2);