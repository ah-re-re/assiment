`nha-dat-ban`CREATE database quản_lý_máy_bay;
use quản_lý_máy_bay;
CREATE TABLE nhan_vien (

    Manhanvien NCHAR(10) not null,
    ten CHAR(100)not null,
    tuoi NCHAR(100)not null,
    ngaysinh CHAR(100)not null,
    bo_phan NCHAR(100)not null ,
    chuc_vu nchar(100) not null
    );
    insert into nhan_vien(Manhanvien, ten, tuoi, ngaysinh, bo_phan, chuc_vu)
	values ('100AB', 'anh1', '26', '1996/7/4', 'sale', 'nv');
	insert into nhan_vien(Manhanvien, ten, tuoi, ngaysinh, bo_phan, chuc_vu)
	values ('100AC', 'anh2', '27', '1993/6/5', 'sale', 'nv');
	insert into nhan_vien(Manhanvien, ten, tuoi, ngaysinh, bo_phan, chuc_vu)
    values ('100AD', 'anh3', '25', '1995/5/6', 'sale', 'nv');
	insert into nhan_vien(Manhanvien, ten, tuoi, ngaysinh, bo_phan, chuc_vu)
    values ('100AE', 'anh4', '25', '1995/4/7', 'sale', 'nv');
	insert into nhan_vien(Manhanvien, ten, tuoi, ngaysinh, bo_phan, chuc_vu)
    values ('100AF', 'anh5', '24', '1996/3/8', 'sale', 'nv');
    SELECT Manhanvien, ten, bo_phan FROM nhan_vien;
    
    drop table quanly;
    CREATE TABLE quanly (
    maquanly INT AUTO_INCREMENT PRIMARY KEY,
    ten NCHAR(100)not null,
    tuoi NCHAR(100)not null,
    ngaysinh CHAR(100)not null,
    bophan NCHAR(100)not null 
    );
    insert into quanly (maquanly, ten, tuoi, ngaysinh, bophan)
	values ('10', 'võ tòng1', '30', '1991/3/11', 'quanly');
	insert into quanly (maquanly, ten, tuoi, ngaysinh, bophan)
	values ('13', 'võ tòng2', '36', '1985/3/12', 'quanly');
	insert into quanly (maquanly, ten, tuoi, ngaysinh, bophan)
    values ('155', 'võ tòng3', '35', '1986/6/11', 'quanly');    
	SELECT maquanly, ten, bo_phan FROM quanly;
    select bo_phan from nhan_vien;
    CREATE VIEW nhan_vien AS
    SELECT * FROM nhan_vien;
    SELECT ten FROM nhan_vien
	WHERE ten LIKE 'võ tòng';
    SELECT date_time, 
		CASE
			WHEN date_time > '19:30' THEN 'huy'
			ELSE 'them'
			END AS QuantityText
    FROM chuyến_bay;
	SELECT mã_chuyến_bay FROM chuyến_bay
	WHERE mã_chuyến_bay LIKE 'MH369';
    SELECT SUM(tên)
	FROM Khach_hang;
    SELECT SUM    
	FROM chuyến_bay;
    SELECT lượng_khách  FROM máy_bay
	WHERE lượng_khách LIKE '10%';
    
    CREATE TABLE Khach_hang (
    mã_khách_hàng NCHAR(100) not null ,
    tên NCHAR(100)not null,
    tuổi NCHAR(100)not null,
    hạng_khách CHAR(100)not null
    );
    
    insert into Khach_hang ( mã_khách_hàng, tên , tuổi, hạng_khách)
	values ('12AC', 'ho', '5', 'thuong');
    insert into Khach_hang ( mã_khách_hàng, tên , tuổi, hạng_khách)
	values ('12AB', 'hen', '5', 'vip');
    insert into Khach_hang ( mã_khách_hàng, tên , tuổi, hạng_khách)
    values ('12AV', 'cuong', '5', 'thuong');
    insert into Khach_hang ( mã_khách_hàng, tên , tuổi, hạng_khách)
	values ('12AR', 'hoc', '5', 'thuong');
    insert into Khach_hang ( mã_khách_hàng, tên , tuổi, hạng_khách)
    values ('12AT', 'hop', '5', 'vip'); 
    SELECT mã_khách_hàng, tên, hạng_khách FROM Khach_hang;
    SELECT *  FROM chuyến_bay
	WHERE date_time LIKE '2022/7/1' and'19:30';
	SELECT *  FROM chuyến_bay
	WHERE vị_trí_dỗ_máy_bay LIKE 'hanoi' and 'tokyo';
    SELECT giá_vé  FROM ve
	WHERE giá_vé LIKE '2%';
	SELECT hãng_máy_bay  FROM máy_bay
	WHERE hãng_máy_bay LIKE 'bamboo';
    SELECT phổ_biến ,hãng_máy_bay  FROM máy_bay
	WHERE phổ_biến LIKE '1';
    DELETE FROM Khach_hang WHERE mã_khách_hàng='12AB';
    
    drop table máy_bay;
	CREATE TABLE máy_bay (
	hãng_máy_bay NCHAR(100) not null,
    số_hiệu NCHAR(100) primary key ,
    Số_ghế NCHAR(100)not null,
    lượng_khách int not null ,
    phổ_biến char not null
    );  
    insert into máy_bay ( hãng_máy_bay, số_hiệu , Số_ghế, lượng_khách, phổ_biến)
	values ('VietName Airlines','QZN', '2000000', '100000', '1');
    insert into máy_bay ( hãng_máy_bay, số_hiệu , Số_ghế, lượng_khách, phổ_biến)
	values ('Bamboo Airway', 'GAM', 3000000, 2000, '1');
    insert into máy_bay ( hãng_máy_bay, số_hiệu , Số_ghế, lượng_khách, phổ_biến)
	values ('VietJet Air', 'GNH', 4000000, ' 500', '0'); 
    SELECT Số_ghế FROM máy_bay 
    WHERE Số_ghế ;
    
	CREATE TABLE ve (
    giá_vé float not null ,
    mã_vé NCHAR(100) not null ,
    mã_ghế NCHAR(100)not null,
    date_time NCHAR(100)not null,
    số_hiệu CHAR(100)not null,
    mã_máy_bay NCHAR(100) not null
    );
    insert into ve( giá_vé, mã_vé, mã_ghế , date_time, số_hiệu, mã_máy_bay)
	values ('900000.00', 'C067F', '07', '2022/7/1', 'QZN', '12LA');
     insert into ve( giá_vé, mã_vé, mã_ghế , date_time, số_hiệu, mã_máy_bay)
	values ('800000', 'C067E', '08', '2022/7/1', 'GAM', '26SL');
	insert into ve( giá_vé, mã_vé, mã_ghế , date_time, số_hiệu, mã_máy_bay)
    values ('70000', 'C067F', '08', '2022/7/1', 'GNH', '29HN'); 
    SELECT * FROM máy_bay
    ORDER BY date_time;
    SELECT SUM(giá_vé)
	FROM ve;
    UPDATE ve
