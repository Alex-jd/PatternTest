package Test;

import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;
import FlyBehavior.FlyRocketPowered;
import FlyBehavior.FlyWithWings;;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}

}
