package usingCallableStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

public class client {
	static CallableStatement cs = null;
	static Statement st = null;
	public static void main(String[] args)throws SQLException{
		
		Connection connection = DbUtil2.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection ids taken..");
		try {
			String sql = "CREATE DEFINER=`root`@`localhost` PROCEDURE `new_procedure2`()\r\n"
					+ "BEGIN\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(9,'Sahana','sahana@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(10,'aditya','aditya@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(11,'anand','anand@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "INSERT INTO `jdbcdb`.`employee_table`(`employee_id`,`employee_name`,`email`,`esalary`,`bonus`,`doj`)\r\n"
					+ "VALUES(12,'sharath','sharath@gmail.com',6000,3000,'2022-03-03');\r\n"
					+ "END";
			
			st = connection.createStatement();
			int i=st.executeUpdate(sql);
			
			cs = (CallableStatement) connection.prepareCall("{call new_procedure2()}");
			int i1=cs.executeUpdate();
			System.out.println(i1);
		} catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection.close();
			cs.close();
		}
		catch(Exception e) {
			System.out.println(e); }
		}
}


