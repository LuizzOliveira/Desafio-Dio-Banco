public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1; //FAZER CONTROLE

    private static int SEQUENCIAL = 1;

    //atributo

    private int agencia;

    private int numero;

    private double saldo;


    //FAZER CONTROLE DAS CLASS FILHAS
    public  Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    //Metodos


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor); //remetente
        contaDestino.depositar(valor); //destino
    }


    public int getAgenicia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void extracted() {
        System.out.printf("Agência: %d", this.agencia);
        System.out.printf("\nNúmero: %d", this.numero);
        System.out.printf("\nSaldo: %.2f", this.saldo);
    }


}
