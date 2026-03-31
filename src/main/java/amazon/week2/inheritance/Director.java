package amazon.week2.inheritance;

public class Director extends Head {


    public Director(String firstName, String lastName, String userName) {
        super(firstName, lastName, userName);
    }

    @Override
    public void setBonusInEurosMonthly(int bonusInEurosMonthly) {
        if (bonusInEurosMonthly > 0){
            setBonusInEurosMonthly(bonusInEurosMonthly);
        }else {
            System.out.println("please come to se the HR departmnet, we need talk to you");
        }
    }

    @Override
    public String toString() {
        return "Director userName " + getUserName();
    }




}

