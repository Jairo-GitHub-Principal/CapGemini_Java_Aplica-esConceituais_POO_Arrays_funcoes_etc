package cadastro;


import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cadastro.Pessoa;

public class PessoaDao extends Dao {
	
	// Crud Cadastrar 
	public void incluirPessoa(Pessoa pessoa) throws Exception {
		open();
		stmt =  con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1,0);
		stmt.setString(2, pessoa.getNome());
		stmt.setString(3, pessoa.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	
	// Crud listar
	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa");
			rs = stmt.executeQuery();
	        List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				int ID = (Integer)rs.getInt("id");
				p.setId(ID);
				p.setNome(rs.getString("nome"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
				
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	// Crud Atualizar
	// Crud Deletar
	
}
