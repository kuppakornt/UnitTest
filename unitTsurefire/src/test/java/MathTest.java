
public class MathTest{
    public void test001(){
        Math a = new Math();
        double t0 = a.getVolume(10, 10, 10);
        assert 1000 == t0;
    }
    public void test002(){
        Math a = new Math();
        double t1 = a.setReduceVolume20(1000);
        assert 800 == t1;
    }
    public void test003(){
        Math a = new Math();
        double t2 = a.setGainVolume15(1000);
        assert t2 == 1150;
    }
    public void test004(){
        Math a = new Math();
        double t3 = a.setRectangularVolume(10, 10, 10);
        assert t3 == 2000;
    }
}