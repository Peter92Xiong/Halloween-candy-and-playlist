//
//
///**
// * A DoubleLinkedSeq is a sequence of double numbers. The sequence can have a
// * special &quot;current element&quot;, which is specified and accessed through
// * four methods that are not available in the IntArrayBag class (start,
// * getCurrent, advance, and isCurrent).
// * 
// * Limitations:
// * 
// * Beyond Integer.MAX_VALUE element, the size method does not work.
// * 
// * @author Peter Xiong
// * @version 10/20/2020
// */
//public class DoubleLinkedSeq implements Cloneable
//{
//
//    // your non-static fields go here.
//    // Peter's code starts:
//    public DoubleNode cursor;
//    public DoubleNode precursor;
//    public DoubleNode head;
//    public DoubleNode tail;
//    public int manyNodes;
//
//    // Peter's code ends.
//
//    /**
//     * Initializes an empty DoubleLinkedSeq.
//     * 
//     * @postcondition This sequence is empty.
//     */
//    public DoubleLinkedSeq()
//    {
//        cursor = null;
//        precursor = null;
//        head = null;
//        tail = null;
//
//        manyNodes = 0;
//
//        // code for constructor
//    }
//
//    /**
//     * Adds a new element to this sequence.
//     * 
//     * @param element
//     *            the new element that is being added to this sequence.
//     * 
//     * @postcondition a new copy of the element has been added to this sequence.
//     *                If there was a current element, then this method places
//     *                the new element before the current element. If there was
//     *                no current element, then this method places the new
//     *                element at the front of this sequence. The newly added
//     *                element becomes the new current element of this sequence.
//     */
////    public void addBefore(int element)
////    {
////        // code for addBefore
////
////        // Peter's code start:
////
////        /*      if (manyNodes == 0)
////        {
////            head = new DoubleNode(element, null);
////            
////        }
////        else (cursor == null || cursor == head)
////        {
////            head = new DoubleNode(element, head);
////        }*/
////
////        if (head == null && tail == null)
////        {
////            head = new DoubleNode(element);
////            tail = head;
////            cursor = head;
////        }
////
////        else if (precursor == null)
////        {
////            head = new DoubleNode(element, head);
////            cursor = head;
////        }
////
////        else if (cursor == null)
////        {
////            head = new DoubleNode(element, head);
////            cursor = head;
////        }
////
////        else if (cursor != null && precursor != null)
////        {
////            DoubleNode newElement = new DoubleNode(element, cursor);
////            precursor.setLink(newElement);
////            cursor = newElement;
////        }
////
////        manyNodes++;
////
////        // Peter's code ends;
////    }
//
//    /**
//     * Adds a new element to this sequence.
//     * 
//     * @param element
//     *            the new element that is being added to this sequence.
//     * 
//     * @postcondition a new copy of the element has been added to this sequence.
//     *                If there was a current element, then this method places
//     *                the new element after the current element. If there was no
//     *                current element, then this method places the new element
//     *                at the end of this sequence. The newly added element
//     *                becomes the new current element of this sequence.
//     */
//    public void addAfter(int element)
//    {
//
//        // your code here
//        // peter's code starts:
//        
//        /*        if (data.length == manyItems)
//        {
//            ensureCapacity(manyItems * 2 + 1);
//        }
//        if (isCurrent())
//        {
//        
//            for (int i = data.length - 1; i > (currentIndex + 1); i--)
//            {
//                data[i] = data[i - 1];
//            }
//            currentIndex++;
//            data[currentIndex] = element;
//            manyItems++;
//        }
//        else
//        {
//        
//            data[manyItems] = element;
//        
//            currentIndex = manyItems;
//            manyItems++;
//        
//        }*/
//        
//        
//        
//        if (manyNodes == 0)
//        {
//            head = new DoubleNode(element);
//            tail = head;
//            cursor = head;
//        }
//
//        else if (manyNodes == 1)
//        {
//            DoubleNode newElement = new DoubleNode(element);
//            head.setNext(newElement);
//            tail = newElement;
//            cursor = tail;
//            precursor = head;
//        }
//        else if (cursor != head && precursor != null)
//        {
//            DoubleNode newElement = new DoubleNode(element, cursor.getNext());
//            cursor.setNext(newElement);
//
//            if (cursor == tail)
//            {
//                tail = tail.getNext();
//            }
//
//            precursor = precursor.getNext();
//            cursor = cursor.getNext();
//        }
//
//        else if (cursor == head)
//        {
//            DoubleNode newElement = new DoubleNode(element, cursor.getNext());
//            head.setNext(newElement);
//            precursor = head;
//            cursor = cursor.getNext();
//
//        }
//
//        else if (!isCurrent())
//        {
//            DoubleNode newElement = new DoubleNode(element);
//            tail.setNext(newElement);
//            precursor = tail;
//            tail = tail.getNext();
//            cursor = tail;
//        }
//
//        manyNodes++;
//
//        // peter's code ends.
//    }
//
//    /**
//     * Places the contents of another sequence at the end of this sequence.
//     * 
//     * @precondition other must not be null.
//     * 
//     * @param other
//     *            a sequence show contents will be placed at the end of this
//     *            sequence.
//     * 
//     * @postcondition the elements from other have been placed at the end of
//     *                this sequence. The current element of this sequence
//     *                remains where it was, and other is unchanged.
//     * 
//     * @throws NullPointerException
//     *             if other is null.
//     */
////    public void addAll(DoubleLinkedSeq other) throws NullPointerException
////    {
////        // your code here
////        // Peter's code starts:
////        if (other == null)
////        {
////            throw new NullPointerException("This cannot be null.");
////        }
////        else
////        {
////            DoubleLinkedSeq theOtherClone = other.clone();
////            tail.setLink(theOtherClone.head);
////            tail = theOtherClone.tail;
////            manyNodes += theOtherClone.size();
////        }
////        // peter's code ends.
////    }
//
//    /**
//     * Move forward so that the current element is now the next element in the
//     * sequence.
//     * 
//     * @precondition isCurrent() returns true.
//     * 
//     * @postcondition If the current element was already the end element of this
//     *                sequence (with nothing after it), then there is no longer
//     *                any current element. Otherwise, the new element is the
//     *                element immediately after the original current element.
//     * 
//     * @throws IllegalStateException
//     *             if there is not current element.
//     */
//    public void advance() throws IllegalStateException
//    {
//        /* if (isCurrent())
//        {
//            cursor++;
//            precursor++;
//        
//        }
//                else if(!isCurrent())
//        {
//            currentIndex = manyItems;
//        }
//        else
//        {
//            throw new IllegalStateException(
//                "There is no current element.");
//        }
//        */
//        if (isCurrent())
//        {
//            if (cursor == tail)
//            {
//                cursor = null;
//                precursor = null;
//            }
//            else if (cursor != tail && cursor != head)
//            {
//                cursor = cursor.getNext();
//                precursor = precursor.getNext();
//            }
//            else if (cursor == head)
//            {
//                cursor = cursor.getNext();
//                precursor = head;
//            }
//        }
//        else
//        {
//            throw new IllegalStateException("There is no current element.");
//        }
//
//    }
//
//    /**
//     * Creates a copy of this sequence.
//     * 
//     * @return a copy of this sequence. Subsequent changes to the copy will not
//     *         affect the original, nor vice versa.
//     * @throws RuntimeException
//     *             if this class does not implement Cloneable.
//     * 
//     */
////    public DoubleLinkedSeq clone() throws RuntimeException
////    {
////        // your code here. see textbook for hints
////        // change this return!
////        // return null;
////        // Peter's code starts:
////        /*
////         * DoubleLinkedSeq answer;
////        try
////        {
////            answer = (DoubleLinkedSeq) super.clone();
////        }
////        catch (CloneNotSupportedException e)
////        {
////            throw new RuntimeErrorException("This cannot be clone");
////        }
////        
////        answer.data = data.clone();
////        return answer;
////        */
////        DoubleLinkedSeq theClone;
////        try
////        {
////            theClone = (DoubleLinkedSeq) super.clone();
////        }
////        catch (CloneNotSupportedException e)
////        {
////            throw new RuntimeException(
////                "This cannot clone.");
////        }
////
////        if (cursor == null)
////        {
////            DoubleNode[] aNewOne = DoubleNode.listCopyWithTail(head);
////            theClone.tail = aNewOne[1];
////            theClone.head = aNewOne[0];
////
////        }
////
////        else if (cursor == head)
////        {
////            DoubleNode[] aNewOne = DoubleNode.listCopyWithTail(head);
////            theClone.tail = aNewOne[1];
////            theClone.head = aNewOne[0];
////            theClone.cursor = theClone.head;
////            theClone.precursor = null;
////        }
////
////        else if (cursor != null && precursor != null)
////        {
////
////            DoubleNode[] s1 = DoubleNode.listPart(head, precursor);
////            theClone.head = s1[0];
////            theClone.precursor = s1[1];
////            DoubleNode[] s2 = DoubleNode.listPart(cursor, tail);
////            theClone.tail = s2[1];
////            theClone.cursor = s2[0];
////            theClone.precursor.setLink(theClone.cursor);
////        }
////
////        return theClone;
////
////        // Peter's code ends;
////    }
//
//    /**
//     * Creates a new sequence that contains all the elements from s1 followed by
//     * all of the elements from s2.
//     * 
//     * @precondition neither s1 nor s2 are null.
//     * 
//     * @param s1
//     *            the first of two sequences.
//     * @param s2
//     *            the second of two sequences.
//     * 
//     * @return a new sequence that has the elements of s1 followed by the
//     *         elements of s2 (with no current element).
//     * 
//     * @throws NullPointerException
//     *             if s1 or s2 are null.
//     */
////    public static DoubleLinkedSeq concatenation(DoubleLinkedSeq s1,
////        DoubleLinkedSeq s2) throws NullPointerException
////    {
////        // your code here.
////        // change this return!
////        // return null;
////        // Peter's code starts
////        if (s1.size() == 0 || s2.size() == 0)
////        {
////            throw new NullPointerException("The sequences cannot be null.");
////        }
////        else
////        {
////            DoubleLinkedSeq newSeq = s1.clone();
////            newSeq.addAll(s2);
////
////            while (newSeq.isCurrent())
////            {
////                newSeq.advance();
////                /**
////                 * Horrible programming, just a quick fix to satisfy the
////                 * condition that the returned sequence has no current element
////                 * since the clone method copies the current.
////                 **/
////            }
////
////            return newSeq;
////        }
////        // Peters code ends
////
////    }
//
//    /**
//     * Returns a copy of the current element in this sequence.
//     * 
//     * @precondition isCurrent() returns true.
//     * 
//     * @return the current element of this sequence.
//     * 
//     * @throws IllegalStateException
//     *             if there is no current element.
//     */
//    public double getCurrent() throws IllegalStateException
//    {
//        // your code goes here
//        // change this return!
//        // Peter's code starts
//        if (isCurrent() == true)
//        {
//            return cursor.getC();
//        }
//        else
//        {
//            throw new IllegalStateException(
//                "There's no current element try again");
//        }
//        // peter's code ends;
//
//        // return -Double.NEGATIVE_INFINITY;
//    }
//
//    /**
//     * Determines whether this sequence has specified a current element.
//     * 
//     * @return true if there is a current element, or false otherwise.
//     */
//    public boolean isCurrent()
//    {
//        // your code
//        // Peter's code starts;
//        return cursor != null;
//
//        // Peter's code ends;
//
//        // return false;
//    }
//
//    /**
//     * Removes the current element from this sequence.
//     * 
//     * @precondition isCurrent() returns true.
//     * 
//     * @postcondition The current element has been removed from this sequence,
//     *                and the following element (if there is one) is now the new
//     *                current element. If there was no following element, then
//     *                there is now no current element.
//     * 
//     * @throws IllegalStateException
//     *             if there is no current element.
//     */
//    public void removeCurrent() throws IllegalStateException
//    {
//        // your code goes here
//        // Peter's code starts:
//        
//
//        /*        if (isCurrent())
//        {
//            if (currentIndex == manyItems - 1)
//            {
//                manyItems -= 1;
//            }
//            else
//            {
//                for (int i = currentIndex; i < manyItems - 1; i++)
//        
//                {
//                    data[i] = data[i + 1];
//                }
//        
//                manyItems--;
//            }
//        }
//        else
//        {
//            throw new IllegalStateException("There is no current element");
//        }
//        */
//        
//        if (!isCurrent())
//        {
//            throw new IllegalStateException("There is no current element.");
//        }
//        else
//        {
//
//            if (head == tail)
//            {
//
//                cursor = null;
//                tail = null;
//                head = null;
//                manyNodes--;
//            }
//            else if (cursor == tail && precursor != null)
//            {
//
//                precursor.setNext(null);
//                cursor = null;
//                manyNodes--;
//                precursor = null;
//            }
//            else if (cursor != tail && precursor != null)
//            {
//                cursor = cursor.getNext();
//                precursor.setNext(cursor);
//                manyNodes--;
//            }
//            else if (cursor == head && precursor == null)
//            {
//                head = head.getNext();
//                cursor = head;
//                manyNodes--;
//            }
//
//        }
//
//        // Peter's code ends;
//    }
//
//    /**
//     * Determines the number of elements in this sequence.
//     * 
//     * @return the number of elements in this sequence.
//     */
//    public int size()
//    {
//        // your code goes here
//        // Peter's code starts;
//        return manyNodes;
//        // Peter's code ends;
//
//        // return Integer.MIN_VALUE;
//    }
//
//    /**
//     * Sets the current element at the front of this sequence.
//     * 
//     * @postcondition If this sequence is not empty, the front element of this
//     *                sequence is now the current element; otherwise, there is
//     *                no current element.
//     */
//    public void start()
//    {
//        // your code goes here.
//        // Peter's code starts:
//        if (head != null)
//        {
//            cursor = head;
//        }
//        else
//        {
//            cursor = null;
//        }
//
//        precursor = null;
//        // Peter's code ends.
//    }
//
//    /**
//     * Returns a String representation of this sequence. If the sequence is
//     * empty, the method should return &quot;&lt;&gt;&quot;. If the sequence has
//     * one item, say 1.1, and that item is not the current item, the method
//     * should return &quot;&lt;1.1&gt;&quot;. If the sequence has more than one
//     * item, they should be separated by commas, for example: &quot;&lt;1.1,
//     * 2.2, 3.3&gt;&quot;. If there exists a current item, then that item should
//     * be surrounded by square braces. For example, if the second item is the
//     * current item, the method should return: &quot;&lt;1.1, [2.2],
//     * 3.3&gt;&quot;.
//     * 
//     * @return a String representation of this sequence.
//     */
////    @Override
////    public String toString()
////    {
////        // your code here.
////        // change this return!
////        // return null;
////        // Peter's code starts.
////        String abc = "";
////
////        if (!isCurrent())
////        {
////
////            if (head == null)
////            {
////                abc += "<>";
////            }
////            else if (manyNodes > 1)
////            {
////                abc += "<";
////
////                for (DoubleNode temp = head; temp != null; temp =
////                    temp.get())
////                {
////                    abc += "" + temp.getData();
////
////                    if (temp.get() != null)
////                    {
////                        abc += ", ";
////                    }
////                }
////
////                abc += ">";
////            }
////
////            else if (manyNodes == 1)
////            {
////                abc += "<" + head.getData() + ">";
////            }
////
////
////        }
////        else
////        {
////            if (manyNodes == 1)
////            {
////                abc += "<[" + head.getData() + "]>";
////            }
////
////            else if (manyNodes > 1)
////            {
////                abc += "<";
////
////                for (DoubleNode temp = head; temp != null; temp =
////                    temp.get())
////                {
////
////                    if (temp == cursor)
////                    {
////                        abc += "[" + temp.getData() + "]";
////                    }
////                    else
////                    {
////                        abc += "" + temp.getData();
////                    }
////
////                    if (temp.get() != null)
////                    {
////                        abc += ", ";
////                    }
////                }
////
////                abc += ">";
////            }
////        }
////
////        return abc;
////        // Peters code ends
////    }
//
//    /**
//     * Determines if this object is equal to the other object.
//     * 
//     * @param other
//     *            The other object (possibly a DoubleLinkedSequence).
//     * @return true if this object is equal to the other object, false
//     *         otherwise. Two sequences are equal if they have the same number
//     *         of elements, and each corresponding element is equal
//     */
////    public boolean equals(Object other)
////    {
////        // your code goes here
////        // change this return!
////        // return false;
////        // Peter's code starts:
////        boolean bcd = true;
////        DoubleLinkedSeq diffSeq = (DoubleLinkedSeq) other;
////
////        if (manyNodes == diffSeq.manyNodes)
////        {
////            for (DoubleNode t1 = head, t2 =
////                diffSeq.head; t1 != null; t1 = t1.get(), t2 =
////                    t2.get())
////            {
////                
////                if (t1.getData() != t2.getData())
////                {
////                    bcd = false;
////                    break;
////                }
////                if (t1 == cursor && t2 != diffSeq.cursor)
////                {
////                    bcd = false;
////                    break;
////                }
////                if (t2 == diffSeq.cursor && t1 != cursor)
////                {
////                    bcd = false;
////                    break;
////                }
////
////            }
////        }
////        else
////        {
////            bcd = false;
////        }
////
////        return bcd;
////        // Peters code ends.
////
////    }
//    
//    public DoubleNode gethead()
//    {
//    	return head;
//    }
//}

