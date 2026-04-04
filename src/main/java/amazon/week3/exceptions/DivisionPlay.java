package amazon.week3.exceptions;

public class DivisionPlay {

    int divide (int quotient, int dividend) throws IDoNotDivideByOddNumbersException {

        if ((dividend % 2) == 1) {

            throw new IDoNotDivideByOddNumbersException("I tried with " + dividend);

        }
        else {
            return quotient / dividend;
        }



    }

    static void main(String[] args) {
        DivisionPlay divisionPlay = new DivisionPlay();

        try {
            int i = divisionPlay.divide(12,6);
            System.out.println("Result of division is " + i);
        } catch (IDoNotDivideByOddNumbersException e) {
            System.out.println("The exception was " + e.getMessage());
        }

        System.out.println("--------------");

        try {
            int i = divisionPlay.divide(12,7);
            System.out.println("Result of division id " + i);
        } catch (IDoNotDivideByOddNumbersException e) {
            System.out.println("The exception was " + e.getMessage());
        }

    }





}



