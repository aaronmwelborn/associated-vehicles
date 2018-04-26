package com.example.associatedvehicles.util;

import com.example.associatedvehicles.entity.Vehicle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class VehicleImageUtility {
    public static String getFirstImageFromGoogle(Vehicle vehicle) {

//        URL imageUrl = null;
//        try {
//            imageUrl = new URL("https://www.google.com/search?tbm=isch&q="
//                    + vehicle.getYear() + "+"
//                    + vehicle.getMake() + "+"
//                    + vehicle.getModel());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//        URLConnection urlConnection = imageUrl.openConnection();
//        urlConnection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
//        urlConnection.connect();
//        urlConnection.getInputStream();
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//        String inputLine;
//        StringBuilder output = new StringBuilder();
//        while ((inputLine = in.readLine()) != null) {
//            System.out.println(inputLine);
//            output.append(inputLine);
//        }
//        in.close();
//        return output.toString();
//    }

        HtmlUnitDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
}


