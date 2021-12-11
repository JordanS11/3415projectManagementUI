package Main;

//restaurant reservation
public class RestaurantReservation {

    //variables
    public int RRNum;
    public String name;
    public String guests;
    public String date;
    public String time;

    //constructor
    public RestaurantReservation() {

    }

    //constructorint rn, 
    public RestaurantReservation(String n, String g, String d, String t) {
        //RRNum = rn;
        name = n;
        guests = g;
        date = d;
        time = t;
    }

    //setting all variablesint rn, 
    public void set(String n, String g, String d, String t) {
        //RRNum = rn;
        name = n;
        guests = g;
        date = d;
        time = t;
    }
    
    //printing info
    public String print() {
        return("Name: " + name + "\nNumber of guests: " + guests + "\nDate: " + date + "\nTime: " + time);
    }

}
