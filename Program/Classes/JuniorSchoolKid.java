package Seminar03.Program.Classes;

public class JuniorSchoolKid extends SchoolKid implements  Playable, Aftercareable {
    public void study() {
        System.out.println("Я люблю учиться!");
    }

    public void play() {
        System.out.println("Я играю в игрушки!");
    }

    public void goToAftercare() {
        System.out.println("Я хожу в продленку.");
    }
}
