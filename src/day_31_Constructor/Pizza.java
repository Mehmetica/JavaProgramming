package day_31_Constructor;

public class Pizza {

    char size;
    public  int numberofCheeseTopping, numberOfPepperonTopping;


    public Pizza(char size, int numberofCheeseTopping, int numberOfPepperonTopping) {
        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperonTopping = numberOfPepperonTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberOfPepperonTopping=" + numberOfPepperonTopping +
                ", total=" + calcCost()+
                '}';
    }
    public  int calcCost(){
        int startPrice =0;
        if (size=='S') startPrice=10;
        if (size=='M') startPrice=12;
        if (size=='L') startPrice=14;

        int total = startPrice +(numberofCheeseTopping+numberOfPepperonTopping)*2;
        return total;
    }


  /*  public  int calcCost(Pizza pizza){
        int total=0;
        int topping= pizza.numberofCheeseTopping+ pizza.numberOfPepperonTopping;

        switch (pizza.size){
            case "S": total=10+(2*topping);
            break;
            case "M" : total=12+(2*topping);
            break;
            case "L" : total=14+(2*topping);
                break;
            default:
                System.out.println("Invalid data");
        }

        return total;


    }*/



}
