/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.Servlet;

import br.com.alldirect.Dao.ProdutoDao;
import br.com.alldirect.Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
     @Override

     
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
    	 
    	 String nome = request.getParameter("nome");
    	 String descricao = request.getParameter("descricao");
    	 Double preco = Double.parseDouble(request.getParameter("precoproduto"));
    	 
    	 
    	 
    	 Produto produto = new Produto();
    	 produto.setNome(nome);
    	 produto.setDescricao(descricao);
    	 produto.setPreco(preco);
    	 
    	 ProdutoDao produtodao = new ProdutoDao();
    	 produtodao.adicionaProduto(produto);
    	 
}
}