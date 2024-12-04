import java.util.Scanner;

public class Game {
    private GameBoard board;
    private String currentPlayer;

    
    public Game() {
        board = new GameBoard();
        currentPlayer = "X";
    }

    
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;

        System.out.println("Bienvenido a Tic Tac Toe inspirado en Pool.\n");
        System.out.println("Para jugar, ingresa números del 1 al 3 para filas y columnas.\n");

        while (gameOn) {
            board.displayBoard();
            System.out.println("Turno de " + currentPlayer);

            int row = -1, col = -1;
            boolean validMove = false;

            
            while (!validMove) {
                try {
                    System.out.print("Ingresa la fila (1-3): ");
                    row = Integer.parseInt(scanner.nextLine()) - 1; 
                    System.out.print("Ingresa la columna (1-3): ");
                    col = Integer.parseInt(scanner.nextLine()) - 1; 

                
                    validMove = board.placePiece(row, col, currentPlayer);
                    if (!validMove) {
                        System.out.println("Movimiento inválido. Intenta nuevamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingresa números.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Por favor, ingresa números entre 1 y 3.");
                }
            }

           
            if (board.checkWin(currentPlayer)) {
                board.displayBoard();
                System.out.println("¡" + currentPlayer + " ha ganado!");
                gameOn = false;
            } else if (board.isFull()) {
                board.displayBoard();
                System.out.println("¡Es un empate!");
                gameOn = false;
            } else {
               
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            }
        }

        scanner.close();
        System.out.println("Fin del juego. ¡Gracias por jugar!");
    }
}
