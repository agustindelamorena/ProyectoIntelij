package Segundo;

public class Ejercicio2 {

    public static void main(String[] args) {
        //TODO Busca el triángulo de color verde  o pulsa Shift + F10
        //TODO Presiona Ctrl + Alt + L  ,y selecciona todo el archivo

        Archivo archivo =null;

        double n = Math.random()*10;

        int randomInteger = (int) (Math.random() * n) + 1;

        double m = randomInteger%2;
        //TODO presiona Control + G, escribe 11 y haz doble click a la derecha del numero de la linea
        //TODO busca al lado del menu de ejecucion un logo de un insecto y pincha en él
        if (m == 0){
                                                archivo = new Imagen();
                                                                                                     }else {

                 archivo=new Cancion();
        }
        //TODO Pulsa Ctrl + N , escribe archivo y dale al enter.
         archivo.abrirArchivo();
    }

}
