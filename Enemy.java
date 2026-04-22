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

    public void attackPlayer(Player player){
        int damage;
        if(player.defence >= attack){
            damage = 1;
        }else{
            damage = attack - player.defence;
        }
        player.hp = player.hp - damage;
        System.out.println(name + "が" + player.name + "に" + damage + "ダメージ与えた");
    }
}
