# 📘 Capítulo 5: Instruções de Controle, Parte II

**Instruções de controle: parte II; operadores lógicos**

---

## 📑 Sumário

1. [Princípios Básicos da Repetição Controlada por Contador](#52-princípios-básicos-da-repetição-controlada-por-contador)
2. [Instrução `for`](#53-instrução-de-repetição-for)
3. [Exemplos com `for`](#54-exemplos-com-a-estrutura-for)
4. [Instrução `do...while`](#55-a-instrução-de-repetição-dowhile)
5. [Estrutura `switch`](#56-a-estrutura-de-seleção-múltipla-switch)
6. [Estudo de Caso: `switch` com `String`](#57-estudo-de-caso-da-classe-autopolicy-switch-com-string)
7. [Instruções `break` e `continue`](#58-instruções-break-e-continue)
8. [Operadores Lógicos](#59-operadores-lógicos)

---

## 5.2 Princípios Básicos da Repetição Controlada por Contador

Para loops onde o número de iterações é conhecido, usamos a **repetição controlada por contador**.

Ela requer quatro elementos:

1. **Variável de controle** (ou contador de loop).
2. **Valor inicial** da variável.
3. **Incremento/decremento** pelo qual a variável é modificada.
4. **Condição de continuação** do loop.

> 💡 Dica: Utilize `int` para controlar loops de contagem para evitar problemas de precisão com tipos `float` ou `double`.

<details>
<summary>Código Exemplo com `while`</summary>

```java
public class WhileCounter {
    public static void main(String args[]) {
        int counter = 1; // 1. declara e 2. inicializa

        while (counter <= 10) { // 4. Condição de continuação
            System.out.printf("%d ", counter);
            ++counter; // 3. Incremento
        }
        System.out.println();
    }
}
```

</details>

---

## 5.3 Instrução de Repetição `for`

A instrução `for` condensa os quatro elementos da repetição controlada por contador em uma única linha, tornando o código mais legível e compacto.

**Sintaxe Geral:**

```java
for (inicialização; condiçãoDeContinuaçãoDoLoop; incremento)
```

<details>
<summary>Código Exemplo com `for`</summary>

```java
public class ForCounter {
    public static void main(String args[]) {
        // Cabeçalho do for inclui inicialização, condição e incremento
        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("%d ", counter);
        }
        System.out.println();
    }
}
```

</details>

> ⚠️ Cuidado: Usar `<` em vez de `<=` pode causar um **erro off-by-one**, fazendo o loop executar uma vez a menos que o esperado.

---

## 5.4 Exemplos com a Estrutura `for`

A estrutura `for` é flexível e permite diversas configurações de contagem.

<details>
<summary>Variações de Contagem</summary>

```java
// a) De 1 a 100 em incrementos de 1
for (int i = 1; i <= 100; i++)

// b) De 100 a 1 em decrementos de 1
for (int i = 100; i >= 1; i--)

// c) De 7 a 77 em incrementos de 7
for (int i = 7; i <= 77; i += 7)

// d) De 20 a 2 em decrementos de 2
for (int i = 20; i >= 2; i -= 2)
```

</details>

<details>
<summary>Aplicação: Cálculo de Juros Compostos</summary>

```java
public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            // Calcula nova quantia com Math.pow
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
```

</details>

---

## 5.5 A Instrução de Repetição `do...while`

Similar ao `while`, mas a condição de continuação é testada **após** o corpo do loop.

> ✅ Isso garante que o corpo do loop seja executado **pelo menos uma vez**.

<details>
<summary>Código Exemplo `do...while`</summary>

```java
public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10); // Note o ponto e vírgula
        System.out.println();
    }
}
```

</details>

---

## 5.6 A Estrutura de Seleção Múltipla `switch`

O `switch` permite testar uma variável contra uma lista de valores (`case`). É uma alternativa mais limpa para `if-else if-else` aninhados.

### 🔹 Características

* Funciona com `byte`, `short`, `int`, `char` e `String`.
* A instrução `break` é usada para sair do `switch` após um `case` ser executado.
* `default` é opcional e executado se nenhum `case` corresponder.

<details>
<summary>Código: Contando Notas Escolares</summary>

```java
while (input.hasNext()) {
    int grade = input.nextInt();
    switch (grade / 10) {
        case 9:
        case 10:
            ++aCount;
            break;
        case 8:
            ++bCount;
            break;
        default:
            ++fCount;
            break;
    }
}
```

</details>

---

## 5.7 Estudo de Caso da Classe `AutoPolicy`: `switch` com `String`

Demonstra como usar a instrução `switch` para avaliar o valor de uma `String`.

<details>
<summary>Código: Método `isNoFaultState`</summary>

```java
public boolean isNoFaultState() {
    boolean noFaultState;

    switch (getState()) {
        case "MA":
        case "NJ":
        case "NY":
        case "PA":
            noFaultState = true;
            break;
        default:
            noFaultState = false;
            break;
    }
    return noFaultState;
}
```

</details>

---

## 5.8 Instruções `break` e `continue`

Alteram o fluxo de controle dentro de estruturas de repetição.

### `break`

* Sai **imediatamente** de um loop (`for`, `while`, `do...while`) ou `switch`.
* Exemplo: `if (count == 5) break;`

### `continue`

* Pula o restante do corpo do loop e **continua para a próxima iteração**.
* Exemplo: `if (count == 5) continue;`

<details>
<summary>Código Exemplo `break` vs `continue`</summary>

```java
// Exemplo com break
for (int count = 1; count <= 10; count++) {
    if (count == 5)
        break;
    System.out.printf("%d ", count);
}

// Exemplo com continue
for (int count = 1; count <= 10; count++) {
    if (count == 5)
        continue;
    System.out.printf("%d ", count);
}
```

</details>

---

## 5.9 Operadores Lógicos

Combinam múltiplas condições para formar expressões lógicas complexas.

| Operador | Nome                             | Exemplo                          | Descrição                                                |        |            |        |                                                       |
| :------: | -------------------------------- | -------------------------------- | -------------------------------------------------------- | ------ | ---------- | ------ | ----------------------------------------------------- |
|   `&&`   | **E** Condicional                | `cond1 && cond2`                 | `true` se **ambas** as condições forem verdadeiras.      |        |            |        |                                                       |
|     `    |                                  | `                                | **OU** Condicional                                       | `cond1 |            | cond2` | `true` se **pelo menos uma** condição for verdadeira. |
|    `!`   | **NÃO** Lógico                   | `!cond`                          | Inverte o valor booleano da condição.                    |        |            |        |                                                       |
|    `&`   | **E** Lógico Booleano            | `cond1 & cond2`                  | Igual ao `&&`, mas **sempre avalia ambas** as condições. |        |            |        |                                                       |
|     `    | `                                | **OU** Inclusivo Lógico Booleano | `cond1                                                   | cond2` | Igual ao ` |        | `, mas **sempre avalia ambas** as condições.          |
|    `^`   | **OU** Exclusivo Lógico Booleano | `cond1 ^ cond2`                  | `true` se **apenas uma** das condições for verdadeira.   |        |            |        |                                                       |

> 🚀 **Performance:** Os operadores `&&` e `||` são mais eficientes, pois realizam **avaliação de curto-circuito**.

---
