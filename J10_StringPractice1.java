/*
1. Write a Java program to convert a string to lowercase.
2. Write a Java program to replace spaces with underscores.
3. Write a Java program to fill in a letter template which looks like below:

    // letter = “Dear <|name|>, Thanks a lot”

    // Replace <|name|> with a string (some name)
4. Write a Java program to detect double and triple spaces in a string.
5. Write a program to format the following letter using escape sequence characters.

    //Letter = “Dear Harry, This Java Course is nice. Thanks”
 */

package com.company;
import java.util.Locale;
import java.util.Scanner;
public class J10_StringPractice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1,name1,name2,letter,str2,str3;
        System.out.print("Enter a string: ");
        str1 = in.nextLine();
        System.out.println("After converting to Uppercase: "+str1.toUpperCase()); //1

        System.out.println("After replacing spaces with underscore: "+str1.replace(" ","_")); //2

        System.out.print("Enter your name: ");
        name1 = in.next();
        System.out.println(">>Dear "+name1+", Thanks a lot"); //3

        System.out.print("Enter another name: ");
        name2 = in.next();
        letter = ">>Dear <|name1|>, How are you?";
        System.out.println(letter.replace("<|name1|>",name2)); //3

        str2 = "This my string with  double space and   triple space";
        System.out.println("Index of double space: "+str2.indexOf("  "));
        System.out.println("Index of triple space: "+str2.indexOf("   ")); //4

        System.out.println("\"Dear Shawon, \n\tThis Java Code is nice. Thanks\""); //5

    }
}
