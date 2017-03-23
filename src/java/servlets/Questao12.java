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
@WebServlet(name = "Questao12", urlPatterns = {"/questao12"})
public class Questao12 extends HttpServlet {
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
        
        for(int i = 0; i <= 4; i++){
            Pessoa pessoa = new Pessoa();
            String nome =request.getParameter("nome"+(i+1));
            int idade = Integer.valueOf(request.getParameter("idade"+(i+1)));
            pessoa.setIdade(idade);
            pessoa.setNome(nome);
            pessoas.add(pessoa);
        }
            
            int maior = 0;
            int somaIdades = 0;
            Pessoa maisVelho = new Pessoa();
        
            for(Pessoa p: pessoas){
                if(p.getIdade() > maior)
                    maisVelho = p;
                somaIdades += p.getIdade();             
            }
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Questao12</title>");            
            out.println("</head>");
            out.println("<h1>A soma das idades eh: "+ somaIdades +"</h1>");
            out.println("<h2>"+ maisVelho.getNome() + " eh o mais velho, sua idade eh: "
                       +maisVelho.getIdade()+"</h2>");
            out.println("<body>");
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
