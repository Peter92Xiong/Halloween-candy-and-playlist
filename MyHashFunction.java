///*
// * This class builds a hash table that is capable of storing
// * integer keys. This is represented as an array of Node references,
// * each reference is a head of a linked list. All collisions are 
// * resolved through chaining.
// */
//public class MyHashFunction {
//
//	private Node [] table;			// Hash table - array of references to linked lists.
//	private long size;						// Size of the hash table.
//
//	/* Constructor 0 initializes the hash table of the required size. */
//	public MyHashFunction (long _size) {
//		size = _size;
//		table = new Node[(int) size];
//	}
//
//	/* Insert a key into the hash table. This is inserted as the new head of the 
//	 * linked list at table[i], where i is the hash index ot the key.
//	 */
//	public void insert(String key) {
//		long i = hash(key);
//		table[(int) i] = new Node(key, table[(int) i]);
//	}
//
//	/* Print the contents of the hash table. Loop through all array elements,
//	 * then loop through all the nodes in the linked list.
//	 */
//	public void print() {
//		for (int i = 0; i < size; i++) {
//			for (Node curr = table[i]; curr != null; curr = curr.next) 
//				System.out.println(curr.count + " " + curr.key);
//		}
//	}
//
//	/*
//	 * This function returns the node in the hash table that contians the largest
//	 * count.
//	 */
//	public Node frequent() {
//		Node max = null;
//
//		for (int i = 0; i < size; i++) {
//			for (Node curr = table[i]; curr != null; curr = curr.next) 
//				if (max == null || curr.count > max.count) {
//					max = curr;
//				}
//		}
//		return max;
//	}
//
//	/* Finds a key in the Hash table. Returns true if key is presernt, else
//	 * returns false. Checks only the linked list given by the hash index.
//	 */
//	public Node find(String key) {
//		long i = hash(key);
//		for (Node curr = table[(int) i]; curr != null; curr = curr.next) {
//			if (curr.key.equals(key)) 
//				return curr;
//		}
//		return null;
//	}
//	
//	/* hash an integer key k. This is along the lines of a universal hash function.
//	 * To make it theoretically correct, need to take mod a large prime first, before
//	 * doing mod m.
//	 */
//	private long hash(String k) {
//		int x = 2917;
//		long hash = 0;
//		for (int i = 0; i < k.length(); i++) {
//			hash = ((hash * x) + (int) k.charAt(i)) % size;
//		}
//		return hash;
//	}
//	
//	public long size(long candySize)
//	{
//		size = candySize;
//		return size;
//	}
//
//}
//
//
//
//
