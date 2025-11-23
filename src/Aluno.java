public class Aluno extends Pessoa{
    private double peso;
    private double imc;
    private Categoria exp;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setExp(Categoria exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "\n===== DADOS DO ALUNO =====\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: " + idade + " anos\n" +
                "Peso: " + peso + " kg\n" +
                "IMC: " + String.format("%.2f", imc) + "\n" +
                "Experiência: " + exp + "\n" +
                "===========================\n";
    }
}
