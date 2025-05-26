package assignments;

class Mobilephone{

    public static void main(String[] args) {
        Human1 h1 = new Human1();
        h1.talk("Hello");
        System.out.println(h1);
    }
    int height;
    int width;
    String brand_name;
    int storage;
    String color;
    int no_of_SIM_cards;
    int no_of_cameras;
    String model;


    void calling(String receiver){
        System.out.println("I am calling ");
    }

    void messaging(String receiver){

    }

    void   transactions(int rupees){

    }

    void  shopping(String itemname){

    }

    void   capture_photos(){

    }

    void navigation(String name_of_place){

    }

    void entertainment(){

    }
}

class Human1 {
    public static void main(String[] args) {
        Mobilephone m = new Mobilephone();
        m.calling("Mom");
    }
    String Name;
    int Height;
    int Weight;

    public void Walk(){

    }
    void talk(String words){
        System.out.println("I am learning Java");
    }
}

class Desktop {
    public static void main(String[] args) {
        COllege c = new COllege();
        c.learn("Maths");
        c.play("Badminton");
    }
    int Display_size;
    int height;
    int width;
    float weight;
    int memory_storage;
    String brand_name;
    String model;


    void entertainment() {
    }

    void work() {

    }
}

class COllege{

    String Name;
    String Career_branches;
    int no_of_professors;
    String professor_Names;
    int noOfSportsPlayed;

    void learn(String SubjectName){
        System.out.println("I am learning Mathematics");
    }
    void play( String sport){
        System.out.println("I am playing Badminton");
    }
}


class Bike {
    String color;
    String manufacturer;
    String model;
    int mileage;

    void riding(){

    }
}


class Refridgerator {
    public static void main(String[] args) {
        TrolleyBag tb = new TrolleyBag();
        tb.carry_luggage();
        tb.storage("clothes");
    }
    int volume;
    int no_of_doors;
    String brand;
    String model;

    void Freeze(String items){

    }
    void keepthings(String items){

    }
}

class TrolleyBag {
    String color;
    int size;
    int no_of_chains;

    void carry_luggage(){
        System.out.println("I am on a world tour");
    }
    void storage(String item_name){
        System.out.println("clothes");
    }
}

class Mirror {
    public static void main(String[] args) {
        GasStove gs = new GasStove();
        gs.cooking("Rice");

    }
    int height;
    int width;
    String shape;

    void image(){

    }
    void showcase(){

    }
}


class GasStove {
    float height;
    int width;
    int number_of_burners;
    String name_of_company;

    void cooking(String food){
        System.out.println("Rice");
    }
}