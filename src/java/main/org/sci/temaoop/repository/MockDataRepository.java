package org.sci.temaoop.repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MockDataRepository {
    private static MockDataRepository instance=null;
    private static final Map<String, List<String>>carDefects=Collections.unmodifiableMap(createCarDefects());

    private static Map<String, List<String>> createCarDefects() {
        return null;
    }

    private MockDataRepository(){

    }

    public static MockDataRepository getInstance(){
        if(instance==null) instance = new MockDataRepository();
        return instance;
    }

}
