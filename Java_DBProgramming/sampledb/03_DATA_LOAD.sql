/* サーバ�?�のローカル�?ータロード機�?�を有効化す�? */
SET GLOBAL local_infile= 1;

/* クライアント�?�スト上�?��?ータファイルをテーブルにロードす�? */ 
LOAD DATA LOCAL INFILE "C:\\workspace\\hinotori_wakisaka\\Java_DBProgramming\\sampledb\\02_DATA.csv"
INTO TABLE sampledb.m_employee FIELDS TERMINATED BY ","
LINES TERMINATED BY "\r\n";

/* サーバ�?�のローカル�?ータロード機�?�を無効化す�? */
SET GLOBAL local_infile= 0;