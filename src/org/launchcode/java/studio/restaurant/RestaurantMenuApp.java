package org.launchcode.java.studio.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RestaurantMenuApp {
    public static void main(String[] args){
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -32);
        Date old = cal.getTime();

        MenuItem newItem1 = new MenuItem(4.99, "Garlic linguine", Categories.Main, true, today, "yummy" );
        MenuItem newItem2 = new MenuItem(6.99, "Really good steak", Categories.Dinner, false, today,"yummy2");
        MenuItem newItem3 = new MenuItem(2.99, "Delicious wings", Categories.Desert, true,old, "yummy3");


        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(startingMenu, today);

        ourMenu.updateMenu(newItem1, "add");
        ourMenu.updateMenu(newItem2, "add");
        ourMenu.updateMenu(newItem3, "add");

        ourMenu.printItems(startingMenu, 0);

        ourMenu.printItems(startingMenu, 1);

        ourMenu.updateMenu(newItem2, "remove");

        ourMenu.printItems(startingMenu, 3);
        ourMenu.printItems(startingMenu, 2);

        newItem2.determineNew();
        newItem3.determineNew();


        ourMenu.updateMenu(newItem2, "add");
        ourMenu.printItems(startingMenu, 3);


    }

}