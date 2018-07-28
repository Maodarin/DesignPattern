package darin.designPattern.Builder;

public class BuildLeader {
	private PersonBuilder builder;
	public BuildLeader(PersonBuilder builder) {
		this.builder= builder;
	}
	
	public void CreatePerson() {
		builder.buildHead();
		builder.buildBody();
		builder.buildArmLeft();
		builder.buildArmRight();
		builder.buildLegLeft();
		builder.buildLegRight();
	}

}
