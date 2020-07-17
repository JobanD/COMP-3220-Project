import java.sql.Connection;     // connection to the db
import java.sql.DriverManager;  // obtain connection to db
import java.sql.SQLException;   // handle sql errors
import java.sql.ResultSet;      // model data results
import java.sql.Statement;      // sql statments

// An actual database does not exist as of right now so essentially this does nothing 
// This is how to establish a connection when that is eventually done
class db{
    public static void main(String[] args) {
      Connection conn = null;
      try {
        String url = "jdbc:sqlite:path/DBNAME.db";
        conn = DriverManager.getConnection(url);
  
        System.out.println("Got it!");
  
      } catch (SQLException e) {
          throw new Error("Problem", e);
      } finally {
        try {
          if (conn != null) {
              conn.close();
          }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      }
    }
  }