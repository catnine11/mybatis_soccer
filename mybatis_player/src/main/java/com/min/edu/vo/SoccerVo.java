package com.min.edu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SoccerVo {
	private String player_id    ;
	private String player_name  ;
	private String team_id      ;
	private String stadium_id   ;
	private String sche_date    ;
	private String gubun        ;
	private String hometeam_id  ;
	private String awayteam_id  ;
	private String home_score   ;
	private String away_score   ;

	
	private String region_name  ;
	private String team_name    ;
	private String e_team_name  ;
	private String orig_yyyy    ;
	private String zip_code1    ;
	private String zip_code2    ;
	private String address      ;
	private String ddd          ;
	private String tel          ;
	private String fax          ;
	private String homepage     ;
	private String owner        ;
	private String e_player_name;
	private String nickname     ;
	private String join_yyyy    ;
	private String position     ;
	private String back_no      ;
	private String nation       ;
	private String birth_date   ;
	private String solar        ;
	private String height       ;
	private String weight       ;

	private String stadium_name ;
	private String seat_count   ;

}
