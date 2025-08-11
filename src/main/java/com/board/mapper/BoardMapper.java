package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

//import com.board.controller.boardDTO;
import com.board.domain.BoardDTO;
import com.board.menus.domain.MenuDTO;

@Mapper
public interface BoardMapper {

	List<BoardDTO> getBoardList(MenuDTO menuDto);

	void insertBoard(BoardDTO boardDto);

	BoardDTO getBoardData(BoardDTO boardDto);

	void updateBoard(BoardDTO boardDto);
	
	void deleteBoard(BoardDTO boardDto);

//	List<BoardDTO> getCategoryData();

}
