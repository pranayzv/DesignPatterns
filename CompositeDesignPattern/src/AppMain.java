
public class AppMain {

	public static void main(String[] args) {
		
		Component hdd = new Leaf("HDD",4000);
		Component mouse = new Leaf("MOUSE",4000);
		Component monitor = new Leaf("monitor",8000);
		Component ram = new Leaf("ram",3000);
		Component cpu = new Leaf("cpu",12000);

		Composite mb  = new Composite("MB");
		Composite cabinet = new Composite("Cabinet");
		Composite ph  = new Composite("peri");
		Composite computer = new Composite("computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		mb.showPrice();
		
		//The structure is tree based and traversing it will go to its leaf
		// nodes, composite gives compartmentalization for a whole structure namely A Computer in the example. 
	}

}
