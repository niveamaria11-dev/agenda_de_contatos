package br.edu.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Persistencia {
	public static void salvarContatos(List<Contato> contatos) {
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("contatos.txt"));
			
			for (Contato contato : contatos) {

	            String linha = contato.getNome() + ";" + contato.getCelular() + ";" + contato.getEmail();
	            pw.println(linha);
	        }
			pw.close();

	        System.out.println("Contatos salvos com sucesso!");
	        
		} catch (IOException e) {
			
			System.out.println("Erro ao salvar os contatos!");
	        System.out.println("Motivo: " + e.getMessage());
	        System.out.print("Strack Trace: ");
	        e.printStackTrace();
		}
	}
	
	public static void carregarContatos(List<Contato> contatos) {
		
		File file = new File("contatos.txt");

	    if (!file.exists()) return;

		try {
		    BufferedReader br = new BufferedReader(new FileReader(file));
		    String linha = br.readLine();

	        while (linha != null) {
	        	
	        	String[] dados = linha.split(";");
	        	
	        	if (dados.length == 3) {
	        		
	        		Contato contato = new Contato(dados[0], dados[1], dados[2]);
	                contatos.add(contato);
	            }
	        	else {
	                System.out.println("Registro inválido ignorado: " + linha);
	            }
	            linha = br.readLine();
	        }
	        br.close();
		} catch (IOException e) {
		    System.out.println("Erro ao carregar os contatos!");
		    System.out.println("Motivo: " + e.getMessage());
		    System.out.print("Strack Trace: ");
	        e.printStackTrace();
		} 
	}
}
