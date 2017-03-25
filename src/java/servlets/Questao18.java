/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pkg.Pessoa;

/**
 *
 * @author Fabin_000
 */
@WebServlet(name = "Questao18", urlPatterns = {"/questao18"})
public class Questao18 extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        for(int i = 0; i <= 9; i++){
            Pessoa pessoa = new Pessoa();
            String nome =request.getParameter("nome"+(i+1));
            int idade = Integer.valueOf(request.getParameter("idade"+(i+1)));
            float altura = Float.parseFloat(request.getParameter("altura"+(i+1)));
            pessoa.setIdade(idade);
            pessoa.setNome(nome);
            pessoa.setAltura(altura);
            pessoas.add(pessoa);
        }
            
            int maior = 0;
            float maiorAltura = 0.0f;
            Pessoa maisVelho = new Pessoa();
            Pessoa maisAlto = new Pessoa();
        
            for(Pessoa p: pessoas){
                if(p.getIdade() > maior){
                    maior = p.getIdade();
                    maisVelho = p;
                }
                if(p.getAltura() > maiorAltura){
                    maiorAltura = p.getAltura();
                    maisAlto = p;
                }
            }
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Questao18</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mais velho</h1>");
            out.println("<h3>Nome </h3>"+maisVelho.getNome()+"<br>");
            out.println("<h3>Idade </h3>"+maisVelho.getIdade()+"<br>");
            out.println("<h1>Mais alto</h1>");
            out.println("<h3>Nome </h3>"+maisAlto.getNome()+"<br>");
            out.println("<h3>Altura </h3>"+maisAlto.getAltura()+"<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
