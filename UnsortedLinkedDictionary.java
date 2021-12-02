import java.util.Iterator;

public class UnsortedLinkedDictionary<K, V> implements DictionaryInterface<K, V>
{
    private Node firstNode;   // Reference to first node of chain
    private int  numberOfEntries; 

public UnsortedLinkedDictionary(){
    firstNode = null;
    numberOfEntries = 0;
} // end default constructor

    public V add(K key, V value) {
        if(key == null || value == null)
            throw new IllegalArgumentException("No null entries");
        else{
            V item = null;
            Node currentNode = firstNode;
            while(currentNode != null){
                if(currentNode.key.equals(key)){
                    item = currentNode.value;
                    currentNode.value = value;
                    return item;
                }
                currentNode = currentNode.next;
            }
            if(isEmpty()){
                Node newNode = new Node(key, value);
                firstNode = newNode;
            }
            else{
                Node newNode = new Node(key, value, firstNode);
                firstNode = newNode;
            }
            numberOfEntries++;
            return item;
        }
    }

    public V remove(K key) {
        V item = null;
        Node currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.key.equals(key)){
                item = currentNode.value;
                numberOfEntries--;
                currentNode.key = firstNode.key;
                currentNode.value = firstNode.value;
                firstNode = firstNode.next;
                return item;
            }
            currentNode = currentNode.next;
        }
        return item;
    }

    public V getValue(K key){
        V value = null;
        Node currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.key.equals(key)){
                value = currentNode.value;
                return value;
            }
            currentNode = currentNode.next;
        }
        return value;
    }

    public boolean contains(K key) {
        boolean found = false;
        Node currentNode = firstNode;
        if(currentNode == null)
            return found;
        while(currentNode != null){
            if(currentNode.key.equals(key)){
                found = true;
                return found;
            }
            currentNode = currentNode.next;
        }
        return found;
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

    public boolean isEmpty() {
        return numberOfEntries == 0 && firstNode == null;
    }

    public int getSize() {
        return numberOfEntries;
    }

    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }
 
      private class Node{
        private K key;
        private V value;
        private Node next;

        private Node(K searchKey, V dataValue){
            key = searchKey;
            value = dataValue;
            next = null;
            } // end constructor

        private Node(K searchKey, V dataValue, Node nextNode){
            key = searchKey;
            value = dataValue;
            next = nextNode;
            } // end constructor
        } // end Node
} // end UnsortedLinkedDictionary
