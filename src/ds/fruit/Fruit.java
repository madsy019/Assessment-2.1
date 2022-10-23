package ds.fruit;
import java.lang.Comparable;
import java.util.Objects;

import ds.tests.InvalidFruitRipenessException;
import ds.tests.InvalidFruitWeightException;

public class Fruit implements Comparable<Fruit>{
	//enum values declared 
	public enum TYPE {
		APPLE, PEAR, BANANA, GRAPE ;
	}
	
	//private variable to assign the enum values
	private TYPE fruitName ;
	
	private double weight = 0.0;//weight in kg
	
	private double ripeness = 0.0;//variable to hold ripeness of the fruit as a percentage  between 0 and 1 
	
	//empty constructor for fruit class
	public Fruit() {
		
	}

	//constructor which accepts the enum value, the weight and ripeness to create a fruit object 
	public Fruit( TYPE fruitName, double weight ,double ripeness) throws InvalidFruitWeightException, InvalidFruitRipenessException{
		//Exception to that throws when weight is invalid
		if (weight <0) {
			throw new InvalidFruitWeightException("Invalid weight");
		}
		//Exception to that throws when ripeness is invalid
		if (ripeness < 0 || ripeness > 1) {
			throw new InvalidFruitRipenessException("Invalid ripeness");
		}
		
		this.fruitName = fruitName;
		this.weight = weight;
		this.ripeness = ripeness;
	}
	
	//get the enum value 
	public TYPE getType() {
		return fruitName;
	}

	//get the weight 
	public double getWeight() {
		return weight;
	}
	//get the ripeness value
	public double getRipeness() {
		return ripeness;
	}

	//hash code for the fruit class
	@Override
	public int hashCode() {
		return Objects.hash(fruitName, ripeness, weight);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return fruitName == other.fruitName
				&& Double.doubleToLongBits(ripeness) == Double.doubleToLongBits(other.ripeness)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);

	}
	//to string method for fruit class 
	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", weight=" + weight + ", ripeness=" + ripeness + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return (int) (this.weight - o.weight);
	}





	




}
