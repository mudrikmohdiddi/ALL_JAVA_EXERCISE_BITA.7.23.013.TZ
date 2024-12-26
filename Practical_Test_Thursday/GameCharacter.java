public class GameCharacter {
    private String name;
    private String type;
    private int curHealth;
    public GameCharacter( String newName, String newType,int newCurHealth ){
        name = newName;
        type = newType;
        curHealth = newCurHealth;
    }
    public void changeHealth( int change ){
        curHealth += change;
        if(curHealth < 0){
            System.out.println("Your character is dead");
        }
    }
    public String getInf(){
        return String.format("\nCharacter name is %s\nCharacter type is %s\nCharacter health is %d\n\n",this.name,this.type,this.curHealth);
    }
}
