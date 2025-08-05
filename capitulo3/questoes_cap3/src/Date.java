public class Date {

    // Variáveis de instância
    private int dia;
    private int mes;
    private int ano;

    // Construtor de date
    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // Método que define o dia
    public void setDia(int dia) {
        this.dia = dia;
    }

    // Método que retorna o dia
    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // Separação de dia, mes e ano por (/)
    public void displayDate() {
        System.out.printf("%d/%d/%d\n", getDia(),getMes(), getAno());
    }
}