//import com.sun.source.tree.WhileLoopTree;

/*
 * This class maintains a set of ints. 
 */
public class IntSet {
	// private int [] set; // An array to represernt the set. This is always
	// maintained in sorted order.
	// private int capacity; // The maximum allocated memory for the set.
	// private int size; // The number of elements currently stored in the set.
//	
	//private IntNode head;
	public IntNode node1; //i think this is the head
	public int digi; //amount of nodes.

	public IntSet() {
		digi = 0; //amount of nodes.
		// head = node1;
		node1 = null;
		//head = node1;
	}

	/*
	 * Find if a key is present in the set. Returns true if the key is present,
	 * otehrwise false.
	 */
	public boolean find(int key) {
		IntNode bNode = node1;
		while (bNode != null) {
			if (bNode.digit == key) {
				return true;
			}
			bNode = bNode.next;
		}

		return false;
	}

	/* Insert a key into the set. */
	public void insert(int key) {
//		// Make sure that the key is not present.
//		//assert (!find(key));
//		IntNode newNode = new IntNode(key, null);
//
//		if (node1 == null) {
//			node1 = newNode;
//			digi++;
//		} else {
//			IntNode curNode = node1;
//			while (curNode.next != null) {
//				curNode = curNode.next;
//				
//			}
//			//newNode.next = curNode.next;
//			curNode.next = newNode;
//			digi++;
//			//sort(node1);
//		}
//		// sortList();
		if (node1 == null) {// || key < node1.digit) {
			node1 = new IntNode(key, null);
			return;
		}

		IntNode curr;
		for (curr = node1; curr.next != null; curr = curr.next);
		curr.next = new IntNode(key, null);
		
	}

