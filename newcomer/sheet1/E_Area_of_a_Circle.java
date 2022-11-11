import java.util.*;
import java.text.DecimalFormat;
public class E_Area_of_a_Circle{
    static double PI = 3.141592653;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        DecimalFormat value = new DecimalFormat("#.#########");
        System.out.println(value.format(PI*r*r));
        sc.close();
    }
}