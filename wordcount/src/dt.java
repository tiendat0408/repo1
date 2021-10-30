/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.FileSystemNotFoundException;
/**
 *
 * @author Admin
 */
public class dt {

    Scanner n= new Scanner(System.in);
    FileReader fr=null;
    BufferedReader br= null;


    public void read(String link){
        System.out.println("Nhap vao duong dan file");
        link= n.nextLine();
        try{
            fr= new FileReader(link);
            br= new BufferedReader(fr);
            String s;
            int count=0;
            while((s=br.readLine())!=null){
                StringTokenizer st= new StringTokenizer(s);
                while(st.hasMoreTokens()){
                    st.nextToken();
                    count++;
                }
            }
            System.out.println("" +count);

        }
        catch(FileSystemNotFoundException ex1)
        {
            System.out.println("Khong tim thay file");

        }
        catch(IOException ex2)
        {
            System.out.println("Loi doc file ");
        } 
    }

    public static void main(String[] args) {
        dt wordcount= new dt();
        wordcount.read(null);
    }

}

