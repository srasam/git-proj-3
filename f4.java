import java.util.*;
import java.io.*;
 
public class f4
{
    public static void main (String [] args)throws IOException
    {
        FileReader fr = new FileReader("reverse_input.txt");
        FileWriter fw = new FileWriter("reverse_output.txt");
        BufferedReader br = new BufferedReader(fr);
         
        String data;
        String reverse;
         
        while ((data = br.readLine()) != null) 
        System.out.println (data);
         
        
       
       
                
    }
}