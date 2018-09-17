package Interfaces;

public class InterfaceImplementor implements Interface1, Interface2, Interface3 {
    @Override
    public String interfaceOne() {
        return "Implemented interface one!";
    }

    @Override
    public String interfaceTwo() {
        return "Implemented interface two!";
    }

    @Override
    public String interfaceThree() {
        return "Implemented interface three!";
    }
}
