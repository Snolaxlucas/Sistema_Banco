package assets;

public class Conta {
    private int id;
    private String nome;
    private double saldoPolpan = 2000.00;

    private double saldoCorren;

    public double sacar(double num1){
        return saldoPolpan = saldoPolpan - num1;
    }
    public double depositar(double num1){
        return saldoPolpan = saldoPolpan + num1;
    }
    public double tranfer(){
        return saldoPolpan = saldoPolpan - saldoCorren;
    }
    public void printarpolp(){
        System.out.println(saldoPolpan);
    }
    public void printarcorren(){
        System.out.println(saldoCorren);
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
        return saldoPolpan;
    }

    public void setSaldo(double saldo) {
        this.saldoPolpan = saldo;
    }

    public double getSaldoCorren() {
        return saldoCorren;
    }

    public void setSaldoCorren(double saldoCorren) {
        this.saldoCorren = saldoCorren;
    }
}

