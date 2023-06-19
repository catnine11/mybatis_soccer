SELECT * FROM PLAYER2
WHERE PLAYER_NAME='태승';
ALTER TABLE RETIRE_PLAYER ADD RETIRE_DATE DATE;
ALTER TABLE RETIRE_PLAYER DROP COLUMN RTIRE_DATE;

CREATE TABLE RETIRE_PLAYER AS SELECT * FROM PLAYER2 p ;

SELECT * FROM RETIRE_PLAYER;


TRUNCATE TABLE RETIRE_PLAYER ;

CREATE OR REPLACE TRIGGER PLAYER_RTR
AFTER DELETE ON PLAYER2
FOR EACH ROW 
BEGIN 
  IF DELETING THEN
    INSERT INTO RETIRE_PLAYER(
    PLAYER_ID,
    PLAYER_NAME,
    TEAM_ID,
    JOIN_YYYY,
    POSITION,
    BACK_NO,
    BIRTH_DATE,
    RETIRE_DATE
    )
    VALUES (
        :OLD.PLAYER_ID,
        :OLD.PLAYER_NAME, 
        :OLD.TEAM_ID,
        :OLD.JOIN_YYYY,
        :OLD.POSITION,
        :OLD.BACK_NO,
        :OLD.BIRTH_DATE,
        SYSDATE
      );
  END IF;
END RETIRE_PLAYER;


DELETE FROM PLAYER2
WHERE PLAYER_ID='2016178';

INSERT INTO PLAYER2 p 
(PLAYER_ID,PLAYER_NAME,TEAM_ID)VALUES('2016178','태승','K07');


CREATE OR REPLACE TRIGGER PLAYER_RTR
AFTER DELETE ON PLAYER2
FOR EACH ROW 
BEGIN 
  IF DELETING THEN
    INSERT INTO RETIRE_PLAYER(
     PLAYER_ID,
    PLAYER_NAME,
    TEAM_ID,
    JOIN_YYYY,
    POSITION,
    BACK_NO,
    NATION,
    BIRTH_DATE,
    RETIRE_DATE
    )
    VALUES (
        :OLD.PLAYERID,
        :OLD.PLAYER_NAME,
        :OLD.TEAM_ID,
        :OLD.JOIN_YYYY,
        :OLD.POSITION,
        :OLD.BACK_NO,
        :OLD.NATION,
        :OLD.BIRTH_DATE,
        SYSDATE
      );
  END IF;
END RETIRE_PLAYER;
