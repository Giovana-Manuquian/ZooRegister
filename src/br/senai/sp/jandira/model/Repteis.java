package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repteis extends Animal {
    Scanner scanner = new Scanner(System.in);
    List<Repteis> listRepteis = new ArrayList<>();

    public void registrarMamifero(){
        System.out.println("****************************");
        System.out.println("     Registro de Repteis    ");
        System.out.println("****************************");
        System.out.println("Informe o nome do animal: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe a idade do animal: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe o sexo do animal: ");
        super.setSexo(scanner.nextLine());
        System.out.println("Informe o ID do animal: ");
        super.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe o histórico médico: ");
        super.setHistoricoMedico(scanner.nextLine());
        System.out.println("Informe a data da última revisão veterinária (no formato dd-mm-aaaa): ");
        String dataRevisaoStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //analisar a data no formato "dd-MM-aaaa".
        LocalDate dataRevisao = LocalDate.parse(dataRevisaoStr, formatter); //método LocalDate.parse para converter essa string em um objeto LocalDate.
        super.setDataRevisao(dataRevisao);
        System.out.println("Informe as medicações prescritas: ");
        super.setMedicacoesPrescritas(scanner.nextLine());
    }

    public void adicionarRepteis(Repteis repteis){
        listRepteis.add(repteis);
    }

    public void listarRepteis(){
        for (Repteis repteis : listRepteis){
            System.out.println("____________________________________");
            System.out.println("Nome: " + repteis.getNome());
            System.out.println("Idade: " + repteis.getIdade());
            System.out.println("Sexo: " + repteis.getSexo());
            System.out.println("ID: " + repteis.getId());
            System.out.println("Histórico Médico: " + repteis.getHistoricoMedico());
            System.out.println("Data Revisão Médica: " + repteis.getDataRevisao());
            System.out.println("Medicações Prescritas: " + repteis.getMedicacoesPrescritas());
        }
    }
}
