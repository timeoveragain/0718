package cn.ds.cqs.decorator;

public class ConcreateComponet extends Component {
    @Override
    public void operation() {
        System.out.println("被装饰类的方法");
    }
}
