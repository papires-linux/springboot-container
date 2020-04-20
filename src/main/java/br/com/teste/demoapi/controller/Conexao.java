package br.com.teste.demoapi.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String host = System.getenv("BANCO_HOST");
	private String user = System.getenv("BANCO_USER");
	private String password = System.getenv("BANCO_PWD");
	private String banco = System.getenv("BANCO_NOME");
		
	public String getStatusConexao() {
		try (Connection connection = DriverManager
				.getConnection("jdbc:postgresql://"+this.host+":5432/"+this.banco, this.user, this.password)) {
			System.out.println("Java JDBC PostgreSQL Example");
			System.out.println("Connected to PostgreSQL database!");
			return "Conexão com Sucesso";
		}catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
			return "Conexao com erro: "+ e.getMessage();
		}
	}
}
