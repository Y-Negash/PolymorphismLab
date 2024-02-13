import interfaces.ISell;

import java.util.ArrayList;

public class MotorDealership {

    protected ArrayList<ISell> storage;
    public MotorDealership(){
        this.storage = new ArrayList<>();
    }
    public void addProducts(ISell product){
        this.storage.add(product);
    }

    public int productCount() {
        return  this.storage.size();
    }

}

