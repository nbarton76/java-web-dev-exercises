package org.launchcode.java.studio.restaurant;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    public Date dateAdded;
    private Double price;
    private boolean isNew;

    public MenuItem(String name, String category, String description, Date dateAdded, Double price){
        this.name = name;
        this.category = category;
        this.description = description;
        this.dateAdded = dateAdded;
        this.price = price;

    }
    public String getName() {
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
    public Date getDateAdded(){
        return this.dateAdded;
    }
    public Double getPrice(){
        return this.price;
    }
    public boolean getIsNew(){
        return this.isNew;
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }
    public void setDateAdded(Date aDateAdded){
        this.dateAdded = aDateAdded;
    }
    public void setPrice(Double aPrice){
        this.price = aPrice;
    }
    public void setIsNew(boolean aIsNew){
        this.isNew = aIsNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return isNew == menuItem.isNew && getName().equals(menuItem.getName()) && getCategory().equals(menuItem.getCategory()) && getDescription().equals(menuItem.getDescription()) && getDateAdded().equals(menuItem.getDateAdded()) && getPrice().equals(menuItem.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory(), getDescription(), getDateAdded(), getPrice(), isNew);
    }
}