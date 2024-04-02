public class Main {

    public static void main(String[] args) {
            Cuenta cuentaCredito = new Cuenta ("Cesar", 1500, 244513,"Credito");
            Cuenta cuentaDebito = new Cuenta ("Marlen",7800,273516,"Debito");

            cuentaDebito.imprimir();
            cuentaCredito.imprimir();
            cuentaDebito.setNumero(666);
            cuentaDebito.imprimir();
        }
}
