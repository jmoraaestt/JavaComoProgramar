# 📘 Capítulo 4: Instruções de Controle em Java

**Instruções de controle: parte I; operadores de atribuição `++` e `--`**

---

## 📑 Sumário
1. [Algoritmos](#42-algoritmos)  
2. [Pseudocódigo](#43-pseudocódigo)  
3. [Estruturas de Controle](#44-estruturas-de-controle)  
4. [Instruções `if` e `if...else`](#45-instrução-de-seleção-única-if)  
5. [Classe `Student`](#47-classe-student-ifelse-aninhadas)  
6. [Estruturas de Repetição](#48-instrução-de-repetição-while)  
7. [Algoritmos com Contador](#49-formulando-algoritmos-repetição-controlada-por-contador)  
8. [Algoritmos com Sentinela](#410-algoritmos-com-repetição-controlada-por-sentinela)  
9. [Controle Aninhado](#411-instruções-de-controle-aninhadas)  
10. [Operadores de Atribuição Compostos](#412-operadores-de-atribuição-compostos)  
11. [Incremento e Decremento](#413-operadores-de-incremento-e-decremento)  

* [Exercícios](README4_exercicios.md)

---

## 4.2 Algoritmos
Qualquer problema de computação pode ser resolvido executando uma série de ações em uma ordem específica.  

Um **algoritmo** é um procedimento para resolver um problema em termos de:  
1. Ações a executar  
2. Ordem em que essas ações executam  

> 💡 Dica: Sempre defina claramente os passos antes de codificar.

---

## 4.3 Pseudocódigo
O **pseudocódigo** é uma linguagem informal que ajuda a desenvolver algoritmos sem se preocupar com a sintaxe do Java.

> Neste capítulo, pseudocódigos serão convertidos em trechos estruturados em Java.

---

## 4.4 Estruturas de Controle
Normalmente, instruções em um programa são executadas uma após a outra (**execução sequencial**).  

O Java permite alterar a ordem de execução (**transferência de controle**).

### 🔹 Tipos
1. **Sequência** → Executa instruções na ordem.  
2. **Seleção** → `if`, `if...else`, `switch`.  
3. **Repetição** → `while`, `do...while`, `for`, `for aprimorado`.  

---

## 4.5 Instrução de Seleção Única: `if`
<details>
<summary>Código Pseudocódigo / Java</summary>

```text
Se a nota do aluno for maior ou igual a 60
Imprima "Aprovado"
````

```java
if (studentGrade >= 60) {
    System.out.println("Passed");
}
```

</details>

---

## 4.6 Instrução de Seleção Dupla: `if...else`

<details>
<summary>Código Pseudocódigo / Java</summary>

```text
Se a nota do aluno >= 60 → "Aprovado"
Senão → "Reprovado"
```

```java
if (studentGrade >= 60) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

</details>

### Instruções `if...else` Aninhadas

<details>
<summary>Código Java</summary>

```java
if (studentGrade >= 90)
    System.out.println("A");
else if (studentGrade >= 80)
    System.out.println("B");
else if (studentGrade >= 70)
    System.out.println("C");
else if (studentGrade >= 60)
    System.out.println("D");
else
    System.out.println("F");
```

</details>

### ⚠️ Problema do Else Oscilante

<details>
<summary>Exemplo / Correção</summary>

```java
// Errado
if (x > 5)
    if (y > 6)
        System.out.println("x and y are > 5");
else
    System.out.println("x is <= 5");

// Correto
if (x > 5) {
    if (y > 6)
        System.out.println("x and y are > 5");
} else {
    System.out.println("x is <= 5");
}
```

</details>

### Blocos

```java
if (grade >= 60)
    System.out.println("Passed");
else {
    System.out.println("Failed");
    System.out.println("You must take this course again.");
}
```

---

### Operador Condicional `? :`

```java
System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
```

---

## 4.7 Classe `Student`: if...else Aninhadas

<details>
<summary>Código Completo</summary>

```java
public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if (average > 0.0 && average <= 100.0)
            this.average = average;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAverage(double average) {
        if (average > 0.0 && average <= 100.0)
            this.average = average;
    }
    public double getAverage() { return average; }

    public String getLetterGrade() {
        if (average >= 90.0) return "A";
        else if (average >= 80.0) return "B";
        else if (average >= 70.0) return "C";
        else if (average >= 60.0) return "D";
        else return "F";
    }
}
```

</details>

---

## 4.8 Instrução de Repetição `while`

```java
int product = 3;
while (product <= 100)
    product = 3 * product;
```

---

## 4.9 Algoritmo com Repetição Controlada por Contador

<details>
<summary>Código Java</summary>

```java
int total = 0;
int gradeCounter = 1;
while (gradeCounter <= 10) {
    int grade = input.nextInt();
    total += grade;
    gradeCounter++;
}
int average = total / 10;
```

</details>

---

## 4.10 Algoritmos com Sentinela

<details>
<summary>Código Java</summary>

```java
int total = 0, gradeCounter = 0;
int grade = input.nextInt();
while (grade != -1) {
    total += grade;
    gradeCounter++;
    grade = input.nextInt();
}
if (gradeCounter != 0) {
    double average = (double) total / gradeCounter;
    System.out.printf("Average: %.2f", average);
} else {
    System.out.println("No grades entered");
}
```

</details>

---

## 4.11 Controle Aninhado

```java
int passes = 0, failures = 0, studentCounter = 1;
while (studentCounter <= 10) {
    int result = input.nextInt();
    if (result == 1) passes++;
    else failures++;
    studentCounter++;
}
if (passes > 8) System.out.println("Bonus to instructor!");
```

---

## 4.12 Operadores de Atribuição Compostos

| Operador | Expressão | Explicação           |
| -------- | --------- | -------------------- |
| `+=`     | `c += 7`  | Soma e atribui       |
| `-=`     | `d -= 4`  | Subtrai e atribui    |
| `*=`     | `e *= 5`  | Multiplica e atribui |
| `/=`     | `f /= 3`  | Divide e atribui     |
| `%=`     | `g %= 9`  | Resto da divisão     |

---

## 4.13 Incremento e Decremento

| Operador | Tipo | Exemplo | Descrição         |
| -------- | ---- | ------- | ----------------- |
| `++`     | Pré  | `++a`   | Incrementa antes  |
| `++`     | Pós  | `a++`   | Incrementa depois |
| `--`     | Pré  | `--b`   | Decrementa antes  |
| `--`     | Pós  | `b--`   | Decrementa depois |

```java
int a = 5;
System.out.println(++a); // 6
System.out.println(a++); // 6
```



