package lab9.src;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String sql = "SELECT * FROM persoana";
        int id;
        try(Connection conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/demo",
                            "catalin","catalin");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
        ) {



            while (resultSet.next()) {
                id = resultSet.getInt("id");
                String nume = resultSet.getString("nume");
                String prenume = resultSet.getString("prenume");
                int varsta = resultSet.getInt("varsta");
                System.out.println("id = " + id
                        + " nume = " + nume
                        + " prenume = " + prenume
                        + " varsta = " + varsta);
                String persoana = id + ";" + nume + ";" + prenume + ";" + varsta;
                System.out.println(persoana);
            }


        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }
    }
}