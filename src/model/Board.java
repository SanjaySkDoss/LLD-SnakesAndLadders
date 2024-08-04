package model;

import java.util.Map;

public class Board {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Integer, SpecialEntity> getSpecialEntityMap() {
        return specialEntityMap;
    }

    public void setSpecialEntityMap(Map<Integer, SpecialEntity> specialEntityMap) {
        this.specialEntityMap = specialEntityMap;
    }

    private Map<Integer,SpecialEntity> specialEntityMap;
}
