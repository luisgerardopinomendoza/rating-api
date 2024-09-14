DROP TABLE IF EXISTS rating;

CREATE TABLE rating (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
book_id BIGINT NOT NULL,
stars INT NOT NULL CHECK (stars >= 1 AND stars <= 5)
);
INSERT INTO rating (id, book_id, stars) VALUES (1, 1, 5);
INSERT INTO rating (id, book_id, stars) VALUES (2, 2, 4);
INSERT INTO rating (id, book_id, stars) VALUES (3, 3, 3);
INSERT INTO rating (id, book_id, stars) VALUES (4, 4, 5);
INSERT INTO rating (id, book_id, stars) VALUES (5, 5, 4);
INSERT INTO rating (id, book_id, stars) VALUES (6, 6, 5);
INSERT INTO rating (id, book_id, stars) VALUES (7, 7, 3);
INSERT INTO rating (id, book_id, stars) VALUES (8, 8, 4);
INSERT INTO rating (id, book_id, stars) VALUES (9, 9, 5);
INSERT INTO rating (id, book_id, stars) VALUES (10, 10, 2);
INSERT INTO rating (id, book_id, stars) VALUES (11, 11, 4);
INSERT INTO rating (id, book_id, stars) VALUES (12, 12, 5);
INSERT INTO rating (id, book_id, stars) VALUES (13, 13, 3);
INSERT INTO rating (id, book_id, stars) VALUES (14, 14, 4);
INSERT INTO rating (id, book_id, stars) VALUES (15, 15, 5);
INSERT INTO rating (id, book_id, stars) VALUES (16, 16, 3);
INSERT INTO rating (id, book_id, stars) VALUES (17, 17, 4);
INSERT INTO rating (id, book_id, stars) VALUES (18, 18, 5);