INSERT INTO country(id, iso_code2, iso_code3, name, num_code, phone_code, tld)
VALUES ('BR', 'BR', 'BRA', 'BRAZIL', '076', '000', '.br'),
       ('ID', 'ID', 'IDN', 'INDONESIA', '360', '062', '.id'),
       ('IN', 'IN', 'IND', 'INDIA', '356', '000', '.in'),
       ('KR', 'KR', 'KOR', 'KOREA', '410', '000', '.kr');

INSERT INTO province(id, country_id, name)
VALUES ('31', 'ID', 'DKI JAKARTA'),
       ('36', 'ID', 'BANTEN'),
       ('32', 'ID', 'JAWA BARAT'),
       ('33', 'ID', 'JAWA TENGAH'),
       ('34', 'ID', 'DI YOGYAKARTA'),
       ('35', 'ID', 'JAWA TIMUR'),
       ('51', 'ID', 'BALI'),
       ('52', 'ID', 'NUSA TENGGARA BARAT');

INSERT INTO city_regency(id, province_id, name, type)
VALUES (gen_random_uuid(), '31', 'Jakarta Utara', 'KOTA'),
       (gen_random_uuid(), '31', 'Jakarta Pusat', 'KOTA'),
       (gen_random_uuid(), '31', 'Jakarta Barat', 'KOTA'),
       (gen_random_uuid(), '31', 'Jakarta Timur', 'KOTA'),
       (gen_random_uuid(), '36', 'Serang', 'KOTA'),
       (gen_random_uuid(), '36', 'Tangerang Selatan', 'KOTA'),
       (gen_random_uuid(), '36', 'Tangerang', 'KOTA'),
       (gen_random_uuid(), '36', 'Tangerang', 'KAB'),
       (gen_random_uuid(), '32', 'Cirebon', 'KOTA'),
       (gen_random_uuid(), '32', 'Cimahi', 'KOTA'),
       (gen_random_uuid(), '32', 'Bandung', 'KOTA'),
       (gen_random_uuid(), '32', 'Depok', 'KOTA'),
       (gen_random_uuid(), '32', 'Tasikmalaya', 'KOTA'),
       (gen_random_uuid(), '32', 'Tasikmalaya', 'KAB'),
       (gen_random_uuid(), '32', 'Bekasi', 'KAB'),
       (gen_random_uuid(), '32', 'Bogor', 'KAB'),
       (gen_random_uuid(), '34', 'Yogyakarta', 'KOTA'),
       (gen_random_uuid(), '34', 'Bantul', 'KAB'),
       (gen_random_uuid(), '34', 'Gunung Kidul', 'KAB'),
       (gen_random_uuid(), '34', 'Sleman', 'KAB'),
       (gen_random_uuid(), '34', 'Kulon Progo', 'KAB'),
       (gen_random_uuid(), '35', 'Gresik', 'KOTA'),
       (gen_random_uuid(), '33', 'Semarang', 'KOTA'),
       (gen_random_uuid(), '33', 'Surakarta', 'KOTA'),
       (gen_random_uuid(), '31', 'Jakarta Selatan', 'KOTA'),
       (gen_random_uuid(), '31', 'Jakarta Selatan', 'KOTA');