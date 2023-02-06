package connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o código da pessoa: ");
		int codigo = scan.nextInt();

		Connection connect = FabricaConexao.getConnection();
		String sqlSelect = "SELECT * FROM pessoas WHERE codigo= ?";
		String sqlUpdate = "UPDATE pessoas SET nome= ? WHERE codigo = ?";

		PreparedStatement stmt = connect.prepareStatement(sqlSelect);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) {
			Pessoas p = new Pessoas(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("Nome atual é: " + p.getNome());
			scan.nextLine();
			System.out.println("Informe um novo nome: " );
			String novoNome = scan.nextLine();
			
			stmt.close();
			stmt = connect.prepareStatement(sqlUpdate);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}

		connect.close();
		scan.close();
	}

}
