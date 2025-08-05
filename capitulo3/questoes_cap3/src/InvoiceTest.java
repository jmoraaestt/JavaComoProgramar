import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("29321", "Descrição", 10, 30.2);

        System.out.printf("Number Invoice: %s\n", invoice1.getNumber());
        System.out.printf("Description: %s\n", invoice1.getDescription());
        System.out.printf("Amount: %d\n", invoice1.getAmount());
        System.out.printf("Price: $%.2f\n", invoice1.getPrice());
        System.out.printf("Balance: $%.2f", invoice1.getInvoiceAmount(invoice1.getAmount(), invoice1.getPrice()));
    }
}
