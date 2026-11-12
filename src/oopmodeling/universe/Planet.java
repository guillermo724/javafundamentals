package oopmodeling.universe;

/**
 * @author Guillermo
 * @created 16/10/2026
 *
 */
public class Planet extends CelestialBody{
	
	private int age = 23;
	public Planet(double mass, float radius, String name) {
		//create or initialize the parent properties
		super(mass, radius, name);
		/**
		 * before changing any propertires of an object
		 * created from Planet, we must first create
		 * its parent
		 */
		this.age = 45;
	}
	
	public Planet() {
		
		super();
	}
}