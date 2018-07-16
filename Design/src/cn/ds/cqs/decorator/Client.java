package cn.ds.cqs.decorator;

public class Client {
    public static void main(String[] args) {
        Component c = new ConcreateComponet();
        c = new ConcreateDecoreator1(c);
        c = new ConcreateDecoreator2(c);
        c.operation();
    }
}
