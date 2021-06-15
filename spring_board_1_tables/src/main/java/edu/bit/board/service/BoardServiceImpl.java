package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList(){
		System.out.println("getList()..");
		return mapper.getList();
		
	}
}
