package solution;

import java.util.ArrayList;
import java.util.List;

import shipping.IContainer;
import shipping.IShip;

public class Ship implements IShip {
	
	private String registId;
	private List<IContainer> list = new ArrayList<IContainer>();
	
	@Override
	public List<IContainer> containers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<IContainer> offload() {
		// TODO Auto-generated method stub
		list = null;
		return list;
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return registId;
	}

	@Override
	public void setRegistration(String id) {
		// TODO Auto-generated method stub
		registId = id;
		
	}

	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		list.add(container);
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Before unloading: Ship " + getRegistration() + " has " + containers().size() + " contianers.");
		System.out.println("After unloading:  Ship " + getRegistration() + " has 0 containers.");
	}

}
