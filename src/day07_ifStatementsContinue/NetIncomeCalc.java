package day07_ifStatementsContinue;

public class NetIncomeCalc {

    public static void main(String[] args) {

        double salary = 200000;
        boolean isMarried = true;
        double taxRate = 0.3;

        if(salary >= 130000){
            taxRate = 0.35;
        }
        if(salary >= 100000 && salary < 130000){
            taxRate = 0.30;
        }
        if(salary >= 80000 && salary < 100000){
            taxRate = 0.25;
        }
        if(salary <= 79000){
            taxRate = 0.20;
        }
        if(isMarried){
            taxRate -= 0.05;
        }

        double netIncome = salary * (1- taxRate); // salary - salary *taxRate
        System.out.println(netIncome);
    }
}

/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less
                in addition:
                	if the person is married, he/she will pay 5% less tax
 */
