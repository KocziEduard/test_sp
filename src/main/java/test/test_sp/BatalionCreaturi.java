package test.test_sp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BatalionCreaturi implements Creaturi{
    List<Creaturi> creaturi = new ArrayList<>();

    @Override
    public void add(Creaturi creatura){
        creaturi.add(creatura);
    }
    @Override
    public void remove(Creaturi creatura){
        creaturi.remove(creatura);
    }
}
