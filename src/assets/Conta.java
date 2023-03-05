package assets;

public class Conta {
    private int id;
    private String nome;
    private double saldo = 2000.00;

    public double sacar(double num1){
        return saldo = saldo - num1;
    }
    public double depositar(double num1){
        return saldo = saldo + num1;
    }
    public void printar(){
        System.out.println(saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
