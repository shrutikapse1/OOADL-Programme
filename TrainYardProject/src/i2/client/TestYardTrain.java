package i2.client;
import i2.logic.Yard;
import i2.logic.Train;
public class TestYardTrain {

	public static void main(String[] args) {
		Yard y=new Yard();
		Train t1=new Train("UP4053");
		y.addTrain(t1);
		Train t2=new Train("DN3021");
		y.addTrain(t2);
		Train t3=new Train("DN4067");
		y.addTrain(t3);
		Train t4=new Train("UP1025");
		y.addTrain(t4);
		Train t5=new Train("UP2024");
		y.addTrain(t5);
		System.out.println("Is train 4 Present:"+y.isTrainPresent(t4));
		y.displayTrainDetails();
		y.removeTrain(t2);
		
		
		
	}

}
