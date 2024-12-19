/**
 * A Direccion is a direction
 */
package aed.delivery;

public enum Direccion {
  NORTE, SUR, ESTE, OESTE; 

  // Devuelve la direccion opuesta a su argumento
  public static Direccion opuesto(Direccion pc) {
    switch (pc) {
    case NORTE: return Direccion.SUR;
    case SUR: return Direccion.NORTE;
    case ESTE: return Direccion.OESTE;
    case OESTE: return Direccion.ESTE;
    default: throw new RuntimeException();
    }
  }
}
