package com.min.edu.model;

import java.util.Map;

import com.min.edu.dto.Player_DTO;

public interface IPlayerIUDDao {
	public int insert01(Player_DTO dto);
	public int delete01(Map<String,Object>map);
	public int update01(Map<String, Object>map);
}
