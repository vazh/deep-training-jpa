INSERT INTO country(id, iso_code2, iso_code3, name, num_code, phone_code, tld)
VALUES (gen_random_uuid(), 'BR', 'BRA', 'BRAZIL', '076', '000', '.br'),
       (gen_random_uuid(), 'ID', 'IDN', 'INDONESIA', '360', '062', '.id'),
       (gen_random_uuid(), 'IN', 'IND', 'INDIA', '356', '000', '.in'),
       (gen_random_uuid(), 'KR', 'KOR', 'KOREA', '410', '000', '.kr');