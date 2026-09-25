import java.util.*;

class Strings{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "vivek";
        String name2 = "Gupta";
        String name3 = name + " " +name2 ; 
        System.out.println(name3);
        System.out.println(name3.length());
        for(int i = 0 ; i <name3.length() ; i++ ){
            System.out.println(name3.charAt(i));
        }
        System.out.println(name.compareTo(name2) == 0 );

        if(name.compareTo(name2) == 0){
            System.out.println("name and name2 are equel");
        }else{
            System.out.println("name and name2 are not equel");
        }

        String name4 = "my self vivek is i am from varanansi";
        System.out.println(name4.length());
        System.out.println(name4.substring(0,13));


        // String builder

        StringBuilder name5 = new StringBuilder("vivek");
        System.out.println(name5);
        // charAt At index
        System.out.println(name5.charAt(0));

        // Set char at index
        name5.setCharAt(0,'A');
        System.out.println(name5);

        // append
        System.out.println(name5.append(" what are doing Mr. Aivek "));

        // name5.insert
        name5.insert(1, "v");
        System.out.println(name5);

        // sb.delete
        name5.delete(0,1);
        System.out.println(name5);
        // sb.reverse
        name5.reverse();
        System.out.println(name5);

        
        // String name = "vivek";
        // String name1 = "kumar";
        // String name2 = name + " " + name1;
        // System.out.println(name2);
        // // length()
        // System.out.println(name2.length());   

        // // chatAt
        // for(int i = 0 ; i <name2.length() ; i++){
        //     System.out.println(name2.charAt(i));
        // }
        // // campare
        // if(name.compareTo(name1) < 0){
        //     System.out.println("String are equel");
        // }else{
        //     System.out.println("String not equel");
        // }

        // // substring
        // String my ="my name is vivek kumar gupta";
        // String name3 = my.substring(11 ,16 );
        // String name4 = my.substring(11 );
        // String name5 = my.substring(0,11);
        // System.out.println(name3);
        // System.out.println(name4);
        // System.out.println(name5);

        String name6 = "Deep";
        String name7 = "Anas";
        String name8 = new String ("Satyam");
        String name_sum = name6+ name7+ name8;
        System.out.println(name6.length());

        System.out.println(name8.charAt(0));
        System.out.println(name7.compareTo(name6));
        System.out.println(name_sum);
        System.out.println(name_sum.length());
        System.out.println(name_sum.substring(0, 8));
        setCharAt(0,'A');
        System.out.println(name7);

        


    }
}