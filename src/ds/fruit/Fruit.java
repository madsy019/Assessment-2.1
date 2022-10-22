package ds.fruit;
import java.lang.Comparable;
import java.util.Objects;

public class Fruit {
	
	public enum TYPE {
		APPLE, PEAR, BANANA, GRAPE ;
	}
	
	private TYPE fruitName ;
	
	private double weight = 0.0;//weight in kg
	
	private double ripeness = 0.0;//variable to hold ripeness of the fruit as a percentage  between 0 and 1 
	
	public Fruit() {
		
	}

	public Fruit( TYPE fruitName, double weight ,double ripeness){
		
		this.fruitName = fruitName;
		this.weight = weight;
		this.ripeness = ripeness;
	}
	
	public TYPE getType() {
		return fruitName;
	}

	public double getWeight() {
		return weight;
	}

	public double getRipeness() {
		return ripeness;
	}

	
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






}
