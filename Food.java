class Food

{

private int cal;

private int price;

private int weight;

public Food(int cal, int price, int weight)

{

this.cal = cal;

this.price = price;

this.weight = weight;

}

public int getcal(){

return cal;

}

public void setcal(int cal){

this.cal=cal;

}

public int getprice(){

return price;

}

public void setprice(int price){

this.price=price;

}

public int getweight(){

return weight;

}

public void setweight(int weight){

this.weight=weight;

}

public String toString(){

return "칼로리:"+cal+" 가격:"+price+" 무게:"+weight;

}

}

class Melon extends Food

{

private String farminfo;

public String getfarminfo(){

return farminfo;

}

public void setFarminfo(String farinfo){

this.farminfo=farminfo;

}

public Melon(int cal, int price, int weight, String farminfo)

{

super(cal, price, weight);

this.farminfo = farminfo;

}

public String toString()

{

return super.toString()+ " 농원정보: " + getfarminfo();

}

}

