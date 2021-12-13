package i2.logic;
import java.util.ArrayList;
public class Yard {
	//This id declaration and initialization of ArrayList
		private ArrayList<Train> listOfTrain=new ArrayList<Train>();
        public void addTrain(Train t) {
        		this.listOfTrain.add(t);
        }
        public void removeTrain(Train t) {
        	this.listOfTrain.remove(t);
	    }
        public void displayTrainDetails() {
		for(int i=0;i<this.listOfTrain.size();i++) {
			Train t=listOfTrain.get(i);
			listOfTrain.get(i).displayDetails();
			System.out.println(isTrainPresent(t));
		   }	
	    }
        public boolean isTrainPresent(Train t) {
        	return listOfTrain.contains(t);
        }

}
