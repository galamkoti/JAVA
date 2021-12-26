import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//import jdk.jfr.events.FileWriteEvent;
public class week9a1 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String fname=null;
        fname=sc.next();
        //sc.close();
        File f1=new File(fname);
//File f2=new File("fnew.txt");
        //Scanner fr=new Scanner(f1);
        FileReader fr = new FileReader(f1);
        FileWriter fwrite=new FileWriter("fnew.txt");
        if(!f1.exists() || !f1.isFile()) {
            System.out.println("not exists");
        } else {
            System.out.println(f1.getName());
            System.out.println(f1.getAbsolutePath());
            System.out.println(f1.length());
            System.out.println(f1.getParent());
            int i;
            int alpha=0;
            int words=0;
            int  digits=0;
            int special=0;
            boolean flag = false;
            while( (i = fr.read()) !=-1){
                System.out.println((char)i);
                if(i >=65 && i <= 90 || i>=97 && i<=122 ){
                    alpha++;
                    flag = false;
                }
                else if((char)i==' '){
                    if(flag)    continue;
                    flag = true;
                    words++;
                }
                else if(i>=48 && i<=57)
                {
                    digits++;
                    flag = false;
                }
                else{
                    special++;
                    flag = false;
                }
            }
            System.out.println("alphabets:"+alpha+" words:"+words+" digits:"+digits+" special:"+special);
            fwrite.write("Alphabets\twords\tdigits\tspecial\n");
            fwrite.write(alpha+"\t"+words+"\t"+digits+"\t"+special+"\t");
            fwrite.close();
            //System.out.println(f1.n);
        }
    }
}
