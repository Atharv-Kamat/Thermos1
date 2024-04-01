package github_practice;

public class Thermos {

	private int volume;
	private String Brand, Liquid;
	
	public Thermos(int v, String b, String l) {
		setVolume(v);
		setBrand(b);
		setLiquid(l);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getLiquid() {
		return Liquid;
	}

	public void setLiquid(String liquid) {
		Liquid = liquid;
	}
	
	public void display() {
		System.out.println("Volume = " + volume + " litre");
		System.out.println("Brand name is " + Brand);
		System.out.println("Liquid name is " + Liquid);
	}
	
	public void addLiquid() {
		Liquid = Liquid + 1;
	}
}
