
public class Subscriber implements Observer {

	private String name;
	private Channel channel;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void subscribeSubject(Channel channel) {
		this.channel=(Channel) channel;
	}

	@Override
	public void update() {
		System.out.println("Hey "+name+", Channel: "+channel.getName()+" has uploded a new video. ");
	}

}
