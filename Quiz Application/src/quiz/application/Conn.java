package quiz.application;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///Quiz_application", "root", "2002");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class connection {

        static quiz.application.PreparedStatement prepareStatement(String query) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public connection() {
        }
    }

}
