import java.util.Scanner;

public class GameManager {
    Scanner scanner;
    Player player;

    public GameManager() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        createPlayer();
    }

    public void createPlayer() {
        System.out.println("player名を入力してください");
        String name = scanner.nextLine();
        player = new Player(name, 100, 15, 10);
        System.out.println("ようこそ" + name + "様");
    }

    public void battle(Enemy enemy, Item item) {
        player.showStatus();
        enemy.showStatus();
        while (player.hp > 0 || enemy.hp > 0) {
            System.out.println("『攻撃』、『アイテム』、『逃げる』のいずれかを入力");
            String player_action = scanner.nextLine();
            if (player_action == "攻撃") {
                player.attackEnemy(enemy);
            } else if (player_action == "アイテム") {
                player.useItem(item);
            } else if (player_action == "逃げる") {
                return;
            }
        }

    }
}
