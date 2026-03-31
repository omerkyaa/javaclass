package amazon.week2.inheritance;

public class Head extends Staff {

    private int bonusInEurosMonthly = 300;


    public Head(String firstName, String lastName, String userName) {
        super(firstName, lastName, userName);
    }

    public int getBonusInEurosMonthly() {
        return bonusInEurosMonthly;
    }

    public void setBonusInEurosMonthly(int bonusInEurosMonthly) {
        if(bonusInEurosMonthly > 0) {
            this.bonusInEurosMonthly = bonusInEurosMonthly;
        } else {
            System.out.println("You didnt work well but we give your another month to do better.");
        }
    }

    @Override
    public String toString() {
        return "Head userName " + getUserName();
    }




}
