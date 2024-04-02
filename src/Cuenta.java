public class Cuenta {
    public String nombre;
    private double saldo;
    private int numero;
    public String tipo;

    //Método Constructor
    public Cuenta(String nombre, double saldo, int numero, String tipo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.numero = numero;
        this.tipo = tipo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public void retirar(double retiro){
        if(saldo >= retiro){
            saldo = saldo - retiro;
        }
    }
    public void imprimir (){
        System.out.println("La cuenta es de:" + nombre +
                " su numero de cuenta: " + numero +
                " la cuenta es de tipo: " + tipo +
                " con saldo: " + saldo + "\n");
    }

}
