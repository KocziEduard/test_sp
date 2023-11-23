package test.test_sp;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class BatalionUmanoizi extends Batalion implements Umanoizi{
    List<Umanoizi> umanoizi = new ArrayList<>();
    @Override
    public void add(Umanoizi umanoid){
        umanoizi.add(umanoid);
    }
    @Override
    public void remove(Umanoizi umanoid){
        umanoizi.remove(umanoid);
    }

}
