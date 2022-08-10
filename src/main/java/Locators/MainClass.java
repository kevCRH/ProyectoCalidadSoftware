package Locators;
import test.java.Test.test;
import Locators.Test_1;
import Locators.Test_2;
import Locators.Test_3;
import Locators.Test_4;
import Locators.TestNG;


public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        //test t = new test();
        Test_1 l = new Test_1();
        Test_2 l2 = new Test_2();
        Test_3 l3 = new Test_3();
        Test_4 l4 = new Test_4();
        TestNG l5 = new TestNG();

        //t.pruebaInicio();
        //l.setBaseUrl();
        //l.testCase();
        //l2.pruebaWebTablesSet();
        //l2.testCase();
        //l3.pruebaFormSet();
        //l3.testCase();
        l4.pruebaDragSet();
        l4.testCase();
        //l5.setBaseUrl();
        //l5.testCase();

    }
}
