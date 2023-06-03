package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.PreparableStatement;

public class Dao {
	
	Connection con; // conexão com o DB
	PreparedStatement stmt; // Acessa a tabela(insert,update,delete,select)
	ResultSet rs;//consulta a tabel
	CallableStatement call;// Procedures e Functions

	public void open()throws Exception { // abre a conexão com o DB
		String url="jdbc:mysql://localhost:3306/cadastros"; // "DriveJDBC:GerenciadorDeDB://LocalOndeEstaODB:PortaUsadoPeleDB/DB"
		String user ="root";
		String password="";
		String driver ="com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("DB conectado com sucesso");
		}catch (SQLException|ClassNotFoundException ex) {
			// TODO: handle exception
			System.out.println("erro ao conectar ao DB " + ex.getMessage());
		}
	}
	
	public void close()throws Exception { // fecha a conexão com o DB
			con.close();
	}

}
