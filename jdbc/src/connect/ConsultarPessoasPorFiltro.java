package connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasPorFiltro {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		
		Connection connect = FabricaConexao.getConnection();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		System.out.println("Informe o valor para a pesquisa: ");
		String valor = scan.nextLine();
		
		PreparedStatement stmt = connect.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoas> pessoas = new ArrayList<>();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoas(codigo, nome));
		}
		
		for (Pessoas pessoa : pessoas) {
			System.out.println(pessoa.getCodigo() + " ===> " + pessoa.getNome());
		}
		
		stmt.close();
		connect.close();
		scan.close();
	}

}
