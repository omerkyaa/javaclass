package amazon.week1.objects;

public class Cars {

    String name;
    int speed;

    public static void main(String[] args) {


        Cars car1 = new Cars();
        car1.name = "BMW";
        car1.speed = 200;

        Cars car2 = new Cars();
        car2.name = "Audi";
        car2.speed = 210;



        if (car2.speed > car1.speed){
            System.out.println("BMW Faster");
        }
        if (car1.speed > car2.speed){
            System.out.println("Audi Faster");
        }
        if (car1.speed == car2.speed){
            System.out.println("Same");
        }


    }
}