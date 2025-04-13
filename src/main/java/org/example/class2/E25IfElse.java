package org.example.class2;

public class E25IfElse {
    public static void main(String[] args) {


       String day="Sunday";
        /*
        day=="Sunday" => day.equals("Sunday")
        day!="Sunday" => !day.equals("Sunday")
         */
       if(!day.equals("Sunday"))
       {
           System.out.println("Happy Sunday");
       }

       else
       {
           System.out.println("Let's go to work");
       }

    }
}
