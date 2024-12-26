public class Testprogram {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter("Fahadi", "soldier", 100);
        System.out.println("Character1"+character1.getInf());
        character1.changeHealth(-60);
        System.out.println("Character1"+character1.getInf());
        
        GameCharacter character2 = new GameCharacter("SAID", "scout", 50);
        System.out.println("Character2"+character2.getInf());
        character2.changeHealth(30);
        System.out.println("Character1"+character2.getInf());

        GameCharacter character3 = new GameCharacter("ALY", "medic", 30);
        System.out.println("Character3"+character3.getInf());
        character3.changeHealth(-70);
        System.out.println("Character3"+character3.getInf());
    }
     
}
