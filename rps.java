import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first player name:");
        String player1 = sc.nextLine();
        System.out.println("0" + " : " + "rock");
        System.out.println("1" + " : " + "papper");
        System.out.println("2" + " : " + "scission");
        System.out.print("who many points to win :");
        int n = sc.nextInt();
        int points1 = 0;
        int points2 = 0;
        for (int i = 0; points1<= n; i++) {
            System.out.print("select ur choice in between 0 to 2 "+ " "+player1+" else game will exit:");
            int b = sc.nextInt();
            if (b <= 2) {
                System.out.print("Computer will select:");
                int[] c = {0,1,2};
                int computer = (new Random().nextInt(c.length));
                int a = computer;
                System.out.println(a);
                if (a == b) {
                    System.out.println("tie");
                } else if ((a == 0) && (b == 1) || (a == 2) && (b == 0) || (a == 1) && (b == 2)) {
                    points1 = points1 + 1;
                    System.out.println("you won a ponit " + player1 + " : " + points1);
                    if(points1==n){
                        break;
                    }

                } else if ((a == 1) && (b == 0) || (a == 2) && (b == 1) || (a == 0) && (b == 2)) {
                    points2 = points2 + 1;
                    System.out.println("computer won a point:" + points2);
                    if(points2==n){
                        break;
                    }

                }


            }
            else {
                System.out.println("Exit");
                break;
            }

        }
        if (points1 < points2) {
            System.out.println("match winner is computer");
        }
        else if(points2 <points1){
            System.out.println("match winner is " + " " + player1);
        }
    }
}

