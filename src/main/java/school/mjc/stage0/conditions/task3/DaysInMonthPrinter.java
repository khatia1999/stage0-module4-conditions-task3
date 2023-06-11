package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {


        if(!(month >= 1  && month <= 12)) {

            System.out.println("wrong number!");

        }
        else if (month == 2) {

            System.out.println("in this month are : 28 days");

        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){

            System.out.println("in this month are : 30 days");

        }
        else{

            System.out.println("in this month are : 31 days");

        }
    }
}
