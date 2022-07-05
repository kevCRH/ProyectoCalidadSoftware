package test.java;
import Test.test;
import Locators.Test_1;
import Locators.Test_2;
import Locators.Test_3;

public class MainClass {

    public static void main(String[] args) {
        test t = new test();
        Test_1 l = new Test_1();
        Test_2 l2 = new Test_2();
        Test_3 l3 = new Test_3();

        //t.pruebaInicio();
        //l.pruebaElements();
        //l2.pruebaWebTables();
        l3.pruebaForms();

    }
}
