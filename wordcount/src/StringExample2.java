
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StringExample2 {

    public static final char SPACE = ' ';
        
  
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Nhap vao duong dan file");
        String link= n.nextLine();
        try{ 
            String str;
            FileReader fr= new FileReader("");
            BufferedReader br= new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
            
            Map<String, Integer> wordMap = countWords(str);
                for (String key : wordMap.keySet()) {
                    System.out.print(key + " " + wordMap.get(key) + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {            
        }
        
       
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE ) {
                sb.append(input.charAt(i));
            } else {
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        
        addWord(wordMap, sb);
        return wordMap;
    }


    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}
