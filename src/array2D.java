import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows, cols, option;
        int floorNum, roomNum;
        System.out.println("\n------------------------------------------");
        System.out.println("Enter the number of floors: ");
        rows = input.nextInt();
        System.out.println("Enter the number of rooms per floor: ");
        cols = input.nextInt();
        System.out.println("\n------------------------------------------");


        String[][] condo = new String[rows][cols];

        do {
            System.out.println("\n------------------------------------------");
            System.out.println("1. Buy condo ");
            System.out.println("2. Sell condo ");
            System.out.println("3. Show condo information ");
            System.out.println("4. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Choose option (1-4): ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n--------- Buy Condo ---------");
                    System.out.print("Enter the floor number (1-" + rows + "): ");
                    floorNum = input.nextInt();
                    System.out.print("Enter the room number (1-" + cols + "): ");
                    roomNum = input.nextInt();

                    if (isValidFloorRoom(floorNum, roomNum, rows, cols)) {
                        if (condo[floorNum - 1][roomNum - 1] == null) {
                            System.out.print("Enter your name to buy the condo: ");
                            input.nextLine(); // Consume newline left-over
                            String name = input.nextLine();
                            condo[floorNum - 1][roomNum - 1] = name;
                            System.out.println("Condo bought successfully by " + name + "!");
                        } else {
                            System.out.println("Sorry, this condo is already owned by " + condo[floorNum - 1][roomNum - 1] + ".");
                        }
                    } else {
                        System.out.println("Invalid floor or room number. Please try again.");
                    }
                    break;

                case 2:
                    System.out.println("\n--------- Sell Condo ---------");
                    System.out.print("Enter the floor number (1-" + rows + "): ");
                    floorNum = input.nextInt();
                    System.out.print("Enter the room number (1-" + cols + "): ");
                    roomNum = input.nextInt();

                    if (isValidFloorRoom(floorNum, roomNum, rows, cols)) {
                        if (condo[floorNum - 1][roomNum - 1] != null) {
                            System.out.println("Condo sold successfully by " + condo[floorNum - 1][roomNum - 1] + "!");
                            condo[floorNum - 1][roomNum - 1] = null; // Reset the condo
                        } else {
                            System.out.println("This condo is not owned yet!");
                        }
                    } else {
                        System.out.println("Invalid floor or room number. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("\n------- Show Condo Information -------");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            String owner = condo[i][j];
                            System.out.print((owner == null ? "Empty" : owner) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1-4.");
            }
        } while (option != 4);

        input.close();
    }

    private static boolean isValidFloorRoom(int floor, int room, int maxFloors, int maxRooms) {
        return floor >= 1 && floor <= maxFloors && room >= 1 && room <= maxRooms;
    }
}

