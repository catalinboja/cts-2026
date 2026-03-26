package ro.ase.csie.cts.design.pattern.builder;

public class Superhero {
	
	private String name;
	private int stamina;
	private boolean hasGoodKarma;
	private String superPower;
	private String extraPower;
	private String weapon;
	private boolean isWounded;
	
	private Superhero() {
		
	}

	public String getName() {
		return name;
	}

	public int getStamina() {
		return stamina;
	}

	public boolean isHasGoodKarma() {
		return hasGoodKarma;
	}

	public String getSuperPower() {
		return superPower;
	}

	public String getExtraPower() {
		return extraPower;
	}

	public String getWeapon() {
		return weapon;
	}

	public boolean isWounded() {
		return isWounded;
	}
	
	//setters should be private or not implemented at all
	public static class SuperheroBuilder {
		
		private Superhero hero;
		
		public SuperheroBuilder(String name) {
			this.hero = new Superhero();
			this.hero.name = name;
		}
		
		public SuperheroBuilder addStamina(int value) {
			this.hero.stamina = value;
			return this;
		}
		
		public SuperheroBuilder hasGoodKarma() {
			this.hero.hasGoodKarma = true;
			return this;
		}
		
		public SuperheroBuilder addSuperPower(String power) {
			this.hero.superPower = power;
			return this;
		}
		
		public SuperheroBuilder addExtraPower(String power) {
			this.hero.extraPower = power;
			return this;
		}
		
		public SuperheroBuilder addWeapon(String weapon) {
			this.hero.weapon = weapon;
			return this;
		}
		
		public SuperheroBuilder isWounded() {
			this.hero.isWounded = true;
			return this;
		}	
		
		public Superhero build() {
			return this.hero;
		}
		
	}
	
	

}





