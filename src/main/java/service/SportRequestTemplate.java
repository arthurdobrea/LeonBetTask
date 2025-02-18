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

    public <T> List<T> fetchListFromApi(String stringUrl, Class<T> clazz) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(stringUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.err.println("HTTP request failed with response code: " + responseCode);
                return new ArrayList<>();
            }

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }

            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(response.toString(), objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));

        } catch (Exception e) {
            System.err.println("Error fetching data from API: " + e.getMessage());
            return new ArrayList<>();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
    public <T> T fetchFromApi(String stringUrl, Class<T> clazz) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL(stringUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.err.println("HTTP request failed with response code: " + responseCode);
                return null;
            }

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }

            return new ObjectMapper().readValue(response.toString(), clazz);

        } catch (Exception e) {
            System.err.println("Error fetching data from API: " + e.getMessage());
            return null;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
