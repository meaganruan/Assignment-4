import java.util.*;
import java.io.*;

public class A4 {

	public static void main(String[] args) throws IOException {
// Reading in data from csv file
		// csv file
		File movieFile = new File("src/movies.csv");
		String row;

		// store genre column
		LinkedList<String> genres = new LinkedList<>();
		LinkedList<String> movies = new LinkedList<>();

		// first reader for genres
		BufferedReader reader = new BufferedReader(new FileReader(movieFile));
		// collect data for genre year
		while ((row = reader.readLine()) != null) {
			// store movie in a temporary array
			String[] data = row.split(",");
			String genre = data[2];
			// add items in temp array to a list
			genres.add(genre);
			// remove column name
			genres.remove("genres");
		}
		reader.close(); // close reader

		// second reader for movies
		BufferedReader reader2 = new BufferedReader(new FileReader(movieFile));
		// collect data for movie year
		while ((row = reader2.readLine()) != null) {
			// store movie in a temporary array
			String[] data = row.split(",");
			String movie = data[1];
			// add items in temp array to a list
			movies.add(movie);
			// remove column name
			movies.remove("title");
		}
		reader2.close(); // close second reader

		// testing lists
//		 System.out.println(genres);
		// System.out.println(movies);

// hashtable

		// adding key and value pairs
		// search how many unique genres there are
		ArrayList<String> splitG = new ArrayList<>();
		for(int r=0; r<genres.size(); r++) {
			String currentGenre = genres.get(r);
			String data[] = currentGenre.split("\\|");
			for(int p=0; p<data.length; p++) {
				splitG.add(data[p]);
			}
		}
		//test
//		System.out.println(splitG);
		//sorting for readability
		Collections.sort(splitG, String.CASE_INSENSITIVE_ORDER);
		System.out.println(splitG);
		//count how many times a genre is in the arraylist
		Map<String, Integer> map = new HashMap<String, Integer>();

		for(String word: splitG) {
		    // if word is not in the map
		    if(!map.containsKey(word))
		        map.put(word, 0);
		    map.put(word, map.get(word) + 1);
		}

		for(String word: map.keySet()) 
		    System.out.println(word + " occurs " + map.get(word) + " times");
		   
		   

		// split all the genres in the list and put it in a hashmap to get the unique
		// values

		// key=genre value=movie because there can be multiple values for one key.

// take out only the years with parenthesis of movies
		// create an arraylist for years
		ArrayList<String> listofYears = new ArrayList<>();
		// loop to get the years
		for (int k = 0; k < movies.size(); k++) {
			String current = movies.get(k);
			// take last 6 characters of string
			String years = current.substring(current.length() - 6);
			listofYears.add(years);
		}
		// loop to count each year
		for (int j = 0; j < listofYears.size(); j++) {

		}
	}
}
