package model;

import enums.SpecialEntityType;

public class SpecialEntity {
    SpecialEntityType type;
    int from;

    public SpecialEntityType getType() {
        return type;
    }

    public void setType(SpecialEntityType type) {
        this.type = type;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    int to;
}
