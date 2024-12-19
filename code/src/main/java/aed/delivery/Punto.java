/**
 * A Punto is a concrete position in the maze, with knowledge of the geometry of the maze.
 */
package aed.delivery;

public class Punto {
  int x;
  int y;
  boolean sueloMarcadoConTiza;
  String regalo;

  private boolean norte;
  private boolean sur;
  private boolean oeste;
  private boolean este;
  
  public Punto(int x, int y, String regalo, boolean norte, boolean sur, boolean oeste, boolean este) {
    this.x = x;
    this.y = y;
    this.regalo = regalo;
    this.norte = norte;
    this.sur = sur;
    this.oeste = oeste;
    this.este = este;
    this.sueloMarcadoConTiza = false;
  }
  
  public Punto(Punto p) {
    this.x = p.x;
    this.y = p.y;
    this.regalo = p.regalo;
    this.norte = p.norte;
    this.sur = p.sur;
    this.este = p.este;
    this.oeste = p.oeste;
    this.sueloMarcadoConTiza = p.sueloMarcadoConTiza;
  }
  
  boolean accessible(Direccion pc) {
    switch (pc) {
    case NORTE: return norte;
    case SUR: return sur;
    case ESTE: return este;
    case OESTE: return oeste;
    default: return sur;
    }
  }
  
  void setAccessible(Direccion pc, boolean accessible) {
    switch (pc) {
    case NORTE: norte=accessible; break;
    case SUR: sur=accessible; break;
    case ESTE: este=accessible; break;
    case OESTE: oeste=accessible; break;
    default: sur=accessible; break;
    }
  }
  
  public String toString() {
    String tiza = sueloMarcadoConTiza ? ",tiza" : "";
    //String result = "("+x+","+y+")"+sueloMarcadoConTiza;
    String result = "("+x+","+y+")";
    return result;
  }
  
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Punto) {
      Punto otherPunto = (Punto) obj;
      return
        (this.x == otherPunto.x)
        && (this.y == otherPunto.y);
    } else return false;
  }
  
  public int hashCode() {
    return this.x + this.y;
  }
}

