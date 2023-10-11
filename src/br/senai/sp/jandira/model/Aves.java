package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aves extends Animal {
    Scanner scanner = new Scanner(System.in);
    List<Aves> listAves = new ArrayList<>();

    public void registrarAves(){
        System.out.println("****************************");
        System.out.println("       Registro de Aves     ");
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

    public void adicionarAves(Aves aves){
        listAves.add(aves);
    }

    public void listarAves(){
        for (Aves aves : listAves){
            System.out.println("____________________________________");
            System.out.println("Nome: " + aves.getNome());
            System.out.println("Idade: " + aves.getIdade());
            System.out.println("Sexo: " + aves.getSexo());
            System.out.println("ID: " + aves.getId());
            System.out.println("Histórico Médico: " + aves.getHistoricoMedico());
            System.out.println("Data Revisão Médica: " + aves.getDataRevisao());
            System.out.println("Medicações Prescritas: " + aves.getMedicacoesPrescritas());
        }
    }
}
