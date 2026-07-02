// CHAINING METHOD (1):
package OOP;

class Country{
    String cname;
    int nPeople;
    double gdp;
    String lang;
    String currency;

    Country(){ // (1)
        this("America",120,87.5,"English","Dollar");
        System.out.println("1st called");
    }

    Country(String cname){ // (2)
        this(cname,0,0.0,"unknown","unknown");
        System.out.println("2nd called");
    }

    Country(String cname,int nPeople){ // (3)
        this(cname,nPeople,0.0,"unknown","unknown");
        System.out.println("3rd called");
    }

    Country(String cname,int nPeople,double gdp){ // (4)
        this(cname,nPeople,gdp,"unknown","unknown");
        System.out.println("4th called");
    }

    Country(String cname,int nPeople,double gdp,String lang){ // (5)
        this(cname,nPeople,gdp,lang,"unknown");
        System.out.println("5th called");
    }


    Country(String cname,int nPeople,double gdp,String lang,String currency) { // (6)
        this.cname = cname;
        this.nPeople = nPeople;
        this.gdp = gdp;
        this.lang = lang;
        this.currency = currency;
        System.out.println("6th called");

    }
}


public class ChainingMethod1 {
    public static void main(String[] args) {
        Country c1=new Country();
        Country c2=new Country("Brazil");
        Country c3=new Country("NetherLand",130);
        Country c4=new Country("Spain",200,42.9);
        Country c5=new Country("India",200,142.9,"Hindi");
        Country c6=new Country("Brazil",180,77.343,"English","Rubel");

        System.out.println("***************************");

        System.out.println(c1.cname);
        System.out.println(c1.nPeople);
        System.out.println(c1.gdp);
        System.out.println(c1.lang);
        System.out.println(c1.currency);

        System.out.println("***************************");

        System.out.println(c2.cname);
        System.out.println(c2.nPeople);
        System.out.println(c2.gdp);
        System.out.println(c2.lang);
        System.out.println(c2.currency);

        System.out.println("***************************");


        System.out.println(c3.cname);
        System.out.println(c3.nPeople);
        System.out.println(c3.gdp);
        System.out.println(c3.lang);
        System.out.println(c3.currency);

        System.out.println("***************************");


        System.out.println(c4.cname);
        System.out.println(c4.nPeople);
        System.out.println(c4.gdp);
        System.out.println(c4.lang);
        System.out.println(c4.currency);

        System.out.println("***************************");


        System.out.println(c5.cname);
        System.out.println(c5.nPeople);
        System.out.println(c5.gdp);
        System.out.println(c5.lang);
        System.out.println(c5.currency);

        System.out.println("***************************");

        System.out.println(c6.cname);
        System.out.println(c6.nPeople);
        System.out.println(c6.gdp);
        System.out.println(c6.lang);
        System.out.println(c6.currency);



    }
}
