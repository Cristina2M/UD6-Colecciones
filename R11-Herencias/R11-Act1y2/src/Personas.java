public class Personas {
   private String Nif;
   private int Altura;
    private int Edad;
// contructor por defecto
public Personas(){
    this.Nif = "1111111A";
    this.Altura =  175;
    this.Edad = 25;
}
//contructor de parametros
public Personas (String Nif, int Altura, int Edad){
    this.Nif = Nif;
    this.Altura = Altura;
    this.Edad = Edad;
}
//Getters
public String getNif(){
    return Nif;
}

public int getAltura(){
    return Altura;
}

public int getEdad(){
    return Edad;
}

// setters de parametros

public void setNif(String Nif){
    this.Nif = Nif;
}
public void setAltura(int Altura){
    this.Altura = Altura;
}

public void setEdad(int Edad){
    this.Edad = Edad;
}
public void mostrar(){
    System.out.println("Nif " + Nif + " Altura " + Altura + " cm "+ "Edad " +  Edad  + " Años ");
}
}
