import java.util.Scanner;

public class PlaylistRecommender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎵 Welcome to your Personalized Playlist Recommender! 🎵");
        System.out.println("Please choose a genre:");
        System.out.println("1. RnB");
        System.out.println("2. Rap");
        System.out.println("3. Pop");
        System.out.println("4. Jazz");
        System.out.print("Enter number (1-4): ");

        int choice = scanner.nextInt();

        System.out.println("\n🎧 Here is your mini playlist:\n");

        switch (choice) {
            case 1:
                String[] rnb = {
                    "Exchange - Bryson Tiller",
                    "Good Days - SZA",
                    "Blinding Lights - The Weeknd",
                    "Gravity - Brent Faiyaz",
                    "Heartbreak Anniversary - Giveon"
                };
                printPlaylist(rnb);
                break;
            case 2:
                String[] rap = {
                    "SICKO MODE - Travis Scott",
                    "God's Plan - Drake",
                    "Bank Account - 21 Savage",
                    "Stronger - Kanye West",
                    "No Role Modelz - J. Cole"
                };
                printPlaylist(rap);
                break;
            case 3:
                String[] pop = {
                    "Into You - Ariana Grande",
                    "Levitating - Dua Lipa",
                    "Save Your Tears - The Weeknd",
                    "Butterfly - BTS",
                    "Pink Venom - BLACKPINK"
                };
                printPlaylist(pop);
                break;
            case 4:
                String[] jazz = {
                    "My Funny Valentine - Chet Baker",
                    "Summertime - Billie Holiday",
                    "Blue in Green - Miles Davis",
                    "Jazz Cafe - LoFi Hip Hop",
                    "Autumn Leaves - Cannonball Adderley"
                };
                printPlaylist(jazz);
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }

    private static void printPlaylist(String[] playlist) {
        for (String song : playlist) {
            System.out.println("- " + song);
        }
    }
}
