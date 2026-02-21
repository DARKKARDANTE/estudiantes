public class estudiante {


    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;


    public estudiante(String nombre) {
        this.nombre = nombre;
    }

    public estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;

        this.nota1 = nota1;

        this.nota2 = nota2;

        this.nota3 = nota3;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    @Override
    public String toString() {
        return "estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }


    //METODOS PROPIO
    public void mostrarInformacion(){

        System.out.println("NOMBRE: " + this.getNombre());
        System.out.println("NOTA1: " + this.getNota1());
        System.out.println("NOTA2: " + this.getNota2());
        System.out.println("NOTA3: " + this.getNota3());





    }

    // Metodo que permita asignar notas a los estudiantes

    public void asignarNotas(double n1, double n2, double n3){

        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    //REAR UN METODO SIN PARAMETROS QUE PERMITA CALCULAR EL PROMEDIO DE LAS NOTAS

    public double calcularPromedio(){


        return (this.nota1+this.nota2+this.nota3)/3;

    }

    //CRE SE LLAME ESTA APROBADO QUE TIRE UN TRU SI EL PROMEDIO ES IGUAL A LA NTA MINIMA O FALSE SI ESTA DEBAJO


    public String estaAprobado(double notaMinima){

        double promedio = calcularPromedio();

        if(promedio >=notaMinima) {
            return  "El estudiantes esta aprovado";

        }else{
            return  "El estudiantes esta reprobado";


        }






    }
}






