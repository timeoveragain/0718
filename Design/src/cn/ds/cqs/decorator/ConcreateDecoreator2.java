package cn.ds.cqs.decorator;

public class ConcreateDecoreator2 extends Decoreator {
    public ConcreateDecoreator2(Component component) {
        super(component);
    }

    public void decoreatorOperate(){
        System.out.println("ConcreateDecoreator2 opreate()");
    }

    @Override
    public void operation() {
        super.operation();
        decoreatorOperate();
    }
}
