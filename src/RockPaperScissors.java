import java.util.Scanner;

public class RockPaperScissors {
    static String takeInput(String ask, Scanner scanner){
        String choice = "";
        boolean r = true;

        do{
            System.out.println(ask);

            choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("R") || choice.equalsIgnoreCase("P") || choice.equalsIgnoreCase("S")){
                r = false;
            }else{
                System.out.println("Failed to input valid input: " + choice);
            }

        }while(r);

        return choice;
    }

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        do{
            String player1 = takeInput("What is player one's move?", scanner);
            String player2 = takeInput("What is player two's move?", scanner);

            if(player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("P")){
                System.out.println("Player 2 (Paper) beats player 1 (Rock)!");
            }else if(player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("R")){
                System.out.println("Player 1 (Paper) beats player 2 (Rock)!");
            }else if(player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("S")){
                System.out.println("Player 1 (Rock) beats player 2 (Scissors)!");
            }else if(player1.equalsIgnoreCase("S") && player2.equalsIgnoreCase("R")){
                System.out.println("Player 2 (Rock) beats player 1 (Scissors)!");
            }else if(player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("S")){
                System.out.println("Player 2 (Scissors) beats player 1 (Paper)!");
            }else if(player1.equalsIgnoreCase("S") && player2.equalsIgnoreCase("P")){
                System.out.println("Player 1 (Scissors) beats player 2 (Paper)!");
            }else if(player1.equalsIgnoreCase(player2)){
                System.out.println("Tie!");
            }

            boolean p = true;
            String p_ = "";

            do{
                System.out.println("\nWould you like to play again? (Y/N)");
                p_ = scanner.nextLine();
                if(p_.equalsIgnoreCase("Y")){
                    p = false;
                    System.out.println("Excellent!");
                }else if(p_.equalsIgnoreCase("N")){
                    p = false;
                    running = false;
                    System.out.println("Goodbye!");
                }else{
                    System.out.println("Failed to input valid input: "+p_);
                }
            }while(p);

        }while(running);

        scanner.close();
    }
}
