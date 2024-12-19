package aed.delivery;

import es.upm.aedlib.positionlist.*;

public class Laberinto {
  Punto[][] puntos;
  int maxY;
  int maxX;
  Punto punto;

  public Laberinto(Punto[][] puntos) {
    this.puntos = puntos;
    this.maxY = puntos.length-1;
    this.maxX = puntos[0].length-1;
    this.punto = puntos[0][0];
  }
  
  public Laberinto(Laberinto oldLaberinto) {
    this.maxY = oldLaberinto.maxY;
    this.maxX = oldLaberinto.maxX;
    this.puntos = new Punto[maxY+1][maxX+1];
    for (int i=0; i<=maxY; i++)
      for (int j=0; j<=maxX; j++)
        this.puntos[i][j] = new Punto(oldLaberinto.puntos[i][j]);
    this.punto = puntos[oldLaberinto.punto.y][oldLaberinto.punto.x];
  }

  public Laberinto(Laberinto oldLaberinto, int x, int y) {
    this(oldLaberinto);
    this.punto = puntos[0][0];
  }
  
  /**
   * Returns an iterable composed of the puntos reachable from this lugar.
   * @return an iterable composed of the puntos reachable from this lugar.
   */
  public Iterable<Direccion> direccionesPosibles() {
    PositionList<Direccion> caminos = new NodePositionList<>();
    for (Direccion pc : Direccion.values()) {
      Punto puntoNuevo = canGo(pc);
      if (puntoNuevo != null)
        caminos.addLast(pc);
    }
    return caminos;
  }
  
  public Punto getPunto() {
    return punto;
  }

  public boolean tieneRegalo() {
    return punto.regalo != null;
  }
  
  public String getRegalo() {
    return punto.regalo;
  }
  
  public boolean sueloMarcadoConTiza() {
    return punto.sueloMarcadoConTiza;
  }
  
  public void marcaSueloConTiza() {
    punto.sueloMarcadoConTiza = true;
  }
  
  public void moverHacia(Direccion pc) {
    /* We have to check that the punto is accessible from the current Punto */
    Punto newPunto = canGo(pc);
    if (newPunto != null) {
      this.punto = newPunto;
    } else throw new IllegalArgumentException("cannot move to "+pc+" at point "+punto+"; there is no path");
  }

  /**
   * Prints the laberinto on the standard output.
   */
  public void printLaberinto(Punto punto) {
    System.out.println(printPuntos());
  }
  

  Punto canGo(Direccion pc) {
    int x = punto.x;
    int y = punto.y;
    int nuevoY = y;
    int nuevoX = x;
    boolean enabled;
    
    switch (pc) {
    case NORTE: nuevoY = y+1; break;
    case SUR: nuevoY = y-1; break;
    case ESTE: nuevoX = x+1; break;
    case OESTE: nuevoX = x-1; break;
    default: nuevoY = y-1;
    }
    
    if (puntos[y][x].accessible(pc)) {
      if (nuevoY >= 0 && nuevoY <= maxY && nuevoX >= 0 && nuevoX <= maxX)
        return puntos[nuevoY][nuevoX];
      else
        return null;
    } else return null;
  }
  
  String printPuntos()
  {
    return printPuntos(punto.y,punto.x);
  }
  
  String printPuntos(int currY, int currX)
  {
    StringBuffer s = new StringBuffer();
    
    for(int i = puntos.length-1; i >= 0; i--) {
      for(int j = 0; j < puntos[i].length; j++)
        s.append(printNorthRoad(i,j));
      s.append("\n");
      
      for(int j = 0; j < puntos[i].length; j++) {
        s.append(printWestRoad(i,j));
        String contents = " ";
        boolean marcado = puntos[i][j].sueloMarcadoConTiza;
        boolean tieneRegalo = puntos[i][j].regalo != null;
        boolean atCurr = (i==currY && j==currX);
        contents += marcado ? "." : " ";
        contents += atCurr ? "x" : " ";
        contents += tieneRegalo ? "$" : " ";
        contents += " ";
        s.append(contents);
        s.append(printEastRoad(i,j));
      }
      s.append("\n");
      
      for(int j = 0; j < puntos[i].length; j++)
        s.append(printSouthRoad(i,j));
      if (i==0) {
        s.append("\n");
        for(int j = 0; j < puntos[i].length; j++)
          s.append(printXcoord(j));
      }
    }
    s.append("\n");
    return s.toString();
  }
  
