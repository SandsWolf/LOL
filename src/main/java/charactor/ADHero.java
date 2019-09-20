package charactor;


public class ADHero extends Hero implements AD,Mortal {


    @Override
    public void physicAttack() {

    }

    @Override
    public void die() {
        System.out.println("ADhero被杀死了");

    }


    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.setName("赏金猎人");

        Hero h1 = new Hero();
        h1.setName("盖伦");
        Hero h2 = new Hero();
        h2.setName("提莫");

        bh.attack();
        bh.attack(h1);
        bh.attack(h1,h2);

        new ADHero().physicAttack();
    }



}
