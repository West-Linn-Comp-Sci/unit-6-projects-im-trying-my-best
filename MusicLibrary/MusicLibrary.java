
/**
 * Write a description of class MusicLibrary here.
 *
 * @author Liam Groah
 * @version 5/14/21
 */
public class MusicLibrary
{
    Album[] library;
    private double totalPlayTime;
    private int totalSongs;
    private int index;
    private int albumCount;
    private int search;
    private boolean sort;

    public MusicLibrary()
    {
        library = new Album[10];
        totalPlayTime = 0;
        totalSongs = 0;
        index = 0;
    }
    public void add(Album ad)
    {
        if (index == -1) {
        System.out.println("Your music library is full. Please double the size or remove some albums if you want more.");
    }
    else {
        library[index] = ad;
        totalSongs += ad.getSongs();
        totalPlayTime += ad.getLength();
        albumCount++;
        int c;
        for(c = 0; c < library.length; c++) {
        if(library[c] == null) {
            index = c;
            break;
            
        }
    }
    if(c == library.length)
        index = -1;
}
    }
    public void remove(int idx) {
        library[idx] = null;
        albumCount--;
    }
    public void doubleSize()
    {
        Album[] newLibrary = new Album[library.length * 2];
        for(int i = 0; i < library.length; i++) {
            newLibrary[i] = library[i];
    }
    library = newLibrary;
    }
    public Album getAlbum(int in)
    {
        if(in >= 0 && in <= library.length) {
            return library[in];
        }
        else {
            return null;
        }
    }
    public double totalPlayTime()
    {
        return totalPlayTime;
    }
    public int totalSongs()
    {
        return totalSongs;
    }
    public int searchTitle(String target)
    {
        for(int i = 0; i < albumCount; i++)
        {
           if(library[i].getName().equalsIgnoreCase(target))
           {
              search = i;
              break;
           }
        }
        if (target.equals(library[search].getName())){
            return search;
        } else {
            return -1;
        }
    }
    public int searchArtist(String target)
    {
        for(int i = 0; i < albumCount; i++)
        {
           if(library[i].getArtist().equalsIgnoreCase(target))
           {
              search = i;
              break;
           }
        }
        if (target.equalsIgnoreCase(library[search].getArtist())){
            return search;
        } else {
            return -1;
        }
    }
    public void titleSelectionSort()
    {
        sort = true;
        int min;
        Album temp;
        for(int i = 0; i < albumCount - 1; i++) {
            min = i;
            int position = i;
            for(int s = i + 1; s < albumCount; s++) {
                if(library[s].getName().compareToIgnoreCase(library[min].getName()) < 0)
                    min = s;
                }
                temp = library[min];
                library[min] = library[i];
                library[i] = temp;
        }
    }
    public void artistInsertionSort()
    {
        sort = true;
        for(int i = 1; i < albumCount; i++) {
            Album key = library[i];
            int position = i;
                while (position > 0 && library[position - 1].getArtist().compareToIgnoreCase(key.getArtist()) > 0) {
                library[position] = library[position-1];
                position--;
            }
            library[position] = key;
        }
    }
    public int binarySearch(String title, String artist)
    {
        if(sort = true)
        {
            int low = 0;
            int high = albumCount - 1;
            int middle = (low + high)/2;
            while((!title.equals(library[middle].getName()) && !artist.equals(library[middle].getArtist())) && low <= high)
            {
                if (library[middle].getName().compareTo(title) > 0 && library[middle].getArtist().compareTo(artist) > 0){
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
                middle = (low + high)/2;
            }
            if (library[middle].getName().equals(title) && library[middle].getArtist().equals(artist)){
                return middle;
            } else {
                return -1;
            }
        } else {
            System.out.println("Needs to be sorted before executing binary search!");
            return -1;
        }
    }
    public String toString(){
        String result = "Size of Library: " + library.length + "\n"
                        + "Number of tracks: " + totalSongs + "\n"
                        + "Total play time: " + totalPlayTime + "\n";
        for(int i = 0; i < library.length; i++) {
            if(library[i] != null)
                result += library[i] + "\n\n";
            }
            return result;
    }
}
