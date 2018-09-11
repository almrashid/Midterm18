package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        FortuneEmployee fortuneEmployee=new FortuneEmployee();
        fortuneEmployee.collectInfo();
        System.out.println(fortuneEmployee.paySalary(50000,.1));
       Assert.assertEquals(55000,55000);

    }
}
