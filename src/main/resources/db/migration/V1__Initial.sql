CREATE TABLE IF NOT EXISTS `bank_transaction` (
    `uuid` UUID DEFAULT RANDOM_UUID() NOT NULL PRIMARY KEY,
    `action` VARCHAR(20),
    `value` DOUBLE,
    `last_modified_date` DATETIME
);
