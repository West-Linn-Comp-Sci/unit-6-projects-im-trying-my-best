
/**
 * Write a description of class Album here.
 *
 * @author Liam Groah
 * @version 5/14/21
 */
public class Album
{
    public String albumName;
    public String artist;
    public int songNumber;
    public double playTime;

    public Album(String name, String artist, int numSongs, double length){
        this.albumName = name;
        this.artist = artist;
        this.songNumber = numSongs;
        this.playTime = length;       
        }
    
    public double getLength(){
        return playTime;
    }
    
    public int getSongs(){
        return songNumber;
    }        
        
    public String getName(){
        return albumName;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String toString(){
         String result = "Title: " + albumName + "\n"
                        + "Artist: " + artist + "\n"
                        + "Number of tracks: " + songNumber + "\n"
                        + "Album's total play time: " + playTime + " minutes";
         return result;
    }
    }
