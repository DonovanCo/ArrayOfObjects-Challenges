import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
public class Dog
	{
	private String name;
	private String breed;
	private int age;
	private double weight;
	
		
	public Dog(String n, String b, int a, double w)
	{
		name=n;
		breed=b;
		age=a;
		weight=w;
	}
	
	public String getName()
		{
		return name;
		}


	public String getBreed()
		{
		return breed;
		}


	public int getAge()
		{
		return age;
		}


	public double getWeight()
		{
		return weight;
		}

	
	
	

	public static void main(String[] args)
		{
		double totalAge=0;
		double totalWeight=0;
		ArrayList<Dog> kennel = new ArrayList<Dog>();
		
		kennel.add(new Dog("Coco", "German Shepard", 1, 9001));
		kennel.add(new Dog("Doge","Shibe Inu", 3, 12.1));
		kennel.add(new Dog("Tank", "Tibetan mastiff", 5, 300));
		kennel.add(new Dog("Timmah", "Cocker spaniel",2, 9.89));
		kennel.add(new Dog("Blue", "Golden retriever", 123456789, 0.0));
		
		for(int x=0; x<kennel.size(); x++)
			{
				System.out.println(kennel.get(x).getName()+" the "+kennel.get(x).getBreed()+" is "+kennel.get(x).getAge()+" years old and weighs "+kennel.get(x).getWeight()+ " pounds.");
				totalAge=totalAge+kennel.get(x).getWeight();
				totalWeight=totalWeight+kennel.get(x).getWeight();
			}
		System.out.println("The average age is "+totalAge/kennel.size());
		System.out.println("The total weight is "+totalWeight);

		}
	

	


	}
