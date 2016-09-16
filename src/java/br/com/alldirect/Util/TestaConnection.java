/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.Util;

import br.com.alldirect.Dao.ProdutoDao;
import br.com.alldirect.Model.Produto;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
    public class TestaConnection {
  
    
    public static void main(String args[]) throws SQLException{
    	Produto produto = new Produto();
    	produto.setNome("Allien ware");
    	produto.setDescricao("I10");
    	produto.setPreco(3000.85);
    	
    	ProdutoDao produtodao = new ProdutoDao();
    	
    	produtodao.adicionaProduto(produto);
    }
}
