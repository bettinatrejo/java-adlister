import java.sql.*;
import java.util.List;
import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads{

    private static Connection connection = null;


    public MySQLAdsDao() throws SQLException{
        Statement stmt = connection.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM users ");

        while(rs.next()) {
            System.out.println();
        }
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }


    public static void main(String[] args) {
        try {
        DriverManager.registerDriver(new Driver());

        Config config = new Config();

        connection = DriverManager.getConnection (
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
                );


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}



