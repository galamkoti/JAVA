import java.io.*;
import java.util.*;
public class csv {
    public static void main(String[] args) {
        try{
            String line;
            BufferedReader br = new BufferedReader(new FileReader("details.csv"));
            while((line = br.readLine())!=null)
            {
                String[] s = line.split(",");
                for(int j=0;j<s.length;j++){
                   System.out.print(s[j]+",");
                }
                System.out.println();
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