	public void sort(IntNode node11) {

		IntNode sNode = node11;
		IntNode iNode = null;
		int temp1;

		if (node11 == null) {
			return;
		} else {
			while (sNode != null) {

				iNode = sNode.next;

				while (iNode != null) {

					if (sNode.digit > iNode.digit) {
						temp1 = sNode.digit;
						sNode.digit = iNode.digit;
						iNode.digit = temp1;
					}
					iNode = iNode.next;
				}
				sNode = sNode.next;
			}
		}
	}

	/* Remove a key from the set. */
	public void remove(int key) {
		assert (find(key));
//		IntNode temp = node1;
//		IntNode prev = null;
//		if (temp != null && temp.digit == key) {
//			node1 = temp.next;
//			return;
//		}
//
//		while (temp != null && temp.digit != key) {
//			prev = temp;
//			temp = temp.next;
//		}
//
//		prev.next = temp.next;
//		assert (find(key));
//		
		if (key == node1.digit) {
			node1 = node1.next;
			return;
		}
		IntNode curr;
		for (curr = node1; curr.next != null; curr = curr.next);
		curr.next = curr.next.next;
	}

	/* Print the contents of the set in sorted order. */
	public void print() {
		IntNode temp = node1;
		while (temp != null) {

			System.out.print(temp.digit + " ");
			temp = temp.next;

		}
		System.out.println(" ");

	}
	
	public int findReturn(int key) {
		IntNode bNode = node1;
		while (bNode != null) {
			if (bNode.digit == key) {
				return key;
			}
			bNode = bNode.next;
		}

		return -1;
	}
	
	public int nodeHeadInt()
	{
		return node1.digit;
	}
	public IntNode getNext(int key)
	{
		IntNode nextOne = node1;
		while(nextOne.digit != key)
		{
			nextOne = nextOne.next;
		}
		return nextOne;
	}
	public int getNextint()
	{
		return node1.next.digit;
//		if(kNode.digit != 0)
//		{
//				kNode = kNode.next;
//		}
//		return kNode;

	}
	
	public IntNode nodeHead()
	{
		return node1;
	}
	
//	public IntNode removeNode()
//	{
//		
//	}

}
