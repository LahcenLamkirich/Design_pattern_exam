package Exam.Observer;

public class ObserverImp1 implements Observer{

    @Override
    public void update(int state) {
        System.out.println("State of Observer 1 : " + state*10);
    }
}
