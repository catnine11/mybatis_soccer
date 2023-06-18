package com.min.edu.model;

import java.util.List;

import com.min.edu.dto.Player_DTO;

public interface IPlayerSelectDao {
	

	public List<Player_DTO> select01(String player_id);
	public List<Player_DTO> select02(String team_name);
	
}
