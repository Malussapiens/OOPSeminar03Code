package Seminar03.Program.Classes;

public class SeniorSchoolKid extends SchoolKid implements Smoker, Loveable{
    public void study() {
        System.out.println("Я должен учиться...");
    }

    public void love() {
        System.out.println("Я ищу пару...");
    }

    public void smoke() {
        System.out.println("Я бросаю курить...");
    }
}
