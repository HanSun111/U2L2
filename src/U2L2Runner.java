import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        Scanner construction = new Scanner(System.in);
        System.out.println("Number of lumber boards needed: ");
        int boardNum = construction.nextInt();

        System.out.println("Number of windows needed: ");
        int windowNum = construction.nextInt();

        System.out.println("Tax rate in your area: ");
        double taxEvasion = construction.nextDouble();

        ConstructionPricer price = new ConstructionPricer(5.53 , 50.59 , taxEvasion);
        System.out.println("Material cost: " + price.materialsCost(boardNum , windowNum));
        System.out.println("Total cost with taxes because taxes are cool: " + price.totalWithTax(price.materialsCost(boardNum , windowNum)));


    }
}
