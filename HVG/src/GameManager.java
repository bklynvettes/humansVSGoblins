import java.util.Random;

public class GameManager {
    private Human player;
    private Goblin cpu;
    private GameBoard board;
    private Random rand;

    public GameManager() {
        player = new Human();
        cpu = new Goblin();
        board = new GameBoard();
        rand = new Random();
        placeCharacters();
    }

    private void placeCharacters() {
        int playerX = rand.nextInt(3);
        int playerY = rand.nextInt(3);
        board.placeCharacter(player, playerX, playerY);

        int cpuX, cpuY;
        do {
            cpuX = rand.nextInt(3);
            cpuY = rand.nextInt(3);
        } while (cpuX == playerX && cpuY == playerY);
        board.placeCharacter(cpu, cpuX, cpuY);
    }

    public void playGame() {
        // game logic goes here
    }
}