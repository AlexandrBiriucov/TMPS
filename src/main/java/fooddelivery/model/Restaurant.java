package src.main.java.fooddelivery.model;

public class Restaurant {

String name;
String location;
Menu menu;

    public Restaurant(String name,String location,Menu menu){
        this.name=name;
        this.location= location;
        this.menu = menu;
    }
// public void printMenu(Menu menu);

// }

    public String getName(){

        return this.name;

    }


    public String getLocation(){
        return  this.location;
    }

    public Menu getMenu(){
        return this.menu;

    }

}