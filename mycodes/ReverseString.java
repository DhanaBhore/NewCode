package mycodes;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Dhanashri";
        String revStr = "";
        for (int i = str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i); //or str.charAt
        }
        System.out.println(revStr);
    }
}
