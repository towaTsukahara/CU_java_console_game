public class Player {
    String name;
    int hp;
    int maxHp;
    int attack;
    int defence;

    public Player(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    public void showStatus() {
        System.out.println("=== Player Data ===");
        System.out.println("Name:" + name);
        System.out.println("HP:" + hp + "/" + maxHp);
        System.out.println("Attack:" + attack);
        System.out.println("Defence:" + defence);
    }

    public void useItem(Item item) {
        int hp_before = hp;
        hp = hp + item.healAmount;
        if (hp > maxHp) {
            hp = maxHp;
        }
        int recoverd = hp - hp_before;
        System.out.println(name + "のHPが" + recoverd + "回復した");
        System.out.println(name + "のHPは" + hp + "になった");
    }

    public void attackEnemy(Enemy enemy) {
        int damage;
        if (enemy.defence > attack) {
            damage = 1;
        } else {
            damage = attack - enemy.defence;
        }
        enemy.hp = enemy.hp - damage;
        System.out.println(name + "が" + enemy.name + "に" + damage + "ダメージ与えた");
    }
}
