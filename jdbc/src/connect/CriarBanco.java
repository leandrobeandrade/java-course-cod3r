package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "Leandro.42624640258";
		
		Connection connect = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = connect.createStatement();
		stmt.execute("CREATE DATABASE curso_java_cod3er");
		
		System.out.println("Banco criado com sucesso!");
		connect.close();
	}

}
