// Operadores lógicos

public class LogicalOperators {
    public static void main(String[] args ) {
        // Cria uma tabela-verdade para o operador && (E condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)", "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // Cria tabela-verdade para o operador || (OU condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (||)", "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // Cria uma tabela-verdade para o operador & (E lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical inclusive AND (&)", "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (false & true),
                "true & true", (true & true));

        // Cria uma tabela-verdade para o operador | (OU inclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical inclusive OR (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical exclusive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true)
        );
        // cria a tabela-verdade para o operador ! (negação lógica)
        System.out.printf("%s%n%s: %b%n%s: %b%n",
                "Logical NOT (!)",
                "!false", (!false),
                "!true", (!true)
        );
    }
}
