public class Sedan extends Car{
    private int intlength;
    public Sedan(int intspeed,double doubleregularPrice,String Stringcolor,int intlength){
        super(intspeed,doubleregularPrice,Stringcolor);
        this.intlength = intlength;
    }
    @Override
    public double doublegetSalePrice(){
        if(intlength > 20){
            return super.doublegetSalePrice()*95/100;
        }
        else{
            return super.doublegetSalePrice()*90/100;
        }
        
    }
}
