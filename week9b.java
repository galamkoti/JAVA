import java.io.*;
import java.util.*;

public class week9b {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("sample.csv");
        BufferedReader bf = new BufferedReader(fr);
        int revenue = 0;
        String s;
        int[][] opdata = new int[3][3];
        int i = 0;
        s = bf.readLine();
        while((s = bf.readLine()) != null) {
            // System.out.println(s);
            String[] data = s.split(",");
            opdata[i][0] = Integer.parseInt(data[0]);
            opdata[i][1] = Integer.parseInt(data[3]);
            i++;
            revenue += Integer.parseInt(data[2]) * Integer.parseInt(data[3]);
        }
        System.out.println("Total Revenue: " + revenue);
        Arrays.sort(opdata, new Comparator<int[]>(){
            public int compare(int[] first, int[] second) {
                if(first[1] > second[1])    return 1;
                else    return -1;
            }
        });
        for(int x = 0; x < 3; ++x) {
            for(int j = 0; j < 2; ++j) {
                System.out.print(opdata[x][j] + " ");
            }
            System.out.println();
        }
        bf.close();
    }
}