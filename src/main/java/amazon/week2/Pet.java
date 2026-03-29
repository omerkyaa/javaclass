package amazon.week2;

public class Pet {

    String name;
    boolean isHungry;
    int happynessLevel;

    public void playWithPet() {
        happynessLevel ++;

    }

    public void feedPet() {
        isHungry = false;


    }

    public void statusCheck(){
        if ((isHungry == true) || (happynessLevel <5)) {
            System.out.println("Take better care of the pet");
        }else{
            System.out.println("Pet is happy and ok.");
        }
    }

    static void main(String[] args) {
        Pet fatCat = new Pet();
        fatCat.happynessLevel = 4;
        fatCat.isHungry = true;
        fatCat.name = "Cafer";
        fatCat.statusCheck();

        fatCat.feedPet();
        fatCat.playWithPet();
        fatCat.statusCheck();


    }


}
