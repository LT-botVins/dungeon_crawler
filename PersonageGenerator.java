package dungeon.crawler;

public class PersonageGenerator {
	
	double randomNumber;
	int alignment;
	
	public PersonageGenerator() {
		randomNumber = Math.random() * 100;
		
	}

	public int getAlignment() {
		return alignment;
	}
}