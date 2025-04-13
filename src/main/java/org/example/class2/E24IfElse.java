package org.example.class2;

public class E24IfElse {
    public static void main(String[] args) {


       String day="Monday";
        // Not recommended to use relational operators with String data type
        // because relational operators do not work well with non-Primitive data types
       if(day!="Sunday")
       {
           System.out.println("Happy Sunday");
       }

       else
       {
           System.out.println("Let's go to work");
       }

    }
}
