package Main;

//hotel reservation
public class HotelReservation {

    //variables
    public int HRNum;
    public String name;
    public String room;
    public String lakeside;
    public String beds;
    public String Package;
    public String date;
    public String length;
    public String price;

    //constructor
    public HotelReservation() {

    }

    //constructor
    public HotelReservation(String n, String r, String la, String b, String p, String d, String ln, String pr) {

        name = n;
        room = r;
        lakeside = la;
        beds = b;
        Package = p;
        date = d;
        length = ln;
        price = pr;
    }

    //set all variables
    public void set(String n, String r, String la, String b, String p, String d, String ln, String pr) {
        name = n;
        room = r;
        lakeside = la;
        beds = b;
        Package = p;
        date = d;
        length = ln;
        price = pr;
    }
    
    public void setHRNum(int n){
        HRNum = n;
    }
    
    public int getHRNum(){
        return HRNum;
    }

    //show booking
    public String print() {        
        return("Name: " + name + "\nType of room: " + room + "\nLakeview: " + lakeside + "\nType of beds; " + beds + "\nPackage: " + Package
                + "\nDate: " + date + "\nLength of stay: " + length + "day(s) \nPrice: " + price);
    }

}
