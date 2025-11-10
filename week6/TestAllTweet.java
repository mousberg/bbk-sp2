
public class TestAllTweet {
	public static void main(String[] args) {
		Animal[] animals = {
			new Animal(),
			new Bird(),
			null,
			new Bird(),
			new Animal()
		};
		
		System.out.println("Testing allTweet method:");
		Main.allTweet(animals);
	}
}
