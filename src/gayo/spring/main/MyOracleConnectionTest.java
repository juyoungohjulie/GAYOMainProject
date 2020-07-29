package gayo.spring.main;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MyOracleConnectionTest {
		
			String DRIVER = "oracle.jdbc.driver.OracleDriver";
			String URL = "jdbc:oracle:thin:@springdatabase.cvd0lmj3uhjn.ap-northeast-2.rds.amazonaws.com:1521:sid";
			String USER = "admin";
			String PW = "qwerasdf";
			
			@Test
		    public void testConnection() throws Exception{
		        
		        Class.forName(DRIVER);
		        
		        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
		            System.out.println(con);
		            
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		    }
		
}
