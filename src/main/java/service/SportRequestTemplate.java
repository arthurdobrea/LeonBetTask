package service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SportRequestTemplate {


    public <T> List<T> GetOListOfObjectsByUrl(String stringUrl, Class<T> clazz) throws IOException {
        // URL для GET-запроса
        URL url = new URL(stringUrl);
        HttpURLConnection connection;
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Получение ответа
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Взял все данные с API и замэпил в лист
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.toString(), objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
        } else
            return new ArrayList<>();
    }

    public <T> T GetOfObjectByUrl(String stringUrl, Class<T> clazz) throws IOException {
        // URL для GET-запроса
        URL url = new URL(stringUrl);
        HttpURLConnection connection;
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Получение ответа
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Взял все данные с API и замэпил в лист
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.toString(), clazz);
        } else
            return null;
    }
}
