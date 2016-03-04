package com.egen.eros;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class useractions
 */
@WebServlet(name = "Useractions", urlPatterns = { "/Useractions" })
public class useractions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public useractions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    String id= request.getParameter("id");
	    String idforUser=request.getParameter("idofuser");
	    ClientRs client =new ClientRs();
	    RequestDispatcher rd;
	    if(id!=null){
	    client.deletebyId(id);
	    request.setAttribute("DeleteMessage", "The user is deleted with "+id+" from the EROS ");
	    rd= request.getRequestDispatcher("/thankYou.jsp");
	    rd.forward(request, response);
		}
		else if(idforUser != null)
		{
			User user= client.UserbyId(idforUser);
			request.setAttribute("user", user);
			rd= request.getRequestDispatcher("/DisplayUsers.jsp");
		    rd.forward(request, response);
		}
		
	}

}
