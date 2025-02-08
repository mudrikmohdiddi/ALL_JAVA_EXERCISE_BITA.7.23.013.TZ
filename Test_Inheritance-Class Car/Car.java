public class Car{
    private int intspeed;
    private double doubleregularPrice;
    private String Stringcolor;
    public Car(int intspeed,double doubleregularPrice,String Stringcolor){
        this.intspeed = intspeed;
        this.doubleregularPrice = doubleregularPrice;
        this.Stringcolor = Stringcolor;
    }
    public double doublegetSalePrice(){
        return doubleregularPrice;
    }
}