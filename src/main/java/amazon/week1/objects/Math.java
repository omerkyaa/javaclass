package amazon.week1.objects;

public class Math {

    String name;
    double gradeInMath;


    public static void main(String[] args) {

        Math student1 = new Math();
        student1.name = "Tom";
        student1.gradeInMath = 1.7;

        Math student2 = new Math();
        student2.name = "Siggi";
        student2.gradeInMath = 2.5;

        Math student3 = new Math();
        student3.name = "Omer";
        student3.gradeInMath = 3.2;

        double total = student1.gradeInMath + student2.gradeInMath + student3.gradeInMath;
        double average = total / 3;

        System.out.println(average);


        if (student1.gradeInMath < student2.gradeInMath && student1.gradeInMath < student3.gradeInMath){
            System.out.println(" Tom has Best Score");
        }
        if (student2.gradeInMath < student1.gradeInMath && student2.gradeInMath < student3.gradeInMath){
            System.out.println("Siggi has Best Score");
        }
        if (student3.gradeInMath < student1.gradeInMath && student3.gradeInMath < student1.gradeInMath){
            System.out.println("Siggi has Best Score");
        }




    }
}
