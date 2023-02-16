package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int topping;
     Boolean isExtraCheeseAdded;

     Boolean isToppingAdded;

     Boolean isBillCreated;

     Boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.topping = 70;
        }
        else
        {
         this.price=400;
         this.topping = 120;
        }
        this.isBillCreated = false;
        this.isToppingAdded = false;
        this.isTakeAway = false;
        this.isExtraCheeseAdded = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
      if(!isExtraCheeseAdded){
          this.price+=80;
          this.isExtraCheeseAdded = true;
      }
    }

    public void addExtraToppings(){
        if (!isToppingAdded){
            this.price+=this.topping;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price+=20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill += "Extra Cheese Added: 80"+"\n";
            }
            if(isToppingAdded){
                this.bill+="Extra Toppings Added: "+this.topping+"\n";
            }
            if(isTakeAway){
                this.bill+="Paperbag Added: 20\n";
            }
            this.bill+="Total Price: "+this.price;
            this.isBillCreated = true;
            return this.bill;
        }
       return "";
    }
}
