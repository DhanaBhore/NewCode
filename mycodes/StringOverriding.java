package mycodes;

import javax.xml.namespace.QName;

public class StringOverriding {
    public static void main(String[] args) {
        Bank b1 = new Bank("HDFC Bank", " Bengaluru ");
        System.out.println(b1);
        b1 = null;
        System.gc();
    }
}


class Bank{

    String Name;
    String BranchLocation;

    Bank(String Name, String BranchLocation){
        this.Name = Name;
        this.BranchLocation = BranchLocation;
    }

    public String toString(){
        String BankInfo = Name + " > " + BranchLocation;
        return BankInfo;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.Name+this.BranchLocation+ " is garbage collected");
        super.finalize();

    }

}