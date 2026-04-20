public class Main {
    public static void main(String[] args) {
        Player player = new Player("towa", 100, 15, 10);
        Enemy enemy = new Enemy("スライム", 50, 10, 5);
        Item item = new Item("herb", 10);

        player.showStatus();
        enemy.showStatus();
        item.showItem();
    }
}
