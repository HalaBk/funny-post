package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class modele {
	 private String URL = "jdbc:derby:cciDB;create=true";
	    private String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	    private String LOGIN = "";
	    private String PWD = "";
	    public Connection cn;
	    
	    public void ConnectBDD() {
	        try {
	            Class.forName(DRIVER);
	            this.cn = DriverManager.getConnection(URL, LOGIN, PWD);
	            System.out.println("Connection à la base de données");
	            Statement st = this.cn.createStatement();
	            st.execute("delete table post (id_poste int, title varchar(20), body varchar(20))");
//	            st.executeUpdate("INSERT INTO post VALUES (3, 'ilham','arbouch')");
	        }catch (ClassNotFoundException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }

	            catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	    public void SelectBDD() {
	         try {
	              this.cn = DriverManager.getConnection(URL, LOGIN, PWD);
	              System.out.println("Connection à la base de données");
	             Statement selectStmt = this.cn.createStatement();
	             String selectSQL = "SELECT * FROM post";
	                  ResultSet rs = selectStmt.executeQuery(selectSQL);
	                  while (rs.next()) {
	                      int id_poste = rs.getInt("id_poste");
	                      String nom = rs.getString("title");
	                      String prenom = rs.getString("body");
	                      System.out.println("id_poste : " + id_poste + ", title : " + nom + ", body : " + prenom);
	                    }
	         } catch (SQLException e) {
	             e.printStackTrace();
	         }
	    }
}
