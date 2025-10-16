// Figura 5.11
// Classe que representa uma apólice de seguro de automóvel

public class AutoPolicy
{
    private int accountNumber; // Número da conta da apólice
    private String makeAndModel; // Carro ao qual a apólice é aplicada
    private String state; // Abreviatura do estadp com duas letras

    // Construtor
    public AutoPolicy(int accountNumber, String makeAndModel, String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // Define o accountNumber
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    // Retorna o accountNumber
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // Configura o makeandModel
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    // Retorna o MakeandModel
    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    // Define o estado
    public void setState(String state)
    {
        this.state = state;
    }

    // Retorna o estado
    public String getState()
    {
        return state;
    }

    // Método predicado é retornado se o estado tem seguros "sem culpa"
    public boolean isNoFaultState() {
        boolean noFaultState;

        // Determina se o estado tem seguros de automóvel "sem culpa"
        switch (getState()) // Obtém a abreviatura do estado do objeto Autopolicy
        {
            case "MA":
            case "NY":
            case "NJ":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}

