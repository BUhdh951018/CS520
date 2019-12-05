package solution;

import java.util.ArrayList;
import java.util.List;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;

public class Dockyard implements IDockyard {

	private List<IContainer> list = new ArrayList<IContainer>();
	
	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		list.add(container);
		//System.out.println(list);
	}

	@Override
	public boolean loadTruck(ITruck truck) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			String temp = truck.destinationCity().trim();
			String city = list.get(i).destinationCity().trim();
			if (temp.equalsIgnoreCase(city)) {
				truck.addContainer(list.get(i));
				list.remove(i);
				return true;
			} 
		}
		return false;
	}

	@Override
	public int containerCount() {
		// TODO Auto-generated method stub
		int count = 0;
		count = list.size();
		return count;
	}

	@Override
	public int containerCount(String destinationCity) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			String temp = destinationCity.trim();
			String city = list.get(i).destinationCity().trim();
			
			if (temp.equalsIgnoreCase(city)) {
				sum++;
			}
		}
		return sum;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("The dockyard contains " + containerCount() + " containers.");
		if (containerCount() !=0 ) {
			System.out.println("        LA: " + containerCount("LA"));
			System.out.println("       BOS: " + containerCount("BOS"));
			System.out.println("       NYC: " + containerCount("NYC"));
			System.out.println("       ATL: " + containerCount("ATL"));
		}
		
		System.out.println();
	}

}
