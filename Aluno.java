package Atividade2;

import java.util.ArrayList;

public class Aluno extends Pessoa{

	private double notas;
	private Curso curso;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();

	  public double getNotas() {
	      return notas;
	  }

	  public void setNotas(double notas) {
	        this.notas = notas;
	  }

	  public void setCurso(Curso curso){
	    	this.curso = curso;
	  }
	  
	  public Curso getCurso(){
		  return curso;
	  }
	  
	  public void addDisciplinas(Disciplina disciplina) {
		  disciplinas.add(disciplina);
	  }
	  
	  public ArrayList<Disciplina> getDisciplinas(){
		  return disciplinas;
	  }
	  
	  public void imprimir() {
		  System.out.println("\nAluno");
		  System.out.println("Nome: " + getNome());
		  System.out.println("CPF: " + getCpf());
		  System.out.println("Email: " + getEmail());
		  System.out.println("Notas: " + getNotas());
		  System.out.println("Curso - ");
		  System.out.println(" Nome: " + getCurso().getNome());
		  System.out.println("Disciplinas - ");
		  for(int i = 0; i < disciplinas.size(); i++) {
				 System.out.println(" Disciplina: " + getDisciplinas().get(i).getNome());
				 System.out.println(" Horário: " + getDisciplinas().get(i).getHorario());
			 }
	  }
	
}
