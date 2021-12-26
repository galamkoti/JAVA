import java.io.*;
import java.util.Scanner;
public class week9a
{
    public static void main(String[] args) {
        File myfile=new File("E:\\sem4\\java\\file1.txt");
        try {
            if(myfile.createNewFile())
            {
                System.out.println("File is created"+myfile.getName());
            }
            else
            {
                System.out.println("File is already created");
            }
        } catch (IOException e) {
            System.out.println("Some error occured");
        }
        
        if(myfile.exists())
        {
            System.out.println("Name:"+myfile.getName());
            System.out.println("path:"+myfile.getAbsolutePath());
            System.out.println("Lenght:"+myfile.length());
            System.out.println("can Write:"+myfile.canWrite());
            System.out.println("Can read:"+myfile.canRead());
        }
        else{
            System.out.println("File does not exist");
        }
        try
        {
        FileWriter myWriter=new FileWriter("E:\\sem4\\java\\file1.txt");
        myWriter.write("Hi This is Koteswararao Galam");
        myWriter.close();
        System.out.println("Successfully added content");
        
        }
        catch(IOException e)
        {
            System.out.println("Some error occured");
        }
        // File myobj=new File("E:\\sem4\\java\\file1.txt");
        Scanner myobj;
        try
        {
            myobj = new Scanner(myfile);
            while(myobj.hasNextLine())
            {
                String data=myobj.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e)
        {
           System.out.println("File Not Found");
        }
       
    }
}