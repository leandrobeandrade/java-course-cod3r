package connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = scan.nextInt();

		Connection connect = FabricaConexao.getConnection();
		String sql = "DELETE FROM pessoas WHERE codigo > ?";

		PreparedStatement stmt = connect.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if (contador > 0) {
			System.out.println("Pessoa excluída com sucesso!");
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Nada feito!");
		}

		stmt.close();
		connect.close();
		scan.close();
	}
}
