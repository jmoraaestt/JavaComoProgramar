// Classe student que armazena o nome e a média de um aluno

public class Student {
    private String name;
    private double average;

    // Construtor inicializa as variáveis de instância
    public Student(String name, double average) {
        this.name = name;

        // valida que a média é > 0.0 e < 100.00; caso contrário
        // armazena o valor padrão da média da variável de instância (0.0)
        if(average > 0.0)
            if(average <=100.0)
                this.average = average;
    }
    // Define o nome de student
    public void setName(String name) {
        this.name = name;
    }

    // Recupera o nome de student
    public String getName() {
        return name;
    }

    // Define a média de student
    public void setAverage(double average) {
        // valida que a média é > 0.0 e < 100.00; caso contrário
        // armazena o valor padrão da média da variável de instância (0.0)
        if(average > 0.0)
            if(average <=100.0)
                this.average = average;
    }

    // Recupera a média de student
    public double getAverage(){
        return average;
    }

    // Determina e retorna a letra da nota de Student
    public String getLetterGrade() {

        String letterGrade = ""; // Inicializado com uma string vazia

        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }
}
