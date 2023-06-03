package Cadastros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.xdevapi.PreparableStatement;

public  class Dao  {
Connection con = null; // conexão com o DB
PreparableStatement stmt; // Acessa a tabela(insert,update,delete,select)
ResultSet rs=null;//consulta a tabel
CallableStatement call;// Procedures e Functions

public void open()throws Exception {
	String url="Jdbc:mysql://localhost:3306/cadastros"; // "DriveJDBC:GerenciadorDeDB://LocalOndeEstaODB:PortaUsadoPeleDB/DB"
	String user ="root";
	String password="";
	//String driver ="com.mysql.cj.jdbc.Driver";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user,password);
		System.out.println("Conexão realizada con sucesso");

	}catch (SQLException|ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("erro ao conectar ao DB");
	}
}

}
