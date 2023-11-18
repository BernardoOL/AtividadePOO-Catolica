package Atividade2;

import java.util.ArrayList;

public class Curso {

	 private String nome;
	 private ArrayList<Professor> professores = new ArrayList<>();
	 private ArrayList<Disciplina> disciplinas = new ArrayList<>();

	 public String getNome() {
		 return nome;
	 }

	 public void setNome(String nome) {
	     this.nome = nome;
	 }
	 
	 public ArrayList<Professor> getProfessores(){
		 return professores;
	 }
	 
	 public void addProfessores(Professor professor) {
		 professores.add(professor);
	 }
	 
	 public void addDisciplinas(Disciplina disciplina) {
		  disciplinas.add(disciplina);
	  }
	  
	  public ArrayList<Disciplina> getDisciplinas(){
		  return disciplinas;
	  }
	 
	 public void imprimir() {
		 System.out.println("\nCURSO");
		 System.out.println("Nome: " + getNome());
		 System.out.println("Professores associados: ");
		 for(int i = 0; i < professores.size(); i++) {
			 System.out.println(" " + getProfessores().get(i).getNome());
		 }
		 System.out.println("Disciplinas associadas: ");
		 for(int i = 0; i < disciplinas.size(); i++) {
			 System.out.println(" Disciplina: " + getDisciplinas().get(i).getNome());
			 System.out.println(" Horário: " + getDisciplinas().get(i).getHorario() + "\n");
		 }
	 }
	
}
