import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/2201347?apikey=uhrQ4rhpuzKkiiZaOoIbgvyFbzelSGM5&language=en&details=true")
                .build();

        Response response = client.newCall(request).execute();


        String body = response.body().string();

        String[] weather = body.split("\"");
//не доделал вывод в удобном виде
        for (int i = 0; i < weather.length; i++) {
            if (weather[i].getBytes(StandardCharsets.UTF_8).length < 4) {
                System.out.println(weather[i]);
            }
            System.out.print(weather[i]);
        }


    }
}
