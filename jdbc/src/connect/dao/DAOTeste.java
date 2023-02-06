package connect.dao;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Usuário 1"));
		System.out.println(dao.incluir(sql, "Usuário 2"));
		System.out.println(dao.incluir(sql, "Usuário 3"));
		
		dao.close();
	}
}
