package encap;

public class Player {
	public String name;
	public String health;
	public String weapon;

	public Player() {}

	public void loseHelath(int dmg) {
		this.health -= dmg;
		if (this.health <= 0) {
			System.out.println("Player Knocked Out");
		}
	}

	public int healthReamaining() {
		return this.health;
	}
}
