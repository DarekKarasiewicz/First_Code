package pl.darekkarasiewicz;

public class Guest {
    private  String name;
    private String meal;
    private int phonenumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phonenumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phonenumber = phonenumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public  void displayGuestInformation(){
        System.out.println("Imie: "+name);
        System.out.println("Preferowany posiłek : "+meal);
        System.out.println("Nr. Tlefonu : " + phonenumber);
        String isVeganSting = isVegan ? "Tak" :"Nie";
        System.out.println("Weganin? "+isVeganSting);
    }
}
