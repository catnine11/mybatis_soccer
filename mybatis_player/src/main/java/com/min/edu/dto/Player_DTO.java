package com.min.edu.dto;

public class Player_DTO {

	private String team_id;
	private String height;
	public Player_DTO() {
		super();
		
	}
	public Player_DTO(String team_id, String height) {
		super();
		this.team_id = team_id;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Player_DTO [team_id=" + team_id + ", height=" + height + "]";
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	
}
