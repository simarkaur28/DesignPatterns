package Factory;
import Factory.interfaces.HamburgerStore;
import Factory.model.CheeseBurger;
import Factory.model.Hamburger;
import Factory.model.JamHamburgerstore;
import Factory.model.MozHamburgerStore;
public class main {

    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");

    }
}
