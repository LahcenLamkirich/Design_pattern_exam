package Exam.Observable;

import Exam.Observer.Observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
