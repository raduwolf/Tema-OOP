package org.sci.temaoop.interfaces;

import java.util.Map;

public interface CarRepairOperations {
    public Map<String,String>getBillingInfo();
    public Map<String,String>createRepairOrderBody();
}
