package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		//if possible for each method

		List<String> Country = new ArrayList<String>(100);
		Country.add("NY");
		Country.add("NJ ");
		Country.add("PA");
		Country.add("CT");

		List<String> Country2 = new ArrayList<String>(100);
		Country2.add("CTG");
		Country2.add("Comilla ");
		Country2.add("Borishal");
		Country2.add("Dhaka");

		Map<String, List<String>> maplist = new HashMap<String, List<String>>();
		maplist.put("USA", Country);
		maplist.put("BD", Country2);

		for (Map.Entry<String, List<String>> state : maplist.entrySet()) {
				System.out.println(state.getKey() + "---> " + state.getValue());
			}


		}

	}
