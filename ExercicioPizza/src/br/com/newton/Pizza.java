package br.com.newton;

public class Pizza {

    public String nome;
    public Double valor;
    public Boolean possuiborda;
    public String um;

    public Double Calcularvalor(Boolean possuiborda){
        if (possuiborda){
            return valor + 5.00;
        }
        return valor;
    }
    public String Consultarnome(){
        return nome;
    }

}
