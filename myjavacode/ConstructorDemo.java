package myjavacode;

public class ConstructorDemo {
    public static void main(String[] args) {

        Car c1 = new Car(300, "Audi");
        System.out.println("My Car is " + c1.getModel()+c1.getName());

        Car c2 = new Car(400, "Desire");
        System.out.println("My Car is " + c2.getModel()+c2.getName());

        Car c3 = new Car(1000, "i20");
        System.out.println("My Car is " + c3.getModel()+c3.getName());
    }
}

class Car{

    private int Model;
    private String Name;

    Car(int Model, String Name){
        setModel(Model);
        setName(Name);
        }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}