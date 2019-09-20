package property;

public class Item {
    private String name;
    private int price;
    private int hp;
    private int mp;

    //HP
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    //MP
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //price


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void buy() {
        System.out.println("购买物品");

    }

    public void usePotion() {

    }

    public void upDamage() {
        System.out.println("装备武器提高攻击力");
    }

    public static void main(String[] args) {
        Item I1 = new LifePotion();
        Item I2 = new MagicPotion();




    }

}
