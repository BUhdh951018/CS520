package solution;

import shipping.IContainer;

public class Container implements IContainer {
	private String id;
	private String desc;
	private String city;

	public Container(String id, String desc, String city) {
		this.id = id;
		this.desc = desc;
		this.city = city;
	}
	
	@Override
	public String id() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
		return city;
	}

}
