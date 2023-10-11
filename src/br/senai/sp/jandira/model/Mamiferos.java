package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamiferos extends Animal {
   Scanner scanner = new Scanner(System.in);
   List<Mamiferos> listMamiferos = new ArrayList<>();

//   public Mamiferos(){
//       String tipo = "mamifero";
//       super
//   }

   public void registrarMamiferos(){
       System.out.println("****************************");
       System.out.println("    Registro de Mamiferos   ");
       System.out.println("****************************");
       System.out.print("Informe o nome do animal: ");
       super.setNome(scanner.nextLine());
       System.out.print("Informe a idade do animal: ");
       super.setIdade(scanner.nextInt());
       scanner.nextLine();
       System.out.print("Informe o sexo do animal: ");
       super.setSexo(scanner.nextLine());
       System.out.print("Informe o ID do animal: ");
       super.setId(scanner.nextInt());
       scanner.nextLine();
       System.out.print("Informe o histórico médico: ");
       super.setHistoricoMedico(scanner.nextLine());
       System.out.print("Informe a data da última revisão veterinária (no formato dd-mm-aaaa): ");
       String dataRevisaoStr = scanner.nextLine();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //analisar a data no formato "dd-MM-aaaa".
       LocalDate dataRevisao = LocalDate.parse(dataRevisaoStr, formatter); //método LocalDate.parse para converter essa string em um objeto LocalDate.
       super.setDataRevisao(dataRevisao);
       System.out.print("Informe as medicações prescritas: ");
       super.setMedicacoesPrescritas(scanner.nextLine());
   }

   public void adicionarMamiferos(Mamiferos mamiferos){
       listMamiferos.add(mamiferos);
   }

   public void listarMamiferos(){
       for (Mamiferos mamiferos : listMamiferos){
           System.out.println("____________________________________");
           System.out.println("Nome: " + mamiferos.getNome());
           System.out.println("Idade: " + mamiferos.getIdade());
           System.out.println("Sexo: " + mamiferos.getSexo());
           System.out.println("ID: " + mamiferos.getId());
           System.out.println("Histórico Médico: " + mamiferos.getHistoricoMedico());
           System.out.println("Data Revisão Médica: " + mamiferos.getDataRevisao());
           System.out.println("Medicações Prescritas: " + mamiferos.getMedicacoesPrescritas());
       }
   }
}
