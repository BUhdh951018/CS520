package solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.filechooser.FileNameExtensionFilter;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.IShip;
import shipping.ITruck;
import shipping.ShippingProcessorBase;

public class ShippingProcessor extends ShippingProcessorBase {

	
	public ShippingProcessor(IDockyard dockyard) {
		super(dockyard);
		// TODO Auto-generated constructor stub
	}

	/*@Override
	protected void processShippingEvent(String input) {
		// TODO Auto-generated method stub
		processShippingEvent(input);
		
	}*/

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
		ITruck truck = new Truck(registration, destination);
		IDockyard dockyard = getDockyard();
		Boolean temp = dockyard.loadTruck(truck);
		
		truck.printDetails();
		
	}

	@Override
	protected IShip processShip(String registration) {
		// TODO Auto-generated method stub
		IShip ship = new Ship();
		ship.setRegistration(registration);
		List<IContainer> list = readManifest(registration);
		for (int i = 0;i < list.size(); i++) {
			ship.addContainer(list.get(i));
		}
		//ship.offload();
		ship.printDetails();
		
		IDockyard dockyard = getDockyard();
		for (int i = 0; i < ship.containers().size(); i++) {
			dockyard.addContainer(ship.containers().get(i));
		}
		
		return ship;
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO Auto-generated method stub
		List<IContainer> list = new ArrayList<IContainer>();
		
		String filename = shipId + "-Manifest";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(fileReader);
		String line;
		
		try {
			line = reader.readLine().trim();
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				String id = st.nextToken().trim();
				String city = st.nextToken().trim();
				String desc = "from ship" + shipId;
				
				IContainer container = new Container(id, desc, city);
				list.add(container);
				 
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
