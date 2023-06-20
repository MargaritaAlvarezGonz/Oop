//Definicion de la clase
public class Persona {
    //Atributos
    String  nombre;
    int edad;
    char genero;

    //voy a definir un constructor para no tener que hacer cada persona por separado, por ejemplo p1, p2, p3
    /*Persona(){
        System.out.println("Esto es un constructor");
    }*/

    Persona(String n, int ed, char g){
        nombre = n;
        edad = ed;
        genero = g;
        System.out.println("Esto es un constructor");
    }

    void jugarVideojuelgos(Persona p){
        System.out.println(nombre + " Esta jugando con " + p.nombre);
    }

    //Metodos
    void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    //esto es un método, con valor de retorno void; define el punto de inicio del pgrograma
    public static void main(String[] args){
        //vamos a crear el objeto de tipo Persona
        Persona p=new Persona("Alex",32,'M');
        p.nombre ="Alex";
        p.edad=32;
        p.genero='M';
        //estoy definiendo los atributos de mi objeto
        //al momento de poner valores, estoy cambiando el estado del objeto
        p.imprimirInformacion();

        /*Persona p1=new Persona();
        p1.nombre ="Juan";
        p1.edad=51;
        p1.genero='M';
        p1.imprimirInformacion();

        p.jugarVideojuelgos(p1);
        */



    }
}
