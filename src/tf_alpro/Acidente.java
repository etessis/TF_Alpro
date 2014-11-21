package programadeacidentes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tessis
 */
public class Acidente {

    private String rua;
    private String tipo;
    private Date dataHora;
    private String diaSemana;
    private int feridos;
    private int mortes;
    private int mortesPos;
    private int fatais;
    private int auto;
    private int taxi;
    private int lotacao;
    private int onibusUrb;
    private int onibusInt;
    private int caminhao;
    private int moto;
    private int carroca;
    private int bicicleta;
    private String tempo;
    private String noiteDia;
    private String regiao;

    public Acidente(String rua, String tipo, Date dataHora, String diaSemana, int feridos, int mortes, int mortesPos, int fatais, int auto, int taxi, int lotacao, int onibusUrb, int onibusInt, int caminhao, int moto, int carroca, int bicicleta, String tempo, String noiteDia, String regiao) {
        this.rua = rua;
        this.tipo = tipo;
        this.dataHora = dataHora;
        this.diaSemana = diaSemana;
        this.feridos = feridos;
        this.mortes = mortes;
        this.mortesPos = mortesPos;
        this.fatais = fatais;
        this.auto = auto;
        this.taxi = taxi;
        this.lotacao = lotacao;
        this.onibusUrb = onibusUrb;
        this.onibusInt = onibusInt;
        this.caminhao = caminhao;
        this.moto = moto;
        this.carroca = carroca;
        this.bicicleta = bicicleta;
        this.tempo = tempo;
        this.noiteDia = noiteDia;
        this.regiao = regiao;
    }

    public String getRua() {
        return rua;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public int getFeridos() {
        return feridos;
    }

    public int getMortes() {
        return mortes;
    }

    public int getMortesPos() {
        return mortesPos;
    }

    public int getFatais() {
        return fatais;
    }

    public int getAuto() {
        return auto;
    }

    public int getTaxi() {
        return taxi;
    }

    public int getLotacao() {
        return lotacao;
    }

    public int getOnibusUrb() {
        return onibusUrb;
    }

    public int getOnibusInt() {
        return onibusInt;
    }

    public int getCaminhao() {
        return caminhao;
    }

    public int getMoto() {
        return moto;
    }

    public int getCarroca() {
        return carroca;
    }

    public int getBicicleta() {
        return bicicleta;
    }

    public String getTempo() {
        return tempo;
    }

    public String getNoiteDia() {
        return noiteDia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setFeridos(int feridos) {
        this.feridos = feridos;
    }

    public void setMortes(int mortes) {
        this.mortes = mortes;
    }

    public void setMortesPos(int mortesPos) {
        this.mortesPos = mortesPos;
    }

    public void setFatais(int fatais) {
        this.fatais = fatais;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public void setTaxi(int taxi) {
        this.taxi = taxi;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public void setOnibusUrb(int onibusUrb) {
        this.onibusUrb = onibusUrb;
    }

    public void setOnibusInt(int onibusInt) {
        this.onibusInt = onibusInt;
    }

    public void setCaminhao(int caminhao) {
        this.caminhao = caminhao;
    }

    public void setMoto(int moto) {
        this.moto = moto;
    }

    public void setCarroca(int carroca) {
        this.carroca = carroca;
    }

    public void setBicicleta(int bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public void setNoiteDia(String noiteDia) {
        this.noiteDia = noiteDia;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Acidente{" + "rua=" + rua + ", tipo=" + tipo + ", dataHora=" + dataHora + ", diaSemana=" + diaSemana + ", feridos=" + feridos + ", mortes=" + mortes + ", mortesPos=" + mortesPos + ", fatais=" + fatais + ", auto=" + auto + ", taxi=" + taxi + ", lotacao=" + lotacao + ", onibusUrb=" + onibusUrb + ", onibusInt=" + onibusInt + ", caminhao=" + caminhao + ", moto=" + moto + ", carroca=" + carroca + ", bicicleta=" + bicicleta + ", tempo=" + tempo + ", noiteDia=" + noiteDia + ", regiao=" + regiao + '}';
    }

}
