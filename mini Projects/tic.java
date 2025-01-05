package project;
import java.util.Scanner;
public class tic {

	

		
		    String arr[][] = {
		            { "1", "2", "3" },
		            { "4", "5", "6" },
		            { "7", "8", "9" }
		    };

		    public void displayTicTacToe() {
		        System.out.println("-".repeat(98));
		        System.out.println(arr[0][0] + "|" + arr[0][1] + "|" + arr[0][2] + "\n-+-+-\n" + arr[1][0] + "|" + arr[1][1]
		                + "|" + arr[1][2] + "\n-+-+-\n" + arr[2][0] + "|" + arr[2][1] + "|" + arr[2][2]);
		        System.out.println("-".repeat(98));
		    }

		    public void inputForPlayer1() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your position: ");
		        int position = sc.nextInt();
		        switch (position) {
		            case 1:
		                if (arr[0][0].equalsIgnoreCase("x") || arr[0][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[0][0] = "X";
		                break;

		            case 2:
		                if (arr[0][1].equalsIgnoreCase("x") || arr[0][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[0][1] = "X";
		                break;
		            case 3:
		                if (arr[0][2].equalsIgnoreCase("x") || arr[0][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[0][2] = "X";
		                break;
		            case 4:
		                if (arr[1][0].equalsIgnoreCase("x") || arr[1][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[1][0] = "X";
		                break;
		            case 5:
		                if (arr[1][1].equalsIgnoreCase("x") || arr[1][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[1][1] = "X";
		                break;
		            case 6:
		                if (arr[1][2].equalsIgnoreCase("x") || arr[1][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[1][2] = "X";
		                break;
		            case 7:
		                if (arr[2][0].equalsIgnoreCase("x") || arr[2][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[2][0] = "X";
		                break;
		            case 8:
		                if (arr[2][1].equalsIgnoreCase("x") || arr[2][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[2][1] = "X";
		                break;
		            case 9:
		                if (arr[2][2].equalsIgnoreCase("x") || arr[2][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer1();
		                } else
		                    arr[2][2] = "X";
		                break;
		            default:
		                System.out.println("Not a valid position");

		        }
		        displayTicTacToe();

		    }

		    public void inputForPlayer2() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your position: ");
		        int position = sc.nextInt();
		        switch (position) {
		            case 1:
		                if (arr[0][0].equalsIgnoreCase("x") || arr[0][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[0][0] = "O";
		                break;

		            case 2:
		                if (arr[0][1].equalsIgnoreCase("x") || arr[0][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[0][1] = "O";
		                break;
		            case 3:
		                if (arr[0][2].equalsIgnoreCase("x") || arr[0][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[0][2] = "O";
		                break;
		            case 4:
		                if (arr[1][0].equalsIgnoreCase("x") || arr[1][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[1][0] = "O";
		                break;
		            case 5:
		                if (arr[1][1].equalsIgnoreCase("x") || arr[1][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[1][1] = "O";
		                break;
		            case 6:
		                if (arr[1][2].equalsIgnoreCase("x") || arr[1][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[1][2] = "O";
		                break;
		            case 7:
		                if (arr[2][0].equalsIgnoreCase("x") || arr[2][0].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[2][0] = "O";
		                break;
		            case 8:
		                if (arr[2][1].equalsIgnoreCase("x") || arr[2][1].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[2][1] = "O";
		                break;
		            case 9:
		                if (arr[2][2].equalsIgnoreCase("x") || arr[2][2].equalsIgnoreCase("0")) {
		                    System.out.println("This position is already filled");
		                    inputForPlayer2();
		                } else
		                    arr[2][2] = "O";
		                break;
		            default:
		                System.out.println("Not a valid position");

		        }
		        displayTicTacToe();

		    }

		    public void checkAnyPlayerWon() {
		        if ((arr[0][0].equalsIgnoreCase("O")) && (arr[0][1].equalsIgnoreCase("O")) && (arr[0][2].equalsIgnoreCase("O"))
		                || (arr[1][0].equalsIgnoreCase("x")) && (arr[1][1].equalsIgnoreCase("O"))
		                        && (arr[1][2].equalsIgnoreCase("O"))
		                || (arr[2][0].equalsIgnoreCase("O")) && (arr[2][1].equalsIgnoreCase("O"))
		                        && (arr[2][2].equalsIgnoreCase("x"))
		                || (arr[0][0].equalsIgnoreCase("O")) && (arr[1][1].equalsIgnoreCase("O"))
		                        && (arr[2][2].equalsIgnoreCase("x"))
		                || (arr[0][2].equalsIgnoreCase("O")) && (arr[1][2].equalsIgnoreCase("O"))
		                        && (arr[2][0].equalsIgnoreCase("x"))
		                || (arr[0][0].equalsIgnoreCase("O")) && (arr[1][0].equalsIgnoreCase("O"))
		                        && (arr[2][0].equalsIgnoreCase("x"))
		                || (arr[0][1].equalsIgnoreCase("O")) && (arr[1][1].equalsIgnoreCase("O"))
		                        && (arr[2][1].equalsIgnoreCase("x"))
		                || (arr[0][2].equalsIgnoreCase("O")) && (arr[1][2].equalsIgnoreCase("O"))
		                        && (arr[2][2].equalsIgnoreCase("O"))) {
		            System.out.println("X is won !!!");
		            System.exit(0);

		        } else if ((arr[0][0].equalsIgnoreCase("O")) && (arr[0][1].equalsIgnoreCase("O"))
		                && (arr[0][2].equalsIgnoreCase("x"))
		                || (arr[1][0].equalsIgnoreCase("O")) && (arr[1][1].equalsIgnoreCase("O"))
		                        && (arr[1][2].equalsIgnoreCase("x"))
		                || (arr[2][0].equalsIgnoreCase("O")) && (arr[2][1].equalsIgnoreCase("O"))
		                        && (arr[2][2].equalsIgnoreCase("x"))
		                || (arr[0][0].equalsIgnoreCase("O")) && (arr[1][1].equalsIgnoreCase(""))
		                        && (arr[2][2].equalsIgnoreCase("x"))
		                || (arr[0][2].equalsIgnoreCase("O")) && (arr[1][2].equalsIgnoreCase("O"))
		                        && (arr[2][0].equalsIgnoreCase("x"))
		                || (arr[0][0].equalsIgnoreCase("O")) && (arr[1][0].equalsIgnoreCase("O"))
		                        && (arr[2][0].equalsIgnoreCase("x"))
		                || (arr[0][1].equalsIgnoreCase("O")) && (arr[1][1].equalsIgnoreCase("O"))
		                        && (arr[2][1].equalsIgnoreCase("x"))
		                || (arr[0][2].equalsIgnoreCase("O")) && (arr[1][2].equalsIgnoreCase("O"))
		                        && (arr[2][2].equalsIgnoreCase("O"))) {
		            System.out.println("O is won !!!");
		            System.exit(0);

		        } else {
		            System.out.println("Game is Drow !!!!!");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        tic game = new tic();
		        System.out.println("Enter 1st player name :");
		        String name1 = sc.next();
		        System.out.println("Enter 2nd player name :");
		        String name2 = sc.next();
		        game.displayTicTacToe();
		        System.out.println(name1 + " is X\n" + name2 + " is 0");
		        while (true) {
		            System.out.println(name1 + " your turn: ");
		            game.inputForPlayer1();
		            game.checkAnyPlayerWon();
		            System.out.println(name2 + " your turn: ");
		            game.inputForPlayer2();
		            game.checkAnyPlayerWon();
		        }

		          }

	
}