  String printNorthRoad(int y,int x) {
    String result = "";
    boolean open = puntos[y][x].accessible(Direccion.NORTE);
    if (x==0) result += "  +";
    if (open) result += "     ";
    else result += "-----";
    result += "+";
    return result;
  }
  
  String printSouthRoad(int y,int x) {
    String result = "";
    boolean open = puntos[y][x].accessible(Direccion.SUR);
    if (y==0) {
      if (x==0) result += "  ";
      result += "+";
      if (open) result += "     ";
      else result += "-----";
      if (x==maxX) result += "+";
    }
    return result;
  }
  
  String printXcoord(int x) {
    String result = "";
    if (x==0) result += "  ";
    result += "   "+x+"  ";
    return result;
  }
  
  String printWestRoad(int y,int x) {
    String result = "";
    boolean open = puntos[y][x].accessible(Direccion.OESTE);
    if (x==0) result += y+" ";
    if (open) result += " ";
    else result += "|";
    return result;
  }
  
  String printEastRoad(int y,int x) {
    String result = "";
    if (x==maxX) {
      boolean open = puntos[y][x].accessible(Direccion.ESTE);
      if (open) result += " ";
      else result += "|";
    }
    return result;
  }
  
  void isConsistent() {
    int maxY = puntos.length;
    if (maxY == 0) {
      System.out.println("zero y dimension");
      throw new RuntimeException();
    }
    int maxX = puntos[0].length;
    if (maxX == 0) {
      System.out.println("zero x dimension");
      throw new RuntimeException();
    }
    
    for (int i=0; i<maxY; i++) {
      Punto[] xPuntos = puntos[i];
      if (xPuntos.length != maxX) {
        System.out.println("x dimension is inconsistent: ");
        throw new RuntimeException();
      }
    }
    
    for (int y=0; y<=maxY; y++)
      for (int x=0; x<=maxX; x++) {
        Punto p = puntos[y][x];
        
        if (y==0) assert !p.accessible(Direccion.SUR);
        if (y==maxY-1) assert !p.accessible(Direccion.NORTE);
        if (x==0) assert !p.accessible(Direccion.OESTE);
        if (x==maxX-1) assert !p.accessible(Direccion.ESTE);
        
        checkConsistent(y,x,y+1,x,Direccion.NORTE,Direccion.SUR);
        checkConsistent(y,x,y-1,x,Direccion.SUR,Direccion.NORTE);
        checkConsistent(y,x,y,x+1,Direccion.ESTE,Direccion.OESTE);
        checkConsistent(y,x,y,x-1,Direccion.OESTE,Direccion.ESTE);
      }
  }
  
  void checkConsistent(int origy, int origx, int y, int x, Direccion to, Direccion from) {
    if (y>0 && y<maxY && x>0 && x<maxX) {
      boolean accessibleTo = puntos[origy][origx].accessible(to);
      boolean accessibleFrom = puntos[y][x].accessible(from);
      if (accessibleTo != accessibleFrom) {
        System.out.println
          ("Inconsistent block for nodes ("+origy+","+origx+") and "+
           "("+y+","+x+") and directions to="+to+" ("+accessibleTo+") and back="+from+" ("+accessibleFrom+")");
        throw new RuntimeException();
      }
    }
  }

  public String toString() {
    return "\n"+printPuntos()+"\n";
  }
  
  public boolean equals(Object obj) {
    if (obj instanceof Laberinto) return true;
    else return false;
  }

  public int hashCode() { return 1; }
}
