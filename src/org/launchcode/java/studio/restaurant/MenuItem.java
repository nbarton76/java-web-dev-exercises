package org.launchcode.java.studio.restaurant;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private Enum category;
    private boolean newItem = false;
    private Date updated;

    public MenuItem(double price, String description, Enum category, boolean newItem, Date updated, String name) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.updated = updated;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enum getCategory() {
        return category;
    }

    public void setCategory(Enum category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + "\n" + (isNewItem() ? "new!!" + "\n" : "")  +  "price: " + price + "\n" + "desc: " + description  + "\n" + "category: " + category;
    }

    public void determineNew() {
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date today30 = cal.getTime();

        if (this.updated.after(today30)) {
            this.newItem = true;
        } else {
            this. newItem = false;
        }
    }

    public boolean equals(MenuItem comparison) {
        if (comparison == this) {
            return true;
        }

        if (comparison == null) {
            return false;
        }

        if (comparison.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription() == getDescription();
    }

}


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
}