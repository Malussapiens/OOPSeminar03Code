package Seminar03.Program.Classes;

public class MiddleSchoolKid extends SchoolKid implements Playable, Smoker{
    public void study() {
        System.out.println("Я ненавижу учиться!");
    }

    public void play() {
        System.out.println("Я играю в Brawl Stars!");
    }

    public void smoke() {
        System.out.println("Я начинаю курить...");
    }
}
