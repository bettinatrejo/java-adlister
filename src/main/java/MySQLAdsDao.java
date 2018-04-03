import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads{

    private Connection connection = null;


    public MySQLAdsDao(Config config) throws SQLException{
        DriverManager.registerDriver(new Driver());


        connection = DriverManager.getConnection (
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
                );
    }


    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

        while(rs.next()) {
            Ad ad = new Ad();
            ad.setId(rs.getLong("id"));
            ad.setDescription(rs.getString("description"));
            ad.setTitle(rs.getString("title"));
            ad.setUserId(rs.getLong("user_id"));
            ads.add(ad);
        }
        return ads;
    }


    public Long insert(Ad ad) {
        long id =(long) 0;
        String query =
                "INSERT INTO ads(title, description, user_id)  VALUES ('" + ad.getTitle() +"', '" + ad.getDescription() + "', " + ad.getUserId() + ")";
        try {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();

         if(rs.next()){
             rs.getLong(1);
         }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return id;
    }



}



