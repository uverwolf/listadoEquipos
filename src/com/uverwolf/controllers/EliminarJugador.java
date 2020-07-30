package com.uverwolf.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.uverwolf.models.Jugador;

/**
 * Servlet implementation class EliminarJugador
 */
@WebServlet("/EliminarJugador")
public class EliminarJugador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarJugador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		String nombre= request.getParameter("nombre");
		@SuppressWarnings("unchecked")
		ArrayList<Jugador> listado= (ArrayList<Jugador>) sesion.getAttribute("Ljugadores");
		
		for(int i=0;i<listado.size();i++) {
			if(listado.get(i).getEquipo().equals(sesion.getAttribute("nombreEquipo")) && listado.get(i).getPrimerNombre().equals(nombre)) {
				listado.remove(i);
				response.sendRedirect("/ListadoEquipos/Home");
			}
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
