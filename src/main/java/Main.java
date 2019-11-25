import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class Main{
    public static void main(String[] args) {
        //connect to postgres (on college PC)
        String dbUrl = "jdbc:postgresql://155.198.132.2:5432/co417";
        // to connect on my own laptop
        //String dbUrl = "jdbc:postgresql://localhost:5432/postgres";

        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, "co417", "hello");
            //Connection conn= DriverManager.getConnection(dbUrl, "postgress", “mypassword”);

            Statement s = conn.createStatement();
            String sqlStr = "insert into patientofdoctor (patientid,doctorid) values (1,2);";
            s.execute (sqlStr);
            sqlStr = "insert into patientofdoctor (patientid,doctorid) values (2,2);";
            s.execute (sqlStr);
            s.close();
            conn.close();

        } catch (Exception e) {
        }
    }
}
