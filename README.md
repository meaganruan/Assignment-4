# Assignment-4
Assignment Four - Movie Genre

IMPORTS:
imported the movie.csv file from movielens into my java class.
imported java.util.*; for the hashtable.
imported java.io.*; for reading in files.

READING IN THE DATA:
Created a LinkedList<String> for both the genres and titles of movie.csv.
  Read in the csv file using 2 BufferedReader and 2 FileReader. (One for the genres and one for the movies).
  Created a temp array to store column values and added the values to the LinkedList<String> outside of the reader.
  
  
PARSING YEARS OUT OF TITLES:
I created an ArrayList<String> to hold my years.
  Created a for loop to take the substring of the last 6 characters in each item in the movies LinkedList<String>.
  Created a second loop to count how many of each year there are.
  
