package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rubypaper.domain.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.rubypaper.domain.BoardVO;

@RestController
public class BoardController {
    public BoardController() {
        System.out.println("===> BoardController 생성");
    }

    //http://localhost:8080/hello?name=asdf > Hello : asdf
    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello : " + name;
    }

    //단일 json 출력
    @GetMapping("/getBoard")
    public BoardVO getBoard() {
        BoardVO board = new BoardVO();

        board.setCnt(0);
        board.setContent("content");
        board.setCreateDate(new Date());
        board.setSeq(1);
        board.setTitle("title");
        board.setWriter("writer");

        return board;
    }

    //리스트 객체를 리턴하면 다중 json 출력
    @GetMapping("/getBoardList")
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = new ArrayList<BoardVO>();

        for (int i = 1; i <= 10; i++) {

            BoardVO board = new BoardVO();
            board.setCnt(0);
            board.setContent("content");
            board.setCreateDate(new Date());
            board.setSeq(i);
            board.setTitle("title");
            board.setWriter("writer");
            boardList.add(board);
        }
        return boardList;
    }
}