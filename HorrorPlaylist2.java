import java.util.Scanner;

public class HorrorPlaylist2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		IntSet playlist = new IntSet();
		//DoubleLinkedSeq playlist = new DoubleLinkedSeq();
		long n = scanner.nextInt(); // amount of videos
		long k = scanner.nextInt(); // amount of different types of video
		// finished reading first line.
		// long playlist[] = new long[(int) n]; //make an array for the videos
		long type[] = new long[(int) k]; // make an array for the types of videos

		// read all of the next ints up to n. (bc we only have n amount.)
		// and place them in the array.
		for (int i = 0; i < n; i++) {
			 //playlist[i] = scanner.nextInt();

			playlist.insert(scanner.nextInt());
			//playlist.addAfter(scanner.nextInt());
		}
		// playlist.print();
		// lastly the last ints are for the types in the input.
		// read all of them up to k (bc we only have k types) and put them also
		// into an array.
		for (int i = 0; i < k; i++) {
			type[i] = scanner.nextInt();
		}

		// made another array for the amount of times Olivia has to click
		// the length if n bc we might have to click n times, I think...
		// long click[] = new long[(int) n];

		// first assign all type of songs as -1.
//        for(int i=1; i<=k; i++){
//           click[i] = -1; 
//        }

//		int target = (int) type[0]; // hold the video type we want to watch ++++++++++++++++++++++++
		// click[(int) playlist[0]]++; //
		long click12 = 1; // one bc we have to click first
//        for(int i=1; i<n; i++){

		// if we have to scrolled the playlist then increment the count in that type of
		// songs.
		//IntNode head;
		// go through the linked list if it is equal to target and remove
//		while (playlist.node1 != null) {
		for (int i = 0; i < k; i++) {

			int target = (int) type[i]; // hold the video type we want to watch ++++++++++++++++++++++++
			System.out.println(target); 
			//while the playlist is not null do this:
			//while (playlist.node1 != null) {
				
				//while the node's digit is the videos type do this:
			//IntNode tempMoveNode = playlist.node1;
//			while (playlist.node1.digit == t && playlist.node1 !=null) {
			
			
			
			//while(playlist.node1.next != null) {
			
//				while (playlist.node1.digit == target && playlist.node1 !=null) {
//					System.out.println("this is node1.digit: " + playlist.node1.digit +
//							" this is target: " + target);
//					IntNode temp = playlist.node1.next; //make a temp for node1 next.
//					playlist.remove(target); //remove that current node bc its the same as target
//					playlist.node1 = temp; //now node1 is now temp(node1.next)
//					playlist.print(); 
//					System.out.println("-----");
//					System.out.println("target is: " + target);
//					System.out.println("node1 digit is: " + playlist.node1.digit);
//				}
//				System.out.println("*********");
//				playlist.print();
//				System.out.println("*********");
//				click12++; // so target is not the next video
//				System.out.println("this is the amount of clicks: " + click12);
//				if (playlist.node1 == null) {
//					break;
//				}
//				IntNode tempMoveNode = playlist.node1;
//				while (tempMoveNode.digit != target && tempMoveNode != null) {
//					System.out.println("++++++++++");
//					//playlist.node1 = playlist.node1.next; //this is my issue!!!!!!!!
//					tempMoveNode = tempMoveNode.next;
//					playlist.print();
//					System.out.println("this is the amount of clicks: " + click12);
//				}
			
			
			
			
			
			
			//}
//			while (playlist.getNextint() == target) {
//				playlist.remove(target);
//			}
//			if (playlist.nodeHeadInt() != target) {
//				click12++;
//			} else if (target != playlist.nodeHead().digit) {
//				// click[(int) playlist[i]]++; //incurment click
//				click12++;
//			}
			boolean isfirst = true;
			System.out.println("n" + n);
			for(int j = 0; j < n; j++)
			{
				//System.out.println(playlist.gethead());
				System.out.println("node" + playlist.node1.digit);
				if(playlist.node1.digit == target)
				{
					
					playlist.remove(target);
					System.out.println("target is: " + target);
					playlist.print();
					//System.out.println(playlist.size());
//					System.out.println(playlist.getCurrent());
					
					isfirst = true;
					
				}
				else
				{
					if(isfirst = true)
					{
						click12++;
						isfirst = false;
					}
					
					
				}
				System.out.println("hello");
			}
				
//				DoubleNode temp;
//				for(temp = playlist.gethead(); playlist.gethead().getC() == target;)
////			System.out.println("hello");
//			playlist.gethead().getC();
//			System.out.println("world");
//
//			System.out.println(playlist.size());
//			System.out.println("!");

//@@@@@@@@@@@@@@@@@@@@@@@@@			
			
//			
//			
//			IntNode temp0;
//			for (temp0 = playlist.node1; temp0.next != null; temp0 = playlist.node1.next)
//			{
//			
//			IntNode temp = playlist.node1;
//			
//			if(temp.digit == target)
//			{
//				playlist.node1 = playlist.node1.next;
//				
//			}
//			else {
//				click12++;
//				for (temp = playlist.node1; temp.digit != target; temp = temp.next)
//				{
//					IntNode temp2 = temp;
//					//now temp.digit is == to target
//					
//				}
//			}
//			
//				
//			}
			
//@@@@@@@@@@@@@@@
			
			
			

			
			
			
			
			
		}

		// output.
		System.out.println(click12);
		// System.out.println("You have scrolled " + timeOfScroll + " times(s) in the
		// playlist.");
		//System.out.println(playlist.gethead().getC());
	}
}