# 📘 Capítulo 3 - Introdução a Classes, Objetos, Métodos e Strings

Este repositório contém os enunciados e soluções dos exercícios propostos no **Capítulo 3** do livro *"Java: Como Programar — 10ª Edição (Deitel)"*, abordando conceitos como:

- Criação de classes e objetos
- Métodos com parâmetros
- Getters e Setters
- Construtores
- Encapsulamento
- Manipulação de Strings


---

## Enunciado 3.11 & 3.15 — *Classe Account Modificada* e *Removendo código duplicado no método main*

> **(Classe Account modificada)**  
> Modifique a classe Account (Figura 3.8) para fornecer um método chamado `withdraw` que retira dinheiro de uma Account.  
> Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado e o método deve imprimir:  
> **"Withdrawal amount exceeded account balance"**  
> Modifique a classe AccountTest (Figura 3.9) para testar o método `withdraw`.

> Na classe AccountTest da Figura 3.9, o método main contém seis instruções redundantes. Crie um método `displayAccount(Account accountToDisplay)` para substituir essas duplicações.  
> Lembre-se de declarar o método como `static`.

### ✅ Soluções
- 🔸 [Account.java](./exemplos_cap3/src/Account.java)  
- 🧪 [AccountTest.java](./capitulo3/exemplos_cap3/src/AccountTests.java)

---

## Enunciado 3.12 — *Classe Invoice*

> **(Classe Invoice)**  
> Crie uma classe chamada `Invoice` para representar uma fatura de um item vendido.  
> Ela deve conter:
> - Número (String)
> - Descrição (String)
> - Quantidade (int)
> - Preço por item (double)  
>  
> Forneça `get/set` para todas as variáveis de instância.  
> Crie também o método `getInvoiceAmount()` que retorna o total da fatura.  
> Se a quantidade ou o preço forem negativos, ajuste para 0.  
> Crie uma classe `InvoiceTest` para demonstrar a classe.

### ✅ Soluções
- 🔸 [Invoice.java](./capitulo3/questoes_cap3/src/Invoice.java)  
- 🧪 [InvoiceTest.java](./capitulo3/questoes_cap3/src/InvoiceTest.java)

---

## Enunciado 3.13 — *Classe Employee*

> Crie uma classe `Employee` com:
> - Primeiro nome (String)
> - Sobrenome (String)
> - Salário mensal (double)  
>  
> Forneça `get/set` para todos os campos.  
> Não permita que o salário mensal seja negativo.  
> Crie dois objetos `Employee`, exiba o salário anual de cada um, aplique um aumento de 10% e exiba novamente.

### ✅ Soluções
- 🔸 [Employee.java](./capitulo3/questoes_cap3/src/Employee.java)  
- 🧪 [EmployeeTest.java](./capitulo3/questoes_cap3/src/EmployeeTest.java)

---

## Enunciado 3.14 — *Classe Date*

> Crie uma classe `Date` com:
> - Mês (int)
> - Dia (int)
> - Ano (int)  
>  
> Forneça `get/set` para todas as variáveis de instância.  
> Crie o método `displayDate()` que exibe os valores no formato **mm/dd/yyyy**.  
> Escreva um teste chamado `DateTest`.

### ✅ Soluções
- 🔸 [Date.java](./capitulo3/questoes_cap3/src/Date.java)  
- 🧪 [DateTest.java](./capitulo3/questoes_cap3/src/DateTest.java)

---

> ℹ️ Todos os enunciados foram retirados do livro **"Java - Como Programar" (Deitel, 10ª edição)**.  
> Os arquivos de código e testes estão organizados nos diretórios `exemplos_cap3` e `questoes_cap3`.

📂 Voltar ao [README principal](../README.md)
