package week2.Lop_Animal_va_interface_Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chiken: cluck - cluck ";
    }

    @Override
    public String howtoEat() {
        return "Chiken:" +
                " rice";
    }
}
