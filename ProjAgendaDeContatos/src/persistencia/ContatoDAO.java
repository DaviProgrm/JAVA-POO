package persistencia;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dominio.Contato;

public class ContatoDAO {
	private Conexao c;
	private String REL = "select * from \"Contato\"";

	
	public ContatoDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/BDAgenda","postgres","123");
	}
	
	public ArrayList<Contato> emitirRelatorio() {
		Contato pessoa;
		ArrayList<Contato> lista = new ArrayList<Contato>();
		try {
			c.conectar(); // se conecta com o bd
			Statement instrucao = c.getConexao().createStatement(); // "new" do Statement - cria uma instrução
			ResultSet rs = instrucao.executeQuery(REL);
			while(rs.next()) { //andando no resultset
				pessoa = new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("tel"), rs.getString("email"));
				lista.add(pessoa);
			}
			c.desconectar(); //se desconecta com o bd
		}catch(Exception e) {
			System.out.println("Erro no relatório");
		}
		return lista;
	}
	
}
