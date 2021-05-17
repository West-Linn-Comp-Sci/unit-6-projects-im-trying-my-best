
/**
 * Write a description of class MusicLibaryClient here.
 *
 * @author Liam Groah
 * @version 5/14/21
 */
public class MusicLibaryClient
{
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();
        Album a1 = new Album("Eyes Wide Open", "TWICE", 13, 43);
        Album a2 = new Album("folklore", "Taylor Swift", 16, 63);
        Album a3 = new Album("To Anyone", "2NE1", 12, 43);
        Album a4 = new Album("Shatter Me", "Lindsey Stirling", 12, 47);
        Album a5 = new Album("twicetagram", "TWICE", 13, 44);
        Album a6 = new Album("Red", "Taylor Swift", 16, 64);
        Album a7 = new Album("The Perfect Red Velvet", "Red Velvet", 12, 41);
        Album a8 = new Album("Dystopia: The Tree of Language", "DREAMCATCHER", 13, 39);
        Album a9 = new Album("evermore", "Taylor Swift", 15, 60);
        Album a10 = new Album("CRUSH", "2NE1", 10, 35);
        Album a11 = new Album("&TWICE", "TWICE", 11, 37);
        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        System.out.print("Searching for title: twicetagram\ntwicetagram found at index: ");
        System.out.println(myLibrary.searchTitle("twicetagram"));
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        myLibrary.doubleSize();
        myLibrary.add(a10);
        myLibrary.add(a11);
        System.out.println("Sorted by title.");
        myLibrary.titleSelectionSort();
        System.out.print("Searching for album: folklore by Taylor Swift\nfolklore by Taylor Swift found at index: ");
        System.out.println(myLibrary.binarySearch("folklore", "taylor swift"));
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sorted by artist.");
        myLibrary.artistInsertionSort();
        System.out.print("Searching for artist: Lindsey Stirling\nLindsey Stirling found at index: ");
        System.out.println(myLibrary.searchArtist("lindsey stirling"));
        myLibrary.remove(1);
        myLibrary.remove(5);
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}
