package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.UserDao;
import Dto.Note;
import Dto.User;
@WebServlet("/addnotes")
public class Add_notes extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		String description=req.getParameter("description");
		HttpSession session=req.getSession();
		User user=(User) session.getAttribute("success");
		
		Note note=new Note();
		note.setTitle(title);
		note.setDescription(description);
		
		List<Note> list=new ArrayList<Note>();
		list.add(note);
		
		user.setNotes(list);
		note.setUsers(user);
		
		UserDao dao=new UserDao();
		dao.SaveAndUpdateUser(user);
		
		session.setAttribute("added", "Notes added Successfully");
		resp.sendRedirect("home.jsp");
	

	}
}
