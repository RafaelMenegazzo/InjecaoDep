package conexao;
import java.sql.*;

public class Conexao {
	
	final static String NOME_BANCO = "sistemaacademico";
	
	 public static Connection conectar() {
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		String url = "jdbc:mysql://localhost:3306/" + NOME_BANCO;
	    		System.out.println("Conexão boa");
	    		return DriverManager.getConnection(url,"root","1234");
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		return null;
	    	}
	    	
	    }

}
