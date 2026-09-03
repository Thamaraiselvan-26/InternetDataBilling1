import java.util.Scanner;

public class InternetDataBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Internet Data Usage Billing System =====");

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        System.out.print("Enter data usage in GB: ");
        double usage = sc.nextDouble();

        double limit;
        double charge;

        if (plan.equalsIgnoreCase("Basic")) {
            limit = 10;
            charge = 300;
        } else if (plan.equalsIgnoreCase("Standard")) {
            limit = 20;
            charge = 500;
        } else if (plan.equalsIgnoreCase("Premium")) {
            limit = 50;
            charge = 800;
        } else {
            System.out.println("Invalid plan.");
            sc.close();
            return;
        }

        double extraCharge = 0;

        if (usage > limit) {
            extraCharge = (usage - limit) * 20;
        }

        double totalBill = charge + extraCharge;

        System.out.println("\n===== Bill Details =====");
        System.out.println("Customer Name: " + name);
        System.out.println("Plan: " + plan);
        System.out.println("Data Usage: " + usage + " GB");
        System.out.println("Plan Limit: " + limit + " GB");
        System.out.println("Plan Charge: Rs. " + charge);
        System.out.println("Extra Usage Charge: Rs. " + extraCharge);
        System.out.println("Total Bill: Rs. " + totalBill);

        sc.close();
    }
}
