package learnscala;

class Counteri{
	private int value = 0;
	public boolean isLess(Counteri other) {
		return value < other.value; // because isLess is part of the other object def also 
	}
}


public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
