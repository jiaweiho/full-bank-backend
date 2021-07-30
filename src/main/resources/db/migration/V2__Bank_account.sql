CREATE TABLE IF NOT EXISTS `balance_account` (
    `uuid` UUID DEFAULT RANDOM_UUID() NOT NULL PRIMARY KEY,
    `aggregate_id` UUID,
    `name` VARCHAR(20),
    `balance` DOUBLE,
    `last_modified_date` DATETIME
);