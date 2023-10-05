import java.util.Scanner;
class board {
    String num[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    void bp() {
        System.out.println(num[0][0] + " | " + num[0][1] + " | " + num[0][2]);
        System.out.println("--+---+---");
        System.out.println(num[1][0] + " | " + num[1][1] + " | " + num[1][2]);
        System.out.println("--+---+---");
        System.out.println(num[2][0] + " | " + num[2][1] + " | " + num[2][2]);
    }
    void point(int input, String user) {
        switch (input) {
            case 1:
                num[0][0] = user;
                break;
            case 2:
                num[0][1] = user;
                break;
            case 3:
                num[0][2] = user;
                break;
            case 4:
                num[1][0] = user;
                break;
            case 5:
                num[1][1] = user;
                break;
            case 6:
                num[1][2] = user;
                break;
            case 7:
                num[2][0] = user;
                break;
            case 8:
                num[2][1] = user;
                break;
            case 9:
                num[2][2] = user;
                break;
        }

    }
    void winner(String user){
        String WinPattern = user + user + user;
        if(WinPattern == num[0][0] + num[0][1] + num[0][2]){
            System.out.println("Winner" + user);
            System.exit(0);
        }
        else if(WinPattern.equals(num[1][0] + num[1][1] + num[1][2])){
            System.out.println("Winner" + user);
            System.exit(0);
        } else if (WinPattern.equals(num[2][0] + num[2][1] + num[2][2])) {
            System.out.println("Winner" + user);
            System.exit(0);
        } else if (WinPattern.equals(num[0][0] + num[1][1] + num[2][2])) {
            System.out.println("Winner" + user);
            System.exit(0);
        }
        else if(WinPattern.equals(num[0][2] + num[1][1] + num[2][0])){
            System.out.println("Winner" + user);
            System.exit(0);
        } else if (WinPattern.equals(num[0][0] + num[1][0] + num[2][0])) {
            System.out.println("Winner" + user);
            System.exit(0);

        } else if (WinPattern.equals(num[0][1] + num[1][1] + num[2][1])) {
            System.out.println("Winner" + user);
            System.exit(0);
        } else if (WinPattern.equals(num[0][2] + num[1][2] + num[2][2])) {
            System.out.println("Winner" + user);
            System.exit(0);
        }
    }
}

public class W_Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        board b = new board();
        b.bp();
        for(int i=0;i<4;i++){
            System.out.print("Enter Number X:");
            int Xuser= sc.nextInt();
            b.point(Xuser,"X");
           b.bp();
            b.winner("X");
            System.out.print("Enter Number @ :");
            int OOuser= sc.nextInt();
            b.point(OOuser,"@");
            b.bp();
            b.winner("@");


        }

    }
}