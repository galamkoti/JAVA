import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
class week9c1{
    public static void main(String[] args) throws Exception {
        try {
            FileReader file = new FileReader("1a.txt");
            BufferedReader br = new BufferedReader(file);
            String line;
            String words[] = new String[100];
            ArrayList<String> l = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                words = line.split(" ");
                for (String i : words)
                    l.add(i);
            }
            System.out.println("Before sorting words in alphabeticalorder:" + l);
            Collections.sort(l);
            System.out.println("After sorting words in alphabeticalorder:" + l);
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
