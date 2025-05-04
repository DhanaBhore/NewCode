package mycodes;

public class SingletonDesign {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
        DatabaseConnection dc = DatabaseConnection.getdObject();
        System.out.println(dc);
        }
    }
}

class DatabaseConnection{
    static DatabaseConnection dObject = new DatabaseConnection("123");

    String connectionId;

    private DatabaseConnection(String connectionId){
        this.connectionId = connectionId;
    }
    public static DatabaseConnection getdObject(){
        return dObject;
    }
}