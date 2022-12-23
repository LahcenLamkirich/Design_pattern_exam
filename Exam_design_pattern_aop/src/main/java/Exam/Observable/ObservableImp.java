package Exam.Observable;

import Exam.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp implements Observable{

    int state ;
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(state);
        }
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }

    public int getState() {
        return state;
    }

}
