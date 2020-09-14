package encap;

public class Main {
	public static void main(String[] args) {
		Player player = new Player;
		player.name = "Caleb";
		player.health = 20;
		player.weapon = "Sword";

		int dmg = 10;
		player.loseHealth(dmg);
		System.out.println(player.healthReamaining());
	}

}
