import java.util.*;

public class QP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        StringBuilder name = new StringBuilder("vivek");
        StringBuilder name1 = new StringBuilder("vivek");
        
        // System.out.println(name.charAt(0));
        // name.setCharAt(0,'A');
        // System.out.println(name);
        // name.append(" what are doing Mr. Aivek ");
        // System.out.println(name);
        // name.insert(1,"v");
        // System.out.println(name);
        // name.delete(0,1);
        // System.out.println(name);

        System.out.println(name.charAt(4));
        name.setCharAt(4,'a');
        System.out.println(name);
        name.append(" what are doing Mr. Aivek ");
        name.insert(4, 'k');
        name.delete(5,6);
        System.out.println(name.length());
        System.out.println(name.compareTo(name1));
        if(name.compareTo(name1) == 0){
            System.out.println("name and name1 are equal");
        }else{
            System.out.println("name and name1 are not equal");
        }

    }

}