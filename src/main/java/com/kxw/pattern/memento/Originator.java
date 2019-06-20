package com.kxw.pattern.memento;

import lombok.Data;

/**
 * 要被记录的对象
 */
@Data
public class Originator {

    private String state;


    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}