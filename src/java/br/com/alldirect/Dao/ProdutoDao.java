/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.Dao;

import br.com.alldirect.Connection.ConnectionFactory;
import br.com.alldirect.Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */

    public class ProdutoDao {
       private Connection connection;

	public ProdutoDao(){
		this.connection = new ConnectionFactory().getConnection();
		
		
	}
	public void adicionaProduto(Produto produto){
		String sql = "INSERT INTO PRODUTOS(NOME,DESCRICAO,PRECO)VALUES(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql); 
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void removerProduto(){
		
	}
	public void listarProduto(){
		
	}
	public void alterarProduto(){
		
	}
}
