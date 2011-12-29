package org.ndp.psylab.site.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ndp.psylab.model.Template;

/**
 * Servlet implementation class BeerSelect
 */
public class TemplateSelect extends HttpServlet
{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
      String color = request.getParameter("color");
      Template beerExpert = new Template();
      List<? extends Object> result = beerExpert.getBrands(color);
      
//      response.setContentType("text/html");
//      PrintWriter out = response.getWriter();
//      out.println("Beer Selection Advice");

//      Iterator<? extends Object> iterator = result.iterator();
//      while (iterator.hasNext())
//      {
//         out.print("<br>try: " + iterator.next());
//      }
      
      request.setAttribute("styles", result);
      
      RequestDispatcher view = request.getRequestDispatcher("result.jsp");
      
      view.forward(request, response);
   }

}
