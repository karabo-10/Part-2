package com.mycompany.mavenproject1;

/**
 *
 * @author RC_Student_lab
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String str = "Four score and seven years ago";
        int first, last;
        first = str.indexOf('o');
        last = str.lastIndexOf('o');
        System.out.println("The letter o first appears at " + "position " + first);
        System.out.println("The letter o last appears at " + "position " + last);
         
        
        String fullName = "Karabo Octovia Kakudi";
        String lastName = fullName.substring(13);
         System.out.println("The full name is " + fullName );
         System.out.println("The last name is " + lastName );
    }
}
