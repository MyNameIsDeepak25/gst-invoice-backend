-- Step 1: Create a new user 'gst_user' with password 'gst_pass'
CREATE USER 'gst_user'@'localhost' IDENTIFIED BY 'gst_pass';

-- Step 2: Give this user full rights on your gst database
GRANT ALL PRIVILEGES ON gst.* TO 'gst_user'@'localhost';

-- Step 3: Apply changes
FLUSH PRIVILEGES;
