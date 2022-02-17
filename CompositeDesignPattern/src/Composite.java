import java.util.ArrayList;
import java.util.List;

//Every composite will have a list of its subtrees
public class Composite implements Component {

	List<Component> components = new ArrayList<>();
	private String name;
	
	Composite(String name){
		super();
		this.name=name;
	}
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name+" : ");
		for(Component component: components) {
			component.showPrice();
		}
	}

}
