package org.sci.temaoop.consumers;

import org.sci.temaoop.abstractclasses.Car;
import org.sci.temaoop.interfaces.CarRepairOperations;
import org.sci.temaoop.models.Truck;
import org.sci.temaoop.models.Van;

import java.util.Map;

public class CarRepairWorkOrder implements CarRepairOperations {
 private Car car;

    @Override
    public Map<String, String> getBillingInfo() {


        return null;
    }

    @Override
    public Map<String, String> createRepairOrderBody() {
        if(this.car instanceof Van){

        }else if (this.car instanceof Truck){

        }else{

        }
        return null;
    }
}
