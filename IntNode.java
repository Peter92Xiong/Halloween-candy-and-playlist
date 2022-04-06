////public class Node {
////	public long key;
////	public Node next;
////
////	public Node(long k, Node n) {
////		key = k;
////		next = n;
////	}
////	
////	
//////	boolean hasKey(long keyinput)
//////	{
//////		//this.key = key;
//////		if (key == keyinput)
//////		{
//////			return true;
//////		}
//////		return false;
//////	}
////}
//
///*
// * This class represents an individual node in hash table.
// */
////public class Node {
////	
////	public String key;
////	public long count;
////	public Node next;
////
////	Node (String _key, Node _next) {
////		key = _key;
////		next = _next;
////		count = 1;
////	}
////	
////	public void incCount() {
////		count++;
////	}
////}
//
//
///**
// * The class DoubleNode holds two pointers and a character. It is used to represent a single node on a double linked list. 
// * @author songluo
// *
// */
//public class DoubleNode {
//        private DoubleNode prev;
//        private DoubleNode next;
//        private DoubleNode current;
//        private DoubleNode end;
//        private int c;
//        
//        /**
//         * Constructor with no arguments.
//         */
//        public DoubleNode(){
//                this( null, '\0', null );
//        }
//        
//        /**
//         * Constructor with a character 
//         * @param ch is a character for this node.
//         */
//        public DoubleNode(int ch){
//                //this(null, ch, null);
//        	this.prev = null;
//        	this.next = null;
//        	this.c = ch;
//        }
//        
//        /**
//         * Constructor with three arguments
//         * @param p is a pointer to a previous node.
//         * @param ch is a character for this node.
//         * @param n is a pointer to a next node.
//         */
//        public DoubleNode(DoubleNode p, int ch, DoubleNode n){
//                prev = p;
//                next = n;
//                c = ch;
//        }
//        
//        //when precursor is null
//        public DoubleNode(int ch, DoubleNode n){
//            prev = null;
//            next = n;
//            c = ch;
//    }
//        /**
//         * @return c a character for this node.
//         */
//        public int getC(){
//                return c;
//        }
//        
//        /**
//         * @return a pointer to the next node or null if none exists
//         */
//        public DoubleNode getNext(){
//                return next;
//        }
//        
//        /**
//         * @return a pointer to the previous node or null if none exists
//         */
//        public DoubleNode getPrev(){
//                return prev;
//        }
//        
//        /**
//         * @param ch is assigned to this node
//         */
//        public void setC(int ch){
//                c = ch;
//        }
//        
//        /**
//         * @param n
//         */
//        public void setNext(DoubleNode n){
//                next = n;
//        }
//
//        /**
//         * @param p
//         */
//        public void setPrev(DoubleNode p){
//                prev = p;
//        }
//        
//        /** 
//         * @see java.lang.Object#toString()
//         */
//        public String toString(){
//                return Character.toString(c);
//        }
//
//}




public class IntNode {
	public int digit;
	public IntNode next;

	public IntNode(int _key, IntNode _next) {
		digit = _key;
		next = _next;
	}
}
