DROP TABLE IF EXISTS STATS;
CREATE TABLE STATS (
                 STAT_ID INT(11) AUTO_INCREMENT,
                 STAT_DATE DATETIME NOT NULL,
                 STAT VARCHAR(20) NOT NULL,
                 VALUE INT(11) NOT NULL,
                 PRIMARY KEY (STAT_ID)
             );

DROP VIEW IF EXISTS BESTSELLERS_COUNT;
CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(*) AS BESTSELLERS_COUNT FROM BOOKS
WHERE BESTSELLER = 1;

USE KODILLA_COURSE;

DROP EVENT IF EXISTS UPDATE_BESTSELLERS;
CREATE EVENT UPDATE_BESTSELLERS
    ON SCHEDULE EVERY 1 MINUTE
    DO
    CALL UpdateBestsellers();

DROP EVENT IF EXISTS UPDATE_STATS;
CREATE EVENT UPDATE_STATS
    ON SCHEDULE EVERY 1 MINUTE
    DO
    BEGIN
        DECLARE BESTSELLERS_COUNT INT;
        SELECT * FROM BESTSELLERS_COUNT
        INTO BESTSELLERS_COUNT;
        INSERT INTO STATS (STAT_DATE, STAT, VALUE) values (CURRENT_DATE(),'BESTSELLERS', BESTSELLERS_COUNT);
    END;

SELECT * FROM STATS;