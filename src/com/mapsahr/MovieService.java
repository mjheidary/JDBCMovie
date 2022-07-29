package com.mapsahr;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.mapsahr.JDBCMysql.*;

public class MovieService {

    public List<Movie> findAllMovies() throws SQLException {
        Connection conn = null;
        try {
            //Register the JDBC driver
            Class.forName(DB_DRIVER);

            //Open the connection
            conn = DriverManager.
                    getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if (conn != null) {
                System.out.println("Successfully connected.");
            } else {
                System.out.println("Failed to connect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "select m.title,m.years,m.imdb,d.Dname,g.genre " +
                "from movie as m inner JOIN directors d on m.id_director = d.id inner join genres g " +
                "on m.id_genre = g.id ";

        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        List<Movie> movieList = new ArrayList<>();

        while (result.next()) {

            String title = result.getString(2);
            Integer year = result.getInt(3);
            String imdb = result.getString("imdb");
            String director = result.getString("Dname");
            String genre = result.getString("genre");
            movieList.add(new Movie(title, year, imdb, new Genre(genre), new Director(director)));

        }
        conn.close();
        return movieList;


    }
}
