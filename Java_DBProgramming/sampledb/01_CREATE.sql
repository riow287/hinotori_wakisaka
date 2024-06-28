/* DB作成 */
DROP DATABASE IF EXISTS sampledb;
CREATE DATABASE sampledb CHARACTER SET utf8 COLLATE utf8_general_ci;
 
/* ユーザを作成 */
DROP USER IF EXISTS sofdU;
CREATE USER sofdU IDENTIFIED BY 'sofdP';

/* 権限付与 */
GRANT ALL PRIVILEGES ON sampledb.* TO sofdU;

/* データベース指定 */
USE sampledb;

/* テーブル作成 */
CREATE TABLE m_employee
(
    code                        CHAR(6) PRIMARY KEY,
    name                        VARCHAR(15),
    age                         INT,
    section                     VARCHAR(15)
);
