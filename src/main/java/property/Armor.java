package property;

public class Armor extends Item {
    private int armorLevel;

    public int getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    public static void main(String[] args){
        Armor clothArmor = new Armor();
        clothArmor.setName("布甲");
        clothArmor.setPrice(300);
        clothArmor.setArmorLevel(15);

        Armor hauberk = new Armor();
        hauberk.setName("锁子甲");
        hauberk.setPrice(500);
        hauberk.setArmorLevel(40);
    }

}
