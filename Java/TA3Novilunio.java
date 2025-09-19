import java.util.Scanner;

public class TA3Novilunio {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double userpeso;
        double pesorate=43.33089;
        
        System.out.print("Enter Philippine peso: ");
        userpeso = input.nextDouble();

        System.out.println("The Philippine Peso is equivalent to:");

        double dollar = userpeso/43.33089;
        double Euro = userpeso/(pesorate/0.734719);
        double Yuan = userpeso/(pesorate/6.346934);
        double Koruna = userpeso/(pesorate/18.77263);
        double Krone = userpeso/(pesorate/5.449007);
        double Sheqel = userpeso/(pesorate/3.726334);
        double Dinar = userpeso/(pesorate/0.274588);


        System.out.println("US Dollar\t:\t\t "+dollar);
        System.out.println("Euro\t\t:\t\t "+Euro);
        System.out.println("Yuan\t\t:\t\t "+Yuan);
        System.out.println("Koruna\t\t:\t\t "+Koruna);
        System.out.println("Krone\t\t:\t\t "+Krone);
        System.out.println("Sheqel\t\t:\t\t "+Sheqel);
        System.out.println("Dinar\t\t:\t\t "+Dinar);
    }
}
