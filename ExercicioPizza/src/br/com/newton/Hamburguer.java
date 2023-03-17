package br.com.newton;

public class Hamburguer {

    public String nome;
    public Double valor;
    public String artesanal;

    public Double calcularvalor(Boolean artesanal){
        if (artesanal){
            return valor + 8.00;
        }
        return valor;
    }
    public String consultavalor(){
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getArtesanal() {
        return artesanal;
    }

    public void setArtesanal(String artesanal) {
        this.artesanal = artesanal;
    }
}
