
public class Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Bird();
		Bird c = new Bird();
		Bird d = (Bird) b;
		Bird e = c;
		
		a.f("");
		b.f("");
		b.f("","");
		c.f("");
		c.f("","");
		d.f("");
		e.f("");
	}
	
	// Question 2: Add allTweet method
	public static void allTweet(Animal[] animals) {
		for (Animal ani : animals) {
			if (ani instanceof Bird) { // null instanceof ... is always false
				// ok, it's safe to cast to Bird, the object behind the reference
				// ani is of type Bird
				Bird birdie = (Bird) ani;
				birdie.tweet();
			}
		}
	}
}
