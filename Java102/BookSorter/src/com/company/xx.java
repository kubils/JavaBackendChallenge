package com.company;

import java.util.*;
import java.io.*;
import java.net.*;

class xx {
    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        inputStream));
                HashSet<String> x = new HashSet<String>();
                String s;
                StringBuilder str = new StringBuilder();
                while ((s = in.readLine()) != null)
                    str.append(s);
                in.close();
                int start = str.indexOf("hobbies");
                System.out.println(str.substring(start -1));
                System.out.println(str.lastIndexOf("]", start));


            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}