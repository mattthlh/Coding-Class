import Interfaces.InterfaceImplementor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceImplementor myInterface = new InterfaceImplementor();
        System.out.println(myInterface.interfaceOne());
        System.out.println(myInterface.interfaceTwo());
        System.out.println(myInterface.interfaceThree());
    }
}