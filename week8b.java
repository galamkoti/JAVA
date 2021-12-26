import java.util.ArrayList;

public class week8b {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        for (int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
        arr.remove(2);
        System.out.println(arr);
        
    }
}
