package amazon.week3.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPlay {

    static void main(String[] args) throws FileNotFoundException {

        //Example: Accessing a wrong index on an array

        int[] numbers = {1,2,3};
        System.out.println("Print the first element " + numbers[0]);

        // Unchecked Exception and handle it
        //System.out.println("Print the fifth element " + numbers[4]);




        // Unchecked Exception and do not handle it

        try {
            System.out.println("Print the fifth element " + numbers[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I tried to access the wrong index, let me fix it. ");
            System.out.println("Print the second element " + numbers[1]);
        }
        finally {
            System.out.println("Whenever we jump into an exception, we do also this. ");
        }



        //Example Reading a file
        //Checked Exception so we MUST handle it

        try {
            FileInputStream fileInputStream = new FileInputStream("my-config.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file is not avaliable. We will use the database ");
        }



        //Assume you cannot handle, then forward it
        //Bu sistemde hata cikinca psvm icine ekleme tarafini sectik
        //Ama o zaman da diyor ki you handle it( sen yap onu) yani catch olarak bisey eklemiyor
        FileInputStream fileInputStream = new FileInputStream("my-config.csv");





    }







}
