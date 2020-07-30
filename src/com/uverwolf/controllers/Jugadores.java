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

import com.uverwolf.models.Jugador;

/**
 * Servlet implementation class Jugadores
 */
@WebServlet("/Jugadores")
public class Jugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jugadores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session.getAttribute("nombreEquipo") != null) {
			RequestDispatcher vista = request.getRequestDispatcher("WEB-INF/views/nuevoJugador.jsp");
			vista.forward(request, response);
	
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		int edad= Integer.parseInt(request.getParameter("edad"));
	
		Jugador jugador= new Jugador(nombre,apellido,edad);
		jugador.setEquipo((String) session.getAttribute("nombreEquipo"));
		ArrayList<Jugador> jugadoresArray=  (ArrayList<Jugador>) session.getAttribute("Ljugadores");
		jugadoresArray.add(jugador);
		session.setAttribute("jugadoresArray", jugadoresArray);
		response.sendRedirect("/ListadoEquipos/Home");
		
	}

}
