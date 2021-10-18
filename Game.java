package com.Topik;

class GameCharacter {
    String name;
    int lifePoint, attackHitPoint, attackKickPoint;

    GameCharacter(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.lifePoint = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    String getName(){
        return name;
    }

    int getLifePoint(){
        return lifePoint;
    }

    void hit(GameCharacter charB){
        charB.lifePoint -= this.attackHitPoint;
    }

    void kick(GameCharacter charB){
        charB.lifePoint -= this.attackKickPoint;
    }

}

public class Game {
    public static void main(String[] args) {
        GameCharacter ryu = new GameCharacter("Ryu", 10,20);
        GameCharacter zen = new GameCharacter("Zen", 5, 25);

        
        ryu.kick(zen);

        zen.kick(ryu);
        
        for (int i = 0; i < 3; i++) {
            zen.hit(ryu);
        }
        
        for (int i = 0; i < 4; i++) {
            ryu.kick(zen);
        }

        System.out.println("Life point Ryu = "+ ryu.getLifePoint());
        System.out.println("Life point Zen = "+ zen.getLifePoint());
        System.out.println("<<<<<<<--->>>>>>>");
        //membuat perulangan untuk menentukan pemenang
        if (ryu.getLifePoint() > zen.getLifePoint()){
            System.out.println("Pemenangnya = "+ryu.getName());
        }else if (zen.getLifePoint() > ryu.getLifePoint()){
            System.out.println("Pemenangnya = "+zen.getName());
        }else {
            System.out.println("PERMAINAN DRAW");
        }
    }
}
