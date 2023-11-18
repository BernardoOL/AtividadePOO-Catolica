package Atividade2;

import java.util.ArrayList;

public class Professor extends Pessoa{

	private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Disciplina disciplina;
    

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void addCursos(Curso curso) {
    	cursos.add(curso);
    }
    
    public ArrayList<Curso> getCursos(){
    	return cursos;
    }
    
    public void setDisciplina(Disciplina disciplina) {
    	this.disciplina = disciplina;
    }
    
    public Disciplina getDisciplina() {
    	return disciplina;
    }
    
    public void imprimir() {
    	System.out.println("\nPROFESSOR");
    	System.out.println("Nome: " + getNome());
    	System.out.println("CPF: " + getCpf());
    	System.out.println("Email: " + getEmail());
    	System.out.println("ENDEREÇO - ");
    	System.out.println(" Cidade: " + getEndereco().getCidade());
    	System.out.println(" Estado: " + getEndereco().getEstado());
    	System.out.println(" Rua: " + getEndereco().getRua());
    	System.out.println("Titulação: " + getTitulacao());
    	System.out.println("Salario: "+ getSalario());
    	System.out.println("Cursos associados - ");
    	for(int i = 0; i < cursos.size(); i++) {
    		System.out.println(" Curso " + (i+1)  + ": " + getCursos().get(i).getNome());
    	}
    	System.out.println("Disciplina - \n" + " " +getDisciplina().getNome());
    }
	
}
