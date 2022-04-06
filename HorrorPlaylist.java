import java.util.Scanner;

public class HorrorPlaylist {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  

        long n = scanner.nextInt(); //amount of videos
        long k = scanner.nextInt(); //amount of different types of video
        //finished reading first line. 
        long playlist[] = new long[(int) n]; //make an array for the videos
        long type[] = new long[(int) k]; //make an array for the types of videos

        // read all of the next ints up to n. (bc we only have n amount.)
        //and place them in the array.
        for(int i=0; i<n; i++){
            playlist[i] = scanner.nextInt();
        }

        // lastly the last ints are for the types in the input. 
        //read all of them up to k (bc we only have k types) and put them also
        //into an array.
        for(int i=0; i<k; i++){
            type[i] = scanner.nextInt();
        }

        //made another array for the amount of times Olivia has to click
        //the length if n bc we might have to click n times, I think...
        long click[] = new long[(int) n]; 

        // first assign all type of songs as -1.
        for(int i=1; i<=k; i++){
           click[i] = -1; 
        }

        long last = playlist[0]; //hold the video type we want to watch ++++++++++++++++++++++++
        //click[(int) playlist[0]]++; //
        long click12 = 1;
        for(int i=1; i<n; i++){

            // if we have to scrolled the playlist then increment the count in that type of songs.
        	if(last == playlist[i])
        	{
        		playlist[i] = -1;
        	}
        	else if(last != playlist[i]){
                //click[(int) playlist[i]]++; //incurment click
            	click12++;
            	
                //last = playlist[i]; //last is now at 
            }
        }

        // total time of scrolled the playlist.
        int timeOfScroll = 0;
        for(int i=1; i<=k; i++){
            timeOfScroll += click[i];
        }

        /* we have to scroll the top of the playlist (k-1) times.
           beacuse all (k-1) type of songs are remove from the playlist.
           so that only kth type of songs is remain. */
        timeOfScroll += (k-1);

        // output.
        System.out.println("You have scrolled " + timeOfScroll + " times(s) in the playlist.");
    }
}