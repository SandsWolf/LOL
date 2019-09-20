package charactor;

public class APHero extends Hero implements AP,Mortal {
    @Override
    public void magicAttack () {

    }

    @Override
    public void die() {
        System.out.println("APhero被杀死了");
    }
    public static void main(String[] args) {
        new APHero().magicAttack();
    }


}
