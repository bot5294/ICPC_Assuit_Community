import java.text.DecimalFormat;
import java.util.*;

public class B_Basic_Data_Types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        System.out.println(sc.nextLong());
        System.out.println(sc.next());
        System.out.println(sc.nextFloat());
        DecimalFormat value = new DecimalFormat("#.#");
        System.out.println(value.format(sc.nextDouble()));
        sc.close();
    }
}