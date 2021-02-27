package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;



@WebServlet("/controller/indexController")
public class indexController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try {
			
			BoardDAO boardDAO = new BoardDAO();
			ArrayList<BoardDTO> boardList = boardDAO.getBoardList();
			
			resp.setContentType("text/html; charset=UTF-8");
			req.setAttribute("boardList", boardList);
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.include(req, resp);
		} catch (Exception e) {
			System.out.println("indexController 오류입니다.");
			e.printStackTrace();
		}
	
	}
}
