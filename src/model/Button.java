package model;

import enums.ButtonStatus;

public class Button {
    private int id;
    private int position;

    public ButtonStatus getStatus() {
        return status;
    }

    public void setStatus(ButtonStatus status) {
        this.status = status;
    }

    private ButtonStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Button(int id, int position,ButtonStatus status) {
        this.id = id;
        this.position = position;
        this.status = status;
    }
}
