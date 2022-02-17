
public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone() {}
	
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public String toString() {
		return os +", "+ ram +", "+ processor +", "+ screenSize +", "+ battery;
	}
	
}
