public class Enemy {
    String name;
    int hp;
    int maxHp;
    int attack;
    int defence;

    public Enemy(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    public void showStatus() {
        System.out.println("=== Enemy Data ===");
        System.out.println("Name:" + name);
        System.out.println("HP:" + hp + "/" + maxHp);
        System.out.println("Attack:" + attack);
        System.out.println("Defence:" + defence);
    }
}
