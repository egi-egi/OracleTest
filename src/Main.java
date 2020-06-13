import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> origAL = new ArrayList<String>();
        String[] newArray = new String[origAL.size()];
        newArray = origAL.toArray(newArray);
        System.out.println("Hello");
        System.out.println("NewBranch");
        System.out.println("SecondBranch");
    }

}
