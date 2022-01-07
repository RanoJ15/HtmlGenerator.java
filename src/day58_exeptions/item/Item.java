package day58_exeptions.item;

public class Item {

    /*
    create a class Item
    instance variable name
    initialize name in constructor
    instance method: use()
        "using item"
create a class Book
    child of Item class
    set name as "Book"
    override use method
        reading book
create a class Eragon
    child of Book class
    set name as "Eragon"
    override use method
        reading Eragon
     */

    String name;

    public Item(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Using item");


    }
}
