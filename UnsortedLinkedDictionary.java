import java.util.Iterator;

public class UnsortedLinkedDictionary<K, V> implements DictionaryInterface<K, V>
{
private Node firstNode;   // Reference to first node of chain
private int  numberOfEntries; 

public UnsortedLinkedDictionary()
{
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(K key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V getValue(K key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean contains(K key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        // TODO Auto-generated method stub
        return null;
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
        return 0;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
} // end UnsortedLinkedDictionary

