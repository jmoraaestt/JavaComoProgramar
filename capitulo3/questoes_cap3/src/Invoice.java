public class Invoice {

    // Variáveis de instância
    private String number;
    private String description;
    private int amount;
    private double price;

    // Construtor de Invoice
    public Invoice(String number, String description, int amount, double price) {
        this.number = number;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    // Método que define o número da fatura
    public void setNumber(String number) {
        this.number = number;
    }
    // Método que retorna o número da fatura
    public String getNumber() {
        return number;
    }

    // Método que define a descrição
    public void setDescription(String description) {
        this.description = description;
    }

    // Método que retorna a descrição
    public String getDescription() {
        return description;
    }

    // Método que define o valor
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Método que retorna o valor
    public int getAmount() {
        return amount;
    }

    // Método que define o valor
    public void setPrice(double price) {
        this.price = price;
    }

    // Método que retorna o valor
    public double getPrice() {
        return price;
    }

    // Cálculo da fatura
    public double getInvoiceAmount(int amount, double price) {
        if(amount < 0)
            amount = 0;
        if(price < 0)
            price = 0.0;
        return amount * price;
    }



}
