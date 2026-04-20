public class Item {
    String name;
    int healAmount;

    public Item(String name, int healAmount){
        this.name = name;
        this.healAmount = healAmount;
    }

    public void showItem(){
        System.out.println("=== Item Data ===");
        System.out.println("name:" + name);
        System.out.println("healAmount:" + healAmount);
    }
}
