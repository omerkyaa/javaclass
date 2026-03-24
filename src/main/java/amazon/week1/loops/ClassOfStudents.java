package amazon.week1.loops;


public class ClassOfStudents {

    String [] studentsNames;
    double [] studentsGrades;

    static void main(String[] args) {

        int numberOfStudents = 5;

        ClassOfStudents class9A = new ClassOfStudents();
        class9A.studentsNames = new String[numberOfStudents ];
        class9A.studentsGrades = new double[numberOfStudents];

    /*
        // indexed initilazation
        class9A.studentsNames[0] = "Alice";
        class9A.studentsNames[1] = "Tom";
        class9A.studentsNames[2] = "Marta";
        class9A.studentsNames[3] = "Mike";
        class9A.studentsNames[4] = "James";

        class9A.studentsGrades[0] = 1.7;
        class9A.studentsGrades[1] = 2.7;
        class9A.studentsGrades[2] = 1.7;
        class9A.studentsGrades[3] = 3.7;
        class9A.studentsGrades[4] = 1.0;

     */
        // yukarda uzun uzun yazmak yerine böyle yazilabilir

        class9A.studentsNames = new String[]{"Alice", "Tom", "Patricia", "Mike", "John"};
        class9A.studentsGrades = new double[]{1.7, 2.7, 1.7, 3.7, 1.0};

        //Give me the sum of all grades

        double sum = 0;
        for(int i = 0; i < class9A.studentsGrades.length; i++ ){

            sum = sum + class9A.studentsGrades[i];
        }

        System.out.println("The sum of all grades is " + sum);

        //Give me the best student

        int indexOfBestStudent = 0;
        for (int i = 1; i < class9A.studentsGrades.length; i++) {
            if (class9A.studentsGrades[i] < class9A.studentsGrades[indexOfBestStudent]) {
                indexOfBestStudent = i;
            }
        }

        System.out.println("The best student is " + class9A.studentsNames[indexOfBestStudent]);
        System.out.println("The best grade is " + class9A.studentsGrades[indexOfBestStudent]);

        //give me the average grade
        sum = 0;
        for (double grade : class9A.studentsGrades) {
                sum += grade;
        }
        System.out.println("The sum of all grades is " + (sum / class9A.studentsGrades.length));

        // Give me all the first characters of the names

        String studentFirstChars = "";

        for (String name : class9A.studentsNames){
            studentFirstChars += name.charAt(0);
        }
        System.out.println("All Students first chars " + studentFirstChars);

        // Give me the amount of all letters in the student names

        int studentNamesLetters = 0;
        for(String name: class9A.studentsNames) {
            studentNamesLetters += name.length();
        }
        System.out.println("We need " + studentNamesLetters + " print all the names.");

        // Give me count the number of students having better grades than average

        double average = sum / class9A.studentsGrades.length;
        int count = 0;
        for (double grade : class9A.studentsGrades) {
            if (grade < average) {
                count++;
            }
        }
        System.out.println("Number of students better than average: " + count);

        //Give me print names all the superstars ( 1.0 people)

        for (int i = 0; i < class9A.studentsGrades.length; i++) {

            if (class9A.studentsGrades[i] == 1.0) {

                System.out.println(class9A.studentsNames[i] + " is a superstar");
            }
        }

        //find out, whether we have 2 students with the same name
        boolean hasSameName = false;

        for (int i = 0; i < class9A.studentsNames.length; i++) {

            for (int j = i + 1; j < class9A.studentsNames.length; j++) {

                if (class9A.studentsNames[i].equals(class9A.studentsNames[j])) {

                    hasSameName = true;
                    System.out.println("Same name found: " + class9A.studentsNames[i]);
                }
            }
        }

        //give me the first that has a 1.0 OR: Does the group have a person with 1.0?
        System.out.print("The following student has a 1.0");
        int index = 0;
        while (class9A.studentsGrades[index] != 1.0){
            index++;
        }
        System.out.println(class9A.studentsNames[index]);

        //Does this class have a student named Alices: Yes or no
        index = 0;
        while (index < class9A.studentsNames.length && !class9A.studentsNames[index].equals("Alice")){
            index++;
        }
        if(index < class9A.studentsNames.length){
            System.out.println("There is an Alice in the list.");
        }
        else {
            System.out.println("There is no Alice in the list");
        }

        //Give me a student who is better than Patricia
        //a)Find Patricia
        //b) Find a better student
        index = 0;
        while (index < class9A.studentsNames.length && !class9A.studentsNames[index].equals("Patricia")) {
            index++;
        }
        double gradesOfPatricia = class9A.studentsGrades[index];
        index = 0;
        while (index < class9A.studentsNames.length && class9A.studentsGrades[index] > gradesOfPatricia) {
            index++;
        }
        System.out.println("The following student is better than Patricia ");





    }
}
