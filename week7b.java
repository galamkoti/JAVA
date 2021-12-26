// import java.util.*;
import java.util.Vector;
public class week7b {
    public static void main(String[] args){
        Vector v = new Vector<>();
        int i=1;
        float f= 1.1f;
        char c='A';
        boolean b = true;
        Integer i1 =i;
        Float  f1 =f;
        Character c1 = c;
        Boolean b1 = b;
        v.add(i1);
        v.add(f1);
        v.add(c1);
        v.add(b1);
        System.out.println(v);
    }
}
