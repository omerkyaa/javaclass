package amazon.week2.Exercises;

public class PlayWithStatic {

    public int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static int add2(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {

        int temp;

        // only static stuff can be called outside an object
        temp = add2(2,5);
        System.out.println("First addition gives " + temp);

        // everything can be called inside an object
        PlayWithStatic playWithStatic = new PlayWithStatic();
        temp = playWithStatic.add(2,6);
        System.out.println("Second addition gives " + temp);

        temp = playWithStatic.add2(3,8);
        System.out.println("Third addition gives " + temp);
    }
}