import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Burger Shop");
        System.out.println("Choose your order type:");
        System.out.println("1. Common Order (Default items: Regular Burger, Small Coke, Fries)");
        System.out.println("2. Custom Order (Choose items and sizes)");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            commonorder commonorder = new commonorder("Regular Burger", "Small Coke", "Fries");

            System.out.println("\nCOMMON PICKS:");
            System.out.println("Burger");
            System.out.println("Coke");
            System.out.println("Fries");
            System.out.println("--------------------------");
            System.out.println("Price of regular burger: " + commonorder.getRegularburger());
            System.out.println("Price of small coke: " + commonorder.getSmallcoke());
            System.out.println("Price of fries: " + commonorder.getFries());

            int totalBill = commonorder.getRegularburger() + commonorder.getSmallcoke() + commonorder.getFries();
            System.out.println("-------------");
            System.out.println("TOTAL BILL:\n" + totalBill);
            System.out.println("-------------");

        } else if (choice == 2) {
            System.out.println("\nCUSTOM ORDER:");

            System.out.println("Choose your Burger Type:");
            System.out.println("1. Chicken Burger");
            System.out.println("2. Veggie Burger");
            System.out.println("3. Cheese Burger");
            System.out.println("4. Fish Burger");
            int burgerChoice = scanner.nextInt();
            scanner.nextLine(); 

            String burgerType = null;
            switch (burgerChoice) {
                case 1:
                    burgerType = "Chicken Burger";
                    break;
                case 2:
                    burgerType = "Veggie Burger";
                    break;
                case 3:
                    burgerType = "Cheese Burger";
                    break;
                case 4:
                    burgerType = "Fish Burger";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSelect Burger Size:");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            int burgerSizeChoice = scanner.nextInt();
            scanner.nextLine(); 

            String burgerSize = null;
            switch (burgerSizeChoice) {
                case 1:
                    burgerSize = "Small";
                    break;
                case 2:
                    burgerSize = "Medium";
                    break;
                case 3:
                    burgerSize = "Large";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSelected Burger: " + burgerType + " - " + burgerSize);

            System.out.println("Choose your Juice Type:");
            System.out.println("1. Pepsi");
            System.out.println("2. Coke");
            System.out.println("3. Sprite");
            int juiceChoice = scanner.nextInt();
            scanner.nextLine(); 

            String juiceType = null;
            switch (juiceChoice) {
                case 1:
                    juiceType = "Pepsi";
                    break;
                case 2:
                    juiceType = "Coke";
                    break;
                case 3:
                    juiceType = "Sprite";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSelect Juice Size:");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            int juiceSizeChoice = scanner.nextInt();
            scanner.nextLine(); 

            String juiceSize = null;
            switch (juiceSizeChoice) {
                case 1:
                    juiceSize = "Small";
                    break;
                case 2:
                    juiceSize = "Medium";
                    break;
                case 3:
                    juiceSize = "Large";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSelected Juice: " + juiceType + " - " + juiceSize);
            System.out.println("Choose your Side Item:");
            System.out.println("1. Salad");
            System.out.println("2. Fries");
            System.out.println("3. Papad");
            int sideItemChoice = scanner.nextInt();
            scanner.nextLine();

            String sideItem = null;
            switch (sideItemChoice) {
                case 1:
                    sideItem = "Salad";
                    break;
                case 2:
                    sideItem = "Fries";
                    break;
                case 3:
                    sideItem = "Papad";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.println("\nSelect Side Item Size:");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");
            int sideItemSizeChoice = scanner.nextInt();
            scanner.nextLine();

            String sideItemSize = null;
            switch (sideItemSizeChoice) {
                case 1:
                    sideItemSize = "Small";
                    break;
                case 2:
                    sideItemSize = "Medium";
                    break;
                case 3:
                    sideItemSize = "Large";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            otherburger order = new otherburger(burgerType, burgerSize, juiceType, juiceSize, sideItem, sideItemSize);

            System.out.println(order);
            System.out.println("--------------------------");
            System.out.println("TOTAL BILL: " + order.calculateTotalBill());
            System.out.println("--------------------------");

        } else {
            System.out.println("Invalid choice! Please restart and select a valid option.");
        }

    }
}
