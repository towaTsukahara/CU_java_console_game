public class Main {
    public static void main(String[] args) {
        Player player = new Player("towa", 100, 15, 10);
        Enemy enemy = new Enemy("スライム", 50, 10, 5);

        player.showStatus();
        enemy.showStatus();
    }
}
