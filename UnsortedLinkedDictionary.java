import java.util.Iterator;

public class UnsortedLinkedDictionary<K, V> implements DictionaryInterface<K, V>
{
private Node firstNode;   // Reference to first node of chain
private int  numberOfEntries; 

public UnsortedLinkedDictionary()
{
	firstNode = null;
	numberOfEntries = 0;
} // end default constructor

		   /* < Implementations of methods in DictionaryInterface. >  . . . */
 
      private class Node
      {
private K key;
private V value;
private Node next;

private Node(K searchKey, V dataValue)
{
key = searchKey;
value = dataValue;
next = null;
} // end constructor

private Node(K searchKey, V dataValue, Node nextNode)
{
key = searchKey;
value = dataValue;
next = nextNode;
} // end constructor
} // end Node

    @Override
    public V add(K key, V value) {
        
        Node newNode = new Node(key, value);
        newNode.next = firstNode;
        firstNode = newNode;
        numberOfEntries++;
    }

    @Override
    public V remove(K key) {
        // TODO Auto-generated method stub
        if (firstNode != null) {
            V value = firstNode.getValue(key);
            firstNode = firstNode.next;
            numberOfEntries--;
            return value;
        }
        return null;
    }

    @Override
    public V getValue(K key) {
        // TODO Auto-generated method stub
       do {
        
       } while
        
        
    }

    @Override
    public boolean contains(K key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        // TODO Auto-generated method stub
        K[] temp = new K[numberOfEntries];
        while (firstNode != null) {
            
        }
        Iterator<K> iter  = 
        return iter;
        
    }

    @Override
    public Iterator<V> getValueIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return numberOfEntries;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    
    
} // end UnsortedLinkedDictionary

class NodeIterator<E> implements Iterator<E> {
	
	private Node firstNode;
	
	public Node
	
	public boolean hasNext() {
		if(firstNode.next() == null) {
			
		}
		return false;
	}
	
	public E next() {
	
	return null;
	}
	
	public void remove() {
	
	}

}

