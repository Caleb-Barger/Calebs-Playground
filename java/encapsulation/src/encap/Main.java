package encap;

public class Main {
	public static void main(String[] args) {
		EnhancedPlayer ep = new EnhancedPlayer("Caleb", 40, "Sword");
		System.out.println(ep.getHealth());
		ep.looseHealth(10);
		System.out.println(ep.getHealth());
	}

}
