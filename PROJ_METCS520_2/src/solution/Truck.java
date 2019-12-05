package solution;

import java.util.List;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {
	private String id;
	private String city;
	private IContainer cargo = null;
	
	public Truck(String id, String city) {
		this.id = id;
		this.city = city;
	}

	@Override
	public String registration() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public boolean addContainer(IContainer container) {
		// TODO Auto-generated method stub
		if (!hasContainer()) {
			cargo = container;
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public IContainer offloadContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasContainer() {
		// TODO Auto-generated method stub
		if (cargo != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println();
		if (hasContainer()) {
			System.out.println("Before loading: Truck " + registration() + " is headed to " + destinationCity() + " with no container.");
			System.out.println("After loading:  Truck " + registration() + " is headed to " + destinationCity() + " with container " + cargo.id());
		} else {
			System.out.println("Before loading: Truck " + registration() + " is headed to " + destinationCity() + " with no container.");
			System.out.println("After loading:  Truck " + registration() + " is headed to " + destinationCity() + " with no container." );
		}
		
	}

}
