
public class Controlador {
    public double frecuencia;

    public Controlador(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public void subir(){
        frecuencia= frecuencia + 0.5;
    }
    
    public void bajar(){
        frecuencia = frecuencia - 0.5;
    }
    
    public void mostrar(){
        System.out.println("La frecuencia estimada es " + frecuencia);
    }
    
    public void manejo(){
        if(frecuencia <80){
            frecuencia=180;
        } else if(frecuencia>180){
            frecuencia=80;
        }
    }
    
    public static void main(String[] args) {
        Controlador con1 = new Controlador(180);
        
        con1.subir();
        con1.manejo();
        con1.mostrar();
        
    }
}