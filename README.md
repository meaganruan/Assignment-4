# Assignment-4
Assignment Four - Movie Genre

IMPORTS:
imported the movie.csv file from movielens into my java class.
imported java.util.*; for the hashtable.
imported java.io.*; for reading in files.

READING IN THE DATA:
Created a LinkedList<String> for both the genres and titles of movies.csv.
  Read in the csv file using 2 BufferedReader and 2 FileReader. (One for the genres and one for the movies).
  Created a temp array to store column values and added the values to the LinkedList<String> outside of the reader.
  
  
PARSING YEARS OUT OF TITLES:
I created an ArrayList<String> to hold my years.
  Created a for loop to take the substring of the last 6 characters in each item in the movies LinkedList<String>.
  Created a second loop to count how many of each year there are.
  
DATA VISUALIZATION (EXTRA CREDIT):

link to code: https://colab.research.google.com/drive/1Jk6RKLzpUgTdUvUJYNRAgz7sWZT5ZL__

I used google's colaboratory in python to create the graphs using the movies.csv file.
I imported pandas for the dataframe, numpy for math, and seaborn for data visualization. 
Question for this dataset was: How many movies in the year 1995 and 2000 have 1 genre? 2? 3? ...etc.
I created 2 functions:
  The first one is used to count the number of genres under the genres column.
  The second one is to parse out the year in the title column. 
 I added the new data to new columns ('numGenres' for the number of genres and 'years' for the parsed year)
 I realized that the column names weren't actually 'id', 'title', and 'genres'.
 So I took the first row out.
 I also graphed all the number of genres to see how many there were with a distplot.
 I separated my data using two masks: 1995mask and 2000mask for comparing the two years for the question. 
 I used a countplot from seaborn to splot both masked datasets to compare with the hue as the number of genres and the x-axis as the     year.
