package classes;

public class Servicos {
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getFuncResp() {
        return funcResp;
    }

    public void setFuncResp(String funcResp) {
        this.funcResp = funcResp;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPetServico() {
        return petServico;
    }

    public void setPetServico(String petServico) {
        this.petServico = petServico;
    }

    private String desc;
    private float duracao;
    private String funcResp;
    private float valor;
    private String petServico;
}
