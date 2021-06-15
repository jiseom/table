package edu.bit.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.board.vo.BoardVO;

//무조건 mapper 는 interface 이다.
@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();

}
