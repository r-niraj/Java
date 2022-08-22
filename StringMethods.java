package com.company;

public class StringMethods {
    public static void main(String[] args) {
        String name = "ShAWon";

         //Length of a string
        int stringLen = name.length(); // ".length()" returns the length of name string
        System.out.println(stringLen);
         //Lowercase
        String lowerString = name.toLowerCase();
        System.out.println(lowerString);
         //Uppercase
        String upperString = name.toUpperCase();
        System.out.println(upperString);

         //Trim method
        String nonTrimmed = "   shawon   ";
        String trimmed = nonTrimmed.trim();
        System.out.println(nonTrimmed);
        System.out.println(trimmed);

         //Substring(int start) method
        System.out.println(name.substring(2)); //here 2 is the starting index of name string
        // as we see "a" is the index 2, so substring will print index 2 to end = AWon

        //substring(start,end)
        System.out.println(name.substring(1,4));
        //Here 1st substring index = 1 = h and last = 3 = W //as 4 is excluded

        String name2 = "madam";
        //replace in string
        System.out.println(name2.replace('m','b'));
        System.out.println(name2.replace("mad","bad"));
        System.out.println(name2.replace("d","gha"));
        //to replace any letter or bundle of letter in string with any letter or string

        //startsWith() //is it starts with "..." this? //returns boolean
        System.out.println(name2.startsWith("mad"));
        System.out.println(name.startsWith("mad"));

        //endsWith() //is it ends with "..." this? //returns boolean
        System.out.println(name2.endsWith("um"));

        //charAt(index) //what is the character at that "index(like 0-S,1-h...)"
        System.out.println(name.charAt(2));

        //indexOf("string or char") //tells where the first index of given string or character starts
        System.out.println(name.indexOf("W"));
        System.out.println(name.indexOf("on"));

        String name3 = "AoutoMotoM";
        //indexOf("string or char",start_point) //means compiler will start searching from the start_point
        // and tell starting index of the string
        System.out.println(name3.indexOf("toM",2));
        System.out.println(name3.indexOf("toM",6));
        System.out.println(name3.indexOf("Mot",6)); //"Mot" substring not belongs here

        //lastIndexOf("string or char",end_index) //tells the last index of string started
        System.out.println(name3.lastIndexOf("oM"));
        System.out.println(name3.lastIndexOf("oM",6));

        //equals("string") //to check if the two strings are equal or not(case sensitive)
        System.out.println(name.equals("Shawon"));
        System.out.println(name2.equals("madam"));
        //to ignore cases -> equalsIgnoreCase("String)
        System.out.println(name.equalsIgnoreCase("shawon"));


    }
}
