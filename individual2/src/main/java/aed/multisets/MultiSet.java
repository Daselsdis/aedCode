package aed.multisets;

import es.upm.aedlib.positionlist.PositionList;


/**
 * Define los metodos implementados sobre multiconjuntos.
 */
public interface MultiSet<E> {
  
  /**
   * Añade n copias de elem al multiset.
   * @throws IllegalArgumentException si n<0.
   */
  public void add(E elem, int n);
  
  /**
   * Borra n copias de elem en el multiset.
   * Devuelve el numero de copias borrados, que es 0 o n.
   *
   * @throws IllegalArgumentException si n<0.
   */
  public int remove(E elem, int n);
  
  /**
   * Devuelve el numero de copias de elem en el multiset.
   *
   */
  public int multiplicity(E elem);
  
  /**
   * Devuelve el numero total de copias de elementos en el multiset.
   * Por ejemplo, si s = {a,b,a,b,b} entonces s.size() devuelve 5.
   */
  public int size();
  
  /**
   * Devuelve true si el multiconjunto es vacio, y false si no es vacio.
   */
  public boolean isEmpty();
  
  /**
   * Devuelve una lista con los elementos que tiene una multiplicidad > 0
   * dentro el multiconjunto.
   * El orden de los elementos en el resultado no importa.
   * Por ejemplo, si s = {a,b,a,b,b} entonces devuelve la lista [a,b].
   */
  public PositionList<E> elements();
  
  /**
   * Devuelve un multiset nuevo que es la suma de this y s.
   * Por ejemplo, si this={a,b,b} y s={a,a,c} entonces devuelve el multiconjunto
   * {a,a,a,b,b,c}.
   */
  public MultiSet<E> sum(MultiSet<E> s);
  
  /**
   * Devuelve un multiset nuevo que es "this resta s".
   * Por ejemplo, si this={a,a,b,b} y s={a,c} entonces devuelve el multiconjunto
   * {a,b,b}.
   */
  public MultiSet<E> minus(MultiSet<E> s);
  
  /**
   * Devuelve un multiset nuevo que es la interseccion de this y s.
   * Por ejemplo, si s={a,a,b,b} y this={a,c} entonces devuelve el multiconjunto {a}.
   */
  public MultiSet<E> intersection(MultiSet<E> s);
  
  /**
   * Devuelve true si this es un submultiset de s, y false si no.
   * Por ejemplo, si s={a,b} y this={a} devuelve true,
   * si s={a} y this={a} devuelve true,
   * si s={a} y this={a,b} devuelve false,
   * y si s={a} y this={a,a} devuelve false,
   */
  public boolean subsetEqual(MultiSet<E> s);

}
