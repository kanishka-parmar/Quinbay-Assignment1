package Ch_9.Exercise.Pg_269_Popular_Objects;

//Question:-
/*
In this code example, several new objects are created. Your challenge is to find the object that is most popular
i.e., the one that has the most reference variables referring to it. Then list how many total references there are
for that object, and what they are! We’ll start by pointing out one of the new objects and its reference variable.
 */


public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey(); //1
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot}; //4
        Bees bees = new Bees();
        bees.beeHoney = ha; //1
        Bear[] bears = new Bear[5];
        for (int i = 0; i < 5; i++) {
        bears[i] = new Bear();
        bears[i].hunny = honeyPot; //5
        }
        Kit kit = new Kit();
        kit.honey = honeyPot; //1
        Raccoon raccoon = new Raccoon();
        raccoon.rh = honeyPot; //1
        raccoon.rk = kit; //1
        kit = null;
        } // end of main 
}

class Bees {
    Honey[] beeHoney;
    }
    class Raccoon {
    Kit rk;
    Honey rh;
    }
    class Kit {
    Honey honey;
    }
    class Bear {
    Honey hunny;
    }

/*
Solution:-
Honey object is most popular the one that has the most reference variables referring to it.
There are total 14 references out of which 12 references to Honey object are alive and 2 references are set to null or killed at the end:-
Honey honeyPot = new Honey();  //1
Honey[] ha = {honeyPot, honeyPot,honeyPot, honeyPot}; //4
bees.beeHoney = ha; //1
bears[i].hunny = honeyPot; //5
raccoon.rh = honeyPot; //1

kit.honey = honeyPot; //1 //null
raccoon.rk = kit; //1 //null
 */