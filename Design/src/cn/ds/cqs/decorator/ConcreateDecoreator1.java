package cn.ds.cqs.decorator;

public class ConcreateDecoreator1 extends Decoreator {
    public ConcreateDecoreator1(Component component) {
        super(component);
    }
    public void decoreatorOperate(){
        System.out.println("ConcreateDecoreator1 opreate()");
    }

    @Override
    public void operation() {
        decoreatorOperate();
        super.operation();
    }
}
