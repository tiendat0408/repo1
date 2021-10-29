/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.FileSystemNotFoundException;
/**
 *
 * @author Admin
 */
public class Wordcount {
   
    public static void main(String[] args) throws FileNotFoundException {
      //HashMap<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map= new TreeMap<String, Integer>();
        Scanner txtFile= new Scanner(new File("G:\\demo.txt"));
        while(txtFile.hasNext()){
            String word= txtFile.next();
            if(map.containsKey(word)){
                int count= map.get(word) +1;
                map.put(word, count);
                
            }
            else{
                map.put(word, 1);
            }
        }
        txtFile.close();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
    
}
