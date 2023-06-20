package org.launchcode.java.studio.restaurant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }


    public void updateMenu(MenuItem menuItem, String action) {
        if (action == "add") {
            menuItems.add(menuItem);
        } else if (action == "remove") {
            menuItems.remove(menuItem);
        } else {
            System.out.println("Not an accepted input: please include to either 'add' or 'remove' ");
        }
        lastUpdated =  new Date();
    }


    public void printItems(ArrayList menuItems, int index) {
//        if (index > menuItems.size()) {
//            System.out.println("enter a valid index to print an item");
//            return;
//        }

        if (index >= menuItems.size()) {
            System.out.println("***" + "\n");
            for (MenuItem anItem : this.menuItems) {
                System.out.println("item: " + anItem.toString() + "\n");
            }
            System.out.println("***");
        } else {
            MenuItem item = (MenuItem) menuItems.get(index);
            //test our determineNew method
//            System.out.println("item " + index + " pre determine: " + item.isNewItem());
//            item.determineNew();
//            System.out.println("item " + index + "post determine: " + item.isNewItem());

            System.out.println("item: " + item.toString() + "\n");


        }

    }
}




//Class: Menu
//        Properties:
//        - Requirement: The menu consists of several menu items
//        menuItems: Array<List>
//        - ** Option 1: ArrayList<MenuItem> menuItems
//        - Option 2: HashMap<x, MenuItem> menuItems
//        - X Option 3: MenuItem[10] (won't use because the size is not dyanmic)
//        - Requirement: The app should know when the menu was last updated, so visitors can see that the restaurant is constantly changing and adding exciting new items
//        lastUpdated:Date
//        - Option 1: Date lastUpdated
//        Methods (for next time):
//        - sort categories
//        - calculate Last Updated (based on MenuItems properties)

//        -addMenuItem
//        -print menu
//        -print menu item

//        ______________________________________________________________________________________________________
//        Class: MenuItem
//        Properties:
//        - Requirement: The app should know when the menu was last updated, so visitors can see that the restaurant is constantly changing and adding exciting new items
//        dateAdded: Date
//        - Option 1: Date dateAdded
//        - Requirement: It should be possible to display whether a menu item is new or not
//        isNew: Boolean
//        - Option 1: Boolean isNew
//        - Requirement: Each menu item has a price, description, and category (appetizer, main course, or dessert)
//        Price: Currency
//        - **Option 3: Currency price (for the precision in the decimal places)
//        Description: String
//        Name: String
//        Category:
//        - *Option 1: String
//        - *Option 2: Enum{appetizer, main, dessert}
//        Methods (for next time):
//        - determine if `new` based on the criteria (90 days or whatever we want)
//        __________________________________________________________________________________________________
//            ------Final Design!-------
//            *decided to make everything private until we can add access methods next time!
//

//        Menu
//        properties-
//        - menuItems: Array<List>
//        - lastUpdated: Date
//         methods-
//        - sortCategories
//        - lastUpdated: (), Date
//        - printItems: (ArrayList<MenuItem> menuItems), String
//        - compareItems: (ArrayList<MenuItem> menuItems), Boolean


//        MenuItem
//        properties-
//        - dateAdded: Date
//        - isNew: Boolean
//        - price: Currency
//        - description: String
//        - name: String
//        - category: String
//         methods-
//        - determineNew: (Date), Boolean