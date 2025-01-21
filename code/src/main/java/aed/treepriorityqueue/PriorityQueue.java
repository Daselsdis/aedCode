package aed.treepriorityqueue;

import es.upm.aedlib.Entry;

/**
 * A simplified Priority Queue interface.
 */
public interface PriorityQueue<K,V> extends Iterable<Entry<K,V>> {
  public int size();
  public boolean isEmpty();

  public Entry<K,V> first() throws EmptyPriorityQueueException;
  public void enqueue(K k, V v);
  public Entry<K,V> dequeue() throws EmptyPriorityQueueException;
}
