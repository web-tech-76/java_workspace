package basics.inherit;

public class Car extends Vehicle {

    public static void main(String[] args) {
        new Car().addChasis();
    }

    @Override
    public void addChasis() {
        super.addChasis();
        System.out.println(" added Chasis of car");
    }


}
