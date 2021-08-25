CREATE TABLE IF NOT EXISTS adoptions (
                                  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                  name VARCHAR(30),
                                  yearOfBirth INT,
                                  location VARCHAR(30),
                                  INDEX(name)
) engine=InnoDB;


INSERT IGNORE INTO adoptions VALUES (1, 'Punky', 2021, 'Malaga');
INSERT IGNORE INTO adoptions VALUES (2, 'Drizzle', 2018, 'Seville');
INSERT IGNORE INTO adoptions VALUES (3, 'Patsy', 2016, 'Madrid');
INSERT IGNORE INTO adoptions VALUES (4, 'Dory', 2019, 'Zaragoza');
INSERT IGNORE INTO adoptions VALUES (5, 'Pancake', 2019, 'London');
