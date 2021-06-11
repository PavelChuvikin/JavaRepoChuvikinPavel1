import java.io.IOException;
import java.sql.*;
import java.util.List;

public class Repository  {

       static void forname(){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    String doTableSQL = "CREATE TABLE IF NOT EXISTS weather (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "city STRING NOT NULL,date_time STRING NOT NULL, weather_text STRING NOT NULL, temperature DOUBLE NOT NULL)";

    String insertWeather = "INSERT INTO weather (city, date_time, weather_text, temperature) VALUES (?,?,?,?)";


//Метод записывающий данные
    public void saveWeatherResponse(List<WeatherResponse> weatherResponse) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8db.db")) {
            connection.createStatement().execute(doTableSQL);
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, ApplicationGlobalState.getInstance().getSelectedCity());
            saveWeather.setString(2, weatherResponse.get(0).getLocalobservationdatetime());
            saveWeather.setString(3, weatherResponse.get(0).getWeathertext());
            saveWeather.setDouble(4, weatherResponse.get(0).gettemperature().getmetric().getvalue());
            saveWeather.addBatch();
            saveWeather.executeBatch();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Метод вызывающий данные
        public static void getWeatherResponseData () throws SQLException {
            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8db.db")){
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM weather");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + "  " +
                                resultSet.getDouble(3) + "  " + resultSet.getString(4) + "  ");
            }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }


    }