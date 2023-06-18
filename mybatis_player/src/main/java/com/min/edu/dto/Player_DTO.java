package com.min.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Player_DTO {
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
	public Player_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player_DTO(String player_id, String player_name, String team_id, String stadium_id, String sche_date,
			String gubun, String hometeam_id, String awayteam_id, String home_score, String away_score,
			String region_name, String team_name, String e_team_name, String orig_yyyy, String zip_code1,
			String zip_code2, String address, String ddd, String tel, String fax, String homepage, String owner,
			String e_player_name, String nickname, String join_yyyy, String position, String back_no, String nation,
			String birth_date, String solar, String height, String weight, String stadium_name, String seat_count) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.team_id = team_id;
		this.stadium_id = stadium_id;
		this.sche_date = sche_date;
		this.gubun = gubun;
		this.hometeam_id = hometeam_id;
		this.awayteam_id = awayteam_id;
		this.home_score = home_score;
		this.away_score = away_score;
		this.region_name = region_name;
		this.team_name = team_name;
		this.e_team_name = e_team_name;
		this.orig_yyyy = orig_yyyy;
		this.zip_code1 = zip_code1;
		this.zip_code2 = zip_code2;
		this.address = address;
		this.ddd = ddd;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.owner = owner;
		this.e_player_name = e_player_name;
		this.nickname = nickname;
		this.join_yyyy = join_yyyy;
		this.position = position;
		this.back_no = back_no;
		this.nation = nation;
		this.birth_date = birth_date;
		this.solar = solar;
		this.height = height;
		this.weight = weight;
		this.stadium_name = stadium_name;
		this.seat_count = seat_count;
	}
	@Override
	public String toString() {
		return "Player_DTO [player_id=" + player_id + ", player_name=" + player_name + ", team_id=" + team_id
				+ ", stadium_id=" + stadium_id + ", sche_date=" + sche_date + ", gubun=" + gubun + ", hometeam_id="
				+ hometeam_id + ", awayteam_id=" + awayteam_id + ", home_score=" + home_score + ", away_score="
				+ away_score + ", region_name=" + region_name + ", team_name=" + team_name + ", e_team_name="
				+ e_team_name + ", orig_yyyy=" + orig_yyyy + ", zip_code1=" + zip_code1 + ", zip_code2=" + zip_code2
				+ ", address=" + address + ", ddd=" + ddd + ", tel=" + tel + ", fax=" + fax + ", homepage=" + homepage
				+ ", owner=" + owner + ", e_player_name=" + e_player_name + ", nickname=" + nickname + ", join_yyyy="
				+ join_yyyy + ", position=" + position + ", back_no=" + back_no + ", nation=" + nation + ", birth_date="
				+ birth_date + ", solar=" + solar + ", height=" + height + ", weight=" + weight + ", stadium_name="
				+ stadium_name + ", seat_count=" + seat_count + "]";
	}
	public String getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getStadium_id() {
		return stadium_id;
	}
	public void setStadium_id(String stadium_id) {
		this.stadium_id = stadium_id;
	}
	public String getSche_date() {
		return sche_date;
	}
	public void setSche_date(String sche_date) {
		this.sche_date = sche_date;
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getHometeam_id() {
		return hometeam_id;
	}
	public void setHometeam_id(String hometeam_id) {
		this.hometeam_id = hometeam_id;
	}
	public String getAwayteam_id() {
		return awayteam_id;
	}
	public void setAwayteam_id(String awayteam_id) {
		this.awayteam_id = awayteam_id;
	}
	public String getHome_score() {
		return home_score;
	}
	public void setHome_score(String home_score) {
		this.home_score = home_score;
	}
	public String getAway_score() {
		return away_score;
	}
	public void setAway_score(String away_score) {
		this.away_score = away_score;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getE_team_name() {
		return e_team_name;
	}
	public void setE_team_name(String e_team_name) {
		this.e_team_name = e_team_name;
	}
	public String getOrig_yyyy() {
		return orig_yyyy;
	}
	public void setOrig_yyyy(String orig_yyyy) {
		this.orig_yyyy = orig_yyyy;
	}
	public String getZip_code1() {
		return zip_code1;
	}
	public void setZip_code1(String zip_code1) {
		this.zip_code1 = zip_code1;
	}
	public String getZip_code2() {
		return zip_code2;
	}
	public void setZip_code2(String zip_code2) {
		this.zip_code2 = zip_code2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getE_player_name() {
		return e_player_name;
	}
	public void setE_player_name(String e_player_name) {
		this.e_player_name = e_player_name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJoin_yyyy() {
		return join_yyyy;
	}
	public void setJoin_yyyy(String join_yyyy) {
		this.join_yyyy = join_yyyy;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBack_no() {
		return back_no;
	}
	public void setBack_no(String back_no) {
		this.back_no = back_no;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getSolar() {
		return solar;
	}
	public void setSolar(String solar) {
		this.solar = solar;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getStadium_name() {
		return stadium_name;
	}
	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}
	public String getSeat_count() {
		return seat_count;
	}
	public void setSeat_count(String seat_count) {
		this.seat_count = seat_count;
	}
	
}
