package Exam.Observer;

public class ObserverImp2 implements Observer{

    @Override
    public void update(int state) {
        System.out.println("State of Observer 2 : " + state*20);
    }
}
