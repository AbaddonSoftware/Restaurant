package com.abaddon880.restaurant;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem primeRib = new MenuItem("Prime Rib", "$15.50" , "A Sirloin Steak served with a baked potato and one additional side.", "entree", false );
        MenuItem sirloin = new MenuItem("Sirloin", "$15.50" , "A Sirloin Steak served with a baked potato and one additional side.", "entree", false );
        MenuItem smurgberryPie = new MenuItem("Smurgberry Pie", "$4.50", "A delicacy hailing from the land of the smurgs.", "dessert", false );
        MenuItem chickenLasagna = new MenuItem("Chicken Lasagna", "$9.50", "It's the cheesiest.", "entree", true);
        MenuItem binarySoup = new MenuItem("Binary Soup", "$6.50", "It's just alphabet soup but we ate all the letters besides the Os and Is", "entree", false);
        MenuItem smile = new MenuItem("Smile", "Free", "We'll even throw in a glass of ice water.", "other item", false);
        MenuItem bloomingOnion = new MenuItem("Blooming Onion", "$8.00", "It's bloomtastic... but don't tell the aussies.", "appetizer", false);
        MenuItem bloomingOnionOnFire = new MenuItem("Blooming Onion on fire", "$8.00", "It will burn your hands and later your mouth!", "appetizer", true);
        MenuItem greenBeans = new MenuItem("Green Beans", "Free with entree, 50\u00A2 without.", "Beeaaansss!!", "side", false);
        MenuItem bakedPotatoes = new MenuItem("Baked Potato", "Free with entree, $1.25 without.", "They used to say potatoes were magical. Ok \"they\" didn't, it was just me.", "side", false);
        List<MenuItem> itemList = Arrays.asList(primeRib, primeRib, sirloin, smurgberryPie, chickenLasagna, binarySoup, bakedPotatoes, smile, bloomingOnion, bloomingOnionOnFire, greenBeans);

        Menu theMenu = new Menu(itemList);
        theMenu.printMenu();
        System.out.println("***printMenuItem method called on a menu item***");
        primeRib.printItem();
        theMenu.removeMenuItem(sirloin);
        theMenu.printMenu();
        MenuItem laugh = copyMenuItem(smile);
        theMenu.addMenuItem(laugh);
        laugh.setItemName("Laugh");
        laugh.setDescription("Be careful, it's almost as contagious as COVID19");

        theMenu.addMenuItem(laugh);
        theMenu.printMenu();
    }

    public static MenuItem copyMenuItem(MenuItem menuItem) {
        MenuItem newItem = new MenuItem(menuItem.getItemName(),
                                        menuItem.getPrice(),
                                        menuItem.getDescription(),
                                        menuItem.getCategory(),
                                        menuItem.isNew() );
        return newItem;
    }
}
