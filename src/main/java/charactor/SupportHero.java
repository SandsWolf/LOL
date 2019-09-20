package charactor;

public class SupportHero extends Hero {


    public void heal() {
        System.out.println(this.getName()+"治疗了自己"+this.getHp()+"hp");
    }
    public void heal(Hero h1) {
        System.out.println(this.getName()+"治疗了"+h1.getName()+h1.getHp()+"hp");
    }

    public void heal(Hero... heroes) {
        for (int i = 0;i < heroes.length;i++) {
            System.out.println(this.getName()+"治疗了"+heroes[i].getName()+heroes[i].getHp()+"hp");
        }
    }
    public static void main(String[] args) {
        SupportHero xl = new SupportHero();
        xl.setName("仙灵女巫");
        xl.setHp(150);

        Hero h1 = new Hero();
        h1.setName("盖伦");
        h1.setHp(200);
        Hero h2 = new Hero();
        h2.setName("提莫");
        h2.setHp(100);

        System.out.println("-----");
        xl.heal();
        xl.heal();
        xl.heal(h1,h2);



    }

}
