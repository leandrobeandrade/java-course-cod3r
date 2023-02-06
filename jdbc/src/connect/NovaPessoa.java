package connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inform o nome: ");
		String nome = scan.nextLine();
		
		Connection connect = FabricaConexao.getConnection();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = connect.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pesssoa incluída com sucesso!");
		
		connect.close();
		scan.close();
	}

}
