package day_37_Inheritance.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

   public ProductOwner PO ;
   public  BusinessAnalyst BA;
   public  ScrumMaster SM;



    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters (Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(p-> p.ID==id);
    }

    public void adddeveloper(Developer developer){
        developers.add(developer);
    }
    public void adddevelopers (Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removedeveloper(int id){
        developers.removeIf(p-> p.ID==id);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
