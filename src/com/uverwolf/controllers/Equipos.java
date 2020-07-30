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
@SuppressWarnings("unchecked")
/**
 * Servlet implementation class Equipos
 */
@WebServlet("/Equipos")
public class Equipos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Equipos() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("nombre")!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("nombreEquipo", request.getParameter("nombre"));

			
			
			RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/views/DetallesEquipo.jsp");
			vista.forward(request, response);
		
		
		
		}else {
			RequestDispatcher vista = request.getRequestDispatcher("/WEB-INF/views/nuevoEquipo.jsp");
			vista.forward(request, response);
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String nombreE= request.getParameter("nombre");
		
		Equipo equipo = new Equipo();
		equipo.setNombre(nombreE);
		
		
		
		ArrayList<Equipo> equipoActual=(ArrayList<Equipo>) session.getAttribute("arrayEquipos");
		
		equipoActual.add(equipo);
		
		session.setAttribute("equipos", equipoActual);
		session.setAttribute("largo", equipoActual.size());
		
		
		response.sendRedirect("/ListadoEquipos/Home");
	}

}
