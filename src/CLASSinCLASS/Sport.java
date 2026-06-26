package CLASSinCLASS;

class Cricket {

    Player p1 = new Player();

    void show() {
        p1.name = "Kohli";
        p1.age = 36;
        p1.team = "India";
        System.out.println(p1.name);
    }

    void bowling(Player p){
        p.name="bumrah";
        System.out.println(p.name+" is best bowler");
    }

    Player batting(){
        Player player=new Player();
        player.name="dhoni";
        System.out.println("dhoni is good batter");
        return player;
    }
}

public class Sport {
    public static void main(String[] args) {
        Player p=new Player();

        Cricket c1=new Cricket();
        c1.show();
        c1.bowling(p);

        Player P=c1.batting();
        System.out.println("batter is : "+P.name);

    }
}
