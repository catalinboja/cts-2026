package ro.ase.csie.cts.design.patterns.builder;

public class Superhero {
	
	private String name;
	private boolean hasPositiveKarma;
	private int stamina;
	private String superPower;
	private String weapon;
	private int shieldLevel;
	
	private Superhero() {
		
	}

	public String getName() {
		return name;
	}

	public boolean isHasPositiveKarma() {
		return hasPositiveKarma;
	}

	public int getStamina() {
		return stamina;
	}

	public String getSuperPower() {
		return superPower;
	}

	public String getWeapon() {
		return weapon;
	}

	public int getShieldLevel() {
		return shieldLevel;
	}
	
	
	//setters are PRIVATE

	private void setName(String name) {
		this.name = name;
	}

	private void setHasPositiveKarma(boolean hasPositiveKarma) {
		this.hasPositiveKarma = hasPositiveKarma;
	}

	private void setStamina(int stamina) {
		this.stamina = stamina;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	private void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	private void setShieldLevel(int shieldLevel) {
		this.shieldLevel = shieldLevel;
	}

	public static class SuperheroBuilder {
		
		//Superhero hero = new Superhero();
		Superhero hero;
		
		public SuperheroBuilder(String name) {
			this.hero = new Superhero();
			this.hero.name = name;
		}
		
		public SuperheroBuilder addPositiveKarma() {
			this.hero.hasPositiveKarma = true;
			return this;
		}
		
		public SuperheroBuilder addStamina(int value) {
			this.hero.stamina = value;
			return this;
		}
		
		public SuperheroBuilder addSuperPower(String power) {
			this.hero.superPower = power;
			return this;
		}
		
		public SuperheroBuilder addWeapon(String weapon) {
			this.hero.weapon = weapon;
			return this;
		}
		
		public SuperheroBuilder addShield(int value) {
			this.hero.shieldLevel = value;
			return this;
		}
		
		public Superhero build() {
			return this.hero;
		}
	}
	
}





