package test.test_sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Batalion {
    BatalionUmanoizi batalion1;
    BatalionCreaturi batalion2;

    public Batalion(){

    }
    @Autowired
    public Batalion( BatalionUmanoizi batalion1, BatalionCreaturi batalion2){
        this.batalion1 = batalion1;
        this.batalion2 = batalion2;
    }
}
