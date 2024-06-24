INSERT  INTO users (id, user_id, first_name, last_name, email, phone, bio,
                    reference_id, image_url, created_by, updated_by, created_at, updated_at, account_non_expired,
                    account_non_locked, enabled, has_mfa)
VALUES (0, 123456, 'System', 'System', 'system@gmail.com', '123412', 'This is not a user but the system itself', '12312f2134', 'https://p7.hiclipart.com/preview/980/304/8/computer-icons-user-profile-avatar.jpg',0, 0,
                        '2024-06-16 18:52:57.449679', '2024-06-16 18:52:57.449679', TRUE, TRUE, FALSE, FALSE); 