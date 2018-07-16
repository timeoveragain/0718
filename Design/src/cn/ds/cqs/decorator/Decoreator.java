package cn.ds.cqs.decorator;

public abstract  class Decoreator extends  Component{
    private Component component;

    public Decoreator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
