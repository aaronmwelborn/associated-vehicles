package com.example.associatedvehicles.util;

import com.example.associatedvehicles.entity.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class VehicleImageUtility {
    public static String getFirstImageFromGoogle(Vehicle vehicle) throws IOException {

        URL imageUrl = null;
        try {
            imageUrl = new URL("https://www.google.com/search?tbm=isch&q="
                    + vehicle.getYear() + "+"
                    + vehicle.getMake() + "+"
                    + vehicle.getModel());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnection urlConnection = imageUrl.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        urlConnection.connect();
        urlConnection.getInputStream();

        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String inputLine;
        StringBuilder output = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            output.append(inputLine);
        }
        in.close();
        return output.toString();
    }
}


