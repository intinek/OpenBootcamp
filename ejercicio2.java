public class coche{
    public int numPuertas =4;

    public void incrementarPuertas(){
        this.numPuertas++;
    }

    public static void main (String[]args){
        coche miCoche = new coche();
        System.out.println("Resultado: "+ miCoche.numPuertas);

    }
}
