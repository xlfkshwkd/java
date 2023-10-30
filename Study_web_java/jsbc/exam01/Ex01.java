package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url ="jdbc:oracle:thin:@localhost:1521:orcl";
        String username ="scott";
        String password ="tiger";
        try(Connection conn= DriverManager.getConnection(url,username,password);
                Statement stmt =conn.createStatement()) {
            int deptNo=50;
            String lock="DEPT1";
            String loc ="LOC1";

            String sql ="Insert into DEPT2 VALUES("+ deptNo +",'"+ lock +"','"+ loc + "')";
            int affectedRows =stmt.executeUpdate(sql);
            System.out.println(affectedRows);
        }catch(SQLException e){
                e.printStackTrace();
            }
        }






}
