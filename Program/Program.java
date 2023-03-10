package Seminar03.Program;

import java.util.ArrayList;

import Seminar03.Program.Classes.Aftercareable;
import Seminar03.Program.Classes.JuniorSchoolKid;
import Seminar03.Program.Classes.Loveable;
import Seminar03.Program.Classes.MiddleSchoolKid;
import Seminar03.Program.Classes.Playable;
import Seminar03.Program.Classes.SchoolKid;
import Seminar03.Program.Classes.SeniorSchoolKid;
import Seminar03.Program.Classes.Smoker;

public class Program {
    public static void doAll(SchoolKid schoolKid) {
        System.out.println(schoolKid.getClass().getSimpleName());
        schoolKid.study();
        if (schoolKid instanceof Aftercareable) {
            ((Aftercareable) schoolKid).goToAftercare();
        }
        if (schoolKid instanceof Playable) {
            ((Playable) schoolKid).play();
        }
        if (schoolKid instanceof Smoker) {
            ((Smoker) schoolKid).smoke();
        }
        if (schoolKid instanceof Loveable) {
            ((Loveable) schoolKid).love();
        }
    }

    public static void main(String[] args) {
        ArrayList<SchoolKid> students = new ArrayList<>();
        students.add(new JuniorSchoolKid());
        students.add(new MiddleSchoolKid());
        students.add(new SeniorSchoolKid());

        for (SchoolKid schoolKid : students) {
            doAll(schoolKid);
        }
    }
}