SET giá_vé = '80000992', mã_ghế = '123'
WHERE số_hiệu = 'GAM';
    drop table chuyến_bay;
   CREATE TABLE chuyến_bay (
    mã_chuyến_bay NCHAR(100) not null ,
    vị_trí_dỗ_máy_bay NCHAR(100)not null,
    date_time NCHAR(100)not null,
    số_hiệu CHAR(100) primary key,
    cổng_lên_máy_bay NCHAR(100) not null
    ); 
    insert into chuyến_bay (  mã_chuyến_bay, vị_trí_dỗ_máy_bay , date_time, số_hiệu, cổng_lên_máy_bay)
	values ('a01', 'đb01', '2022/7/1' , 'QZN', ' 1');
    insert into chuyến_bay (  mã_chuyến_bay, vị_trí_dỗ_máy_bay , date_time, số_hiệu, cổng_lên_máy_bay)
	values ('a05', 'đb01', ' 2022/7/1', 'GAM', ' 2');
    insert into chuyến_bay (  mã_chuyến_bay, vị_trí_dỗ_máy_bay , date_time, số_hiệu, cổng_lên_máy_bay)
    values ('c01', 'đb03', ' 2022/7/1', 'GNH', ' 3'); 
    SELECT * FROM chuyến_bay
    ORDER BY số_hiệu DESC;
    
    SELECT * FROM chuyến_bay;
 USE ve;

DROP PROCEDURE IF EXISTS Tìm_Vé;
DELIMITER //
CREATE PROCEDURE Tìm_Vé (
	OUT param1 INT
) 
BEGIN
	SELECT  COUNT(*) INTO param1 FROM ve;
END //
DELIMITER ; 
CALL Tìm_Vé(@a);
SELECT @a;

create TRIGGER trigger_maybay 
    BEFORE UPDATE ON máy_bay
    FOR EACH ROW 
 INSERT INTO máy_bay
 SET action = 'update',
     hãng_máy_bay = OLD.hãng_máy_bay,
     số_hiệu = OLD.số_hiệu,
     lượng_khách = NOW();
SHOW TRIGGERS;

UPDATE máy_bay
SET
hãng_máy_bay = 'Bamboo Airway'
  
WHERE
      số_hiệu = '123';

SELECT * FROM máy_bay;

SELECT máy_bay.hãng_máy_bay, ve.giá_vé
FROM  máy_bay
INNER JOIN ve ON máy_bay.số_hiệu = ve.số_hiệu;

select chuyến_bay.mã_chuyến_bay, ve.date_time
from chuyến_bay
left join ve
on chuyến_bay.date_time=ve.date_time
order by chuyến_bay.mã_chuyến_bay;
