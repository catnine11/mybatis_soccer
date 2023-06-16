--특정일을 입력하면 그 날 경기한 팀의 이름과 결과를 출력한다 sel_sch

SELECT T1.TEAM_NAME AS HOME_TEAM,
		T2.TEAM_NAME AS AWAY_TEAM,
		S.HOME_SCORE,
		S.AWAY_SCORE
	FROM SCHEDULE S
		INNER JOIN TEAM T1 ON S.HOMETEAM_ID = T1.TEAM_ID
		INNER JOIN TEAM T2 ON S.AWAYTEAM_ID = T2.TEAM_ID
	WHERE S.SCHE_DATE = '20120818'
	ORDER BY T1.TEAM_NAME ASC, T2.TEAM_NAME;

--각 팀별 가장 오래 활동한 선수의 이름과 닉네임, 기간을 출력한다(닉네임없으면 없음으로, 활동기간 NULL이면 안 뜨게) sel_nickname
SELECT
    PLAYER_NAME,
    TEAM_NAME,
    ACTIVITY_PERIOD,
    PLAYER_NICKNAME
FROM (
    SELECT
        P.PLAYER_NAME,
        T.TEAM_NAME,
        COALESCE(EXTRACT(YEAR FROM SYSDATE) - TO_NUMBER(SUBSTR(P.JOIN_YYYY, 1, 4)), 0) AS ACTIVITY_PERIOD,
        COALESCE(P.NICKNAME, '없음') AS PLAYER_NICKNAME,
        ROW_NUMBER() OVER (PARTITION BY T.TEAM_NAME ORDER BY P.JOIN_YYYY ASC) AS RN
    FROM
        PLAYER P
        INNER JOIN TEAM T ON P.TEAM_ID = T.TEAM_ID
)
WHERE RN = 1;





--각 팀별 가장 오래 활동한 선수의 닉네임을 입력한다(0년차) insert_nickname






--원정팀일 때 승률이 가장 높은 팀이 출력된다 sel_highwinning






--특정 등번호를 입력하면 각 팀 별 등번호를 가진 선수의 이름과 팀이름, 포지션이 출력된다 sel_backno





--팀별 인원을 확인하는 테이블에서 선수의 이적 결과에 따라 팀별 인원이 변동된다.



