package aed.treepriorityqueue;

import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.tree.*;


public class TreePriorityQueue<K extends Comparable<K>,V> implements PriorityQueue<K,V> {

  public BinaryTree<Entry<K,V>> t;
  private Position<Entry<K,V>> lastPos;

  public TreePriorityQueue() {
    t = new LinkedBinaryTree<>();
    lastPos = null;
  }

  public int size() {
    return 0;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public Entry<K,V> first() throws EmptyPriorityQueueException {
    return null;
  }

  public void enqueue(K k, V v) {
  }
  
  public Entry<K,V> dequeue() throws EmptyPriorityQueueException {
    return null;
  }

  public String toString() {
    return t.toString();
  }

  public Iterator<Entry<K,V>> iterator() {
    return null;
  }
}
