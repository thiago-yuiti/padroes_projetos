import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;
import Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck malllard = new MallardDuck();

        malllard.performQuack();

        malllard.perfomFly();


        Duck model = new ModelDuck();
        model.perfomFly();

        model.setFlyBehavior(new FlyRocketPowered());

        model.perfomFly();
    }
}
