package com.exemplo.capgemini;

import javax.swing.JOptionPane;

public class AlunosMedia {

	public static void main(String[] args) {
		
		//Vetor dos alunos
		String[] alunos = {"João", "Paulo", "Maria"};
		
		//Matriz das notas
		float [][] notas = new float[3][4];
		
		//faz a soma das notas
		float somaNotas, mediaAlunos;
		
		//Armazena o status do aluno
		String StatusAluno;
		
		//Laço externo para associar o aluno a nota
		for(int i = 0; i < 3; i++) {
			System.out.println("\n***************** BOLETIM ********************");
			//System.out.println("Aluno: "+ alunos[i]);
			
			//Laço interno para informar a nota de cada aluno
			somaNotas = 0;
			mediaAlunos = 0;
		for(int j = 0; j < 4; j++) {
			notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog
				("Informe a nota nº "+ (j+1)+ "do aluno"+ alunos[i]));
					somaNotas = somaNotas + notas[i][j];
		}
		mediaAlunos = somaNotas / 4;
			if(mediaAlunos < 5.5 ) {
				StatusAluno = "REPROVADO";
			}else if (mediaAlunos >= 5.5 && mediaAlunos <= 7) {
				StatusAluno = "RECUPERAÇÃO";
			}else {
				StatusAluno = "APROVADO";
			}
			
			//Impressão do boletim
			
			System.out.println("Aluno: "+ alunos[i]);
			System.out.println("Notas");
			for(int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - "+ notas[i][j1]);
			}
			System.out.println("Média... : "+ mediaAlunos + " - "+ StatusAluno);
		}
		

	}

}
