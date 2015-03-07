package builder;
import java.util.Scanner;

public class Builder {

    
    public static void main(String[] args) 
    {
        String s1,s2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Please Enter the following sentence: 'Java is fun!'");
            s1 = keyboard.nextLine();
            
        StringBuilder builder = new StringBuilder(s1);
        System.out.println ("The length of the first String is: "+ s1.length());
        
        builder.append (" I love it!");
        System.out.println ("Please Enter the following word: 'Yes.'");
        s2 = keyboard.nextLine();
        
        builder.insert(s1.length()," "+ s2);
        System.out.println(builder);
        
        System.out.println ("The capacity is: " + builder.capacity());
        System.out.println ("Thanks!");
        
    
    }
    
}