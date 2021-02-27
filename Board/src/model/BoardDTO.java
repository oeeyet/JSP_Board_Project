package model;

import java.sql.Date;

public class BoardDTO {
	int boardNum;
	String boardTItle;
	String boardAuthor;
	Date boardCreateDate;
	int boardViews;
	
	
	public int getBoardNum() {
		return boardNum;
	}
	public BoardDTO setBoardNum(int boardNum) {
		this.boardNum = boardNum;
		return this;
	}
	public String getBoardTItle() {
		return boardTItle;
	}
	public BoardDTO setBoardTItle(String boardTItle) {
		this.boardTItle = boardTItle;
		return this;
	}
	public String getBoardAuthor() {
		return boardAuthor;
	}
	public BoardDTO setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
		return this;
	}
	public Date getBoardCreateDate() {
		return boardCreateDate;
	}
	public BoardDTO setBoardCreateDate(Date boardCreateDate) {
		this.boardCreateDate = boardCreateDate;
		return this;
	}
	public int getBoardViews() {
		return boardViews;
	}
	public BoardDTO setBoardViews(int boardViews) {
		this.boardViews = boardViews;
		return this;
	}
	
}
