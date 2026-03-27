package ro.ase.csie.cts.design.patterns.builder;

public class Superhero {

	private String name;
	private int stamina;
	private int power;
	private boolean hasGoodKarma;
	private boolean isWounded;
	private String superPower;
	private String extraPower;
	
	// constructor must be private - builder is the only way to create objects
	private Superhero() {
		
	}
	
	private Superhero(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getStamina() {
		return stamina;
	}

	public int getPower() {
		return power;
	}

	public boolean isHasGoodKarma() {
		return hasGoodKarma;
	}

	public boolean isWounded() {
		return isWounded;
	}

	public String getSuperPower() {
		return superPower;
	}

	public String getExtraPower() {
		return extraPower;
	}
	
	
	// setters must be private because we don't allow 
	//	changing values after creating objects
	private void setName(String name) {
		this.name = name;
	}

	private void setStamina(int stamina) {
		this.stamina = stamina;
	}

	private void setPower(int power) {
		this.power = power;
	}

	private void setHasGoodKarma(boolean hasGoodKarma) {
		this.hasGoodKarma = hasGoodKarma;
	}

	private void setWounded(boolean isWounded) {
		this.isWounded = isWounded;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	private void setExtraPower(String extraPower) {
		this.extraPower = extraPower;
	}
	
	public static class SuperheroBuilder {
		private Superhero hero;
		
		public SuperheroBuilder() {
			this.hero = new Superhero();
		}
		
		public SuperheroBuilder(String name) {
			this.hero = new Superhero();
			this.hero.name = name;
		}
		
		public SuperheroBuilder addName(String name) {
			this.hero.setName(name);
			return this;
		}
		
		public SuperheroBuilder addStamina(int stamina) {
			//this.hero.stamina = stamina;
			this.hero.setStamina(stamina);
			return this;
		}
		
		public SuperheroBuilder addPower(int value) {
			//this.hero.power = value;
			this.hero.setPower(value);
			return this;
		}
		
		public SuperheroBuilder hasGoodKarma() {
			//this.hero.hasGoodKarma = true;
			this.hero.setHasGoodKarma(true);
			return this;
		}
		
		public SuperheroBuilder isWounded() {
			//this.hero.isWounded = true;
			this.hero.setWounded(true);
			return this;
		}
		
		public SuperheroBuilder addSuperpower(String power) {
			//this.hero.superPower = power;
			this.hero.setSuperPower(power);
			return this;
		}
		
		public SuperheroBuilder addExtraPower(String power) {
			//this.hero.extraPower = power;
			this.hero.setExtraPower(power);
			return this;
		}
		
		public Superhero build() {
			return this.hero;
		}
		
	}
}
