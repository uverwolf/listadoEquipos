package com.uverwolf.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.uverwolf.models.Equipo;
import com.uverwolf.models.Jugador;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if( session ==null) {
			 session = request.getSession();
			ArrayList<Equipo> equipos = new ArrayList<Equipo>();
			session.setAttribute("arrayEquipos", equipos);
			ArrayList<Jugador> listadoJugadores = new ArrayList<Jugador>();
			session.setAttribute("Ljugadores",listadoJugadores);
		}

		
		RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/views/Home.jsp");
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher vista = request.getRequestDispatcher("");
		vista.forward(request, response);
	}

}
