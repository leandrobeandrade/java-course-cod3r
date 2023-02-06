package connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
	public static void main(String[] args) throws SQLException {
		Connection connect = FabricaConexao.getConnection();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = connect.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
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
	}
}
