package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFile(String path) throws Exception {

        FileReader fr = new FileReader(path);

        BufferedReader br = new BufferedReader(fr);

        String st;
        List<String> myList = new ArrayList<String>();

        while ((st = br.readLine()) != null) {
            myList.add(st);
        }
        return myList;
    }
}
