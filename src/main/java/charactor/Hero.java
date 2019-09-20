package charactor;


import property.Item;
import property.LifePotion;
import property.MagicPotion;
import property.Weapon;

public class Hero {
    private String name;
    private int hp;
    private int mp;
    private int armor;
    private int moveSpeed;
    private int damage;

    static String copyright;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    //英雄的构造方法
    public Hero() {

    }
    //英雄的构造方法--重载1
    public Hero(String name,int hp) {
        setName(name);
        setHp(hp);
    }
    //英雄的构造方法--重载2
    public Hero(String name,int hp,int mp,int armor,int moveSpeed,int damage) {
        this(name,hp);
        this.mp = mp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
        this.damage = damage;

    }

    //攻击的方法
    public void attack() {
        String msg = String.format("%s进行了一次攻击 ，但是不确定打中谁了", name);
        System.out.println(msg);
    }


    //攻击的方法重载1
//    public int attack(Hero hero) {
//        hero.hp -= damage;
//        System.out.println(name+"攻击"+hero.name+","+hero.name+"掉了"+damage+"点血,剩余血量"+hero.hp);
//        return hero.hp;
//    }

    //攻击的方法重载2
    public void attack(Hero... heroes) {
        for (int i = 0;i < heroes.length;i++) {
            heroes[i].hp = heroes[i].hp - damage + heroes[i].armor;

            System.out.println(name+"攻击"+heroes[i].name+","+heroes[i].name+"掉了"+(damage-heroes[i].armor) +"点血,剩余血量"+heroes[i].hp);
        }

    }

    //装备武器的方法
    public int equip(Weapon weapon) {
        this.damage += weapon.getDamage();
        return damage;
    }

    //使用药品的方法
    public void usePotion(Item potion,Hero hero) {
        if (potion.getHp()!=0) {
            hero.hp += potion.getHp();

            //使用格式化输出
            //%s表示字符串，%d表示数字,%n表示换行
            String chihongyao = "%s使用了生命药剂，回复了%d点HP，目前HP为%d%n";
            System.out.printf(chihongyao,hero.name,potion.getHp(),hero.hp);
        }else {
            hero.mp += potion.getMp();
//            String chilanyao = String.format("%s使用了魔法药剂，回复了%d点MP，目前MP为%d",hero.name,potion.getMp(),hero.mp);
//            System.out.println(chilanyao);
            System.out.format("%s使用了魔法药剂，回复了%d点MP，目前MP为%d%n",hero.name,potion.getMp(),hero.mp);
        }

    }



    public void kill(Mortal mortal) {
        mortal.die();
    }

    //
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦",620,120,27,350,50);
        Hero teemo = new Hero("提莫",383,150,14,320,45);
        Hero bh = new Hero("赏金猎人",383,180,14,320,45);

        Hero.copyright = "版权由Riot Games公司所有";
        garen.attack();
        garen.attack(teemo);
        garen.attack(teemo,bh);
//        garen.equip(infinityEdge.damage);


        System.out.println("---------------------------");


        //引用类型转换
        ADHero ad = new ADHero();
        APHero ap = new APHero();

        Hero h1= ad;
        Hero h2= ap;

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);





        System.out.println("---------------------------");

        Weapon infinityEdge = new Weapon();
        infinityEdge.setName("无尽战刃");
        infinityEdge.setPrice(3600);
        infinityEdge.setDamage(65);

        LifePotion lifePotion = new LifePotion();
        lifePotion.setHp(100);

        MagicPotion magicPotion = new MagicPotion();
        magicPotion.setMp(50);

        garen.equip(infinityEdge);

        bh.usePotion(lifePotion,bh);

        teemo.usePotion(magicPotion,teemo);


        System.out.println("---------------------------");

        garen.attack();
        garen.attack(teemo);
        garen.attack(teemo,bh);

        System.out.println("---------------------------");




    }




}
