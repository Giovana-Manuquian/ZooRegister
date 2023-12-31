package br.senai.sp.jandira.model;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);

        Mamiferos refListMamiferos = new Mamiferos();
        Aves refListAves = new Aves();
        Repteis refListRepteis = new Repteis();

        Mamiferos refAlojamentoMamiferos = new Mamiferos();
        Aves refAlojamentoAves = new Aves();
        Repteis refAlojamentoRepteis = new Repteis();

        boolean continuar = true;

        while(continuar){
            System.out.println("*********************************************");
            System.out.println("|          Seja Bem-Vindo(a) ao Zoo         |");
            System.out.println("*********************************************");
            System.out.println("Informe a opção que deseja seguir: \n" +
                    "1 - Registrar Animais\n" +
                    "2 - Listar Animais\n" +
                    "3 - Adicionar Alojamento\n" +
                    "4 - Datas Cadastradas\n" +
                    "5 - Sair"
            );
            System.out.print("Opção: ");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser){
                case 1:
                    System.out.println("1 - Registrar Mamífero\n" +
                            "2 - Registrar Aves\n" +
                            "3 - Registrar Répteis\n" +
                            "4 - Voltar para o menu principal"
                    );
                    System.out.print("Opção: ");

                    int optionRegistrarAnimal = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionRegistrarAnimal){
                        case 1:
                            Mamiferos mamiferos = new Mamiferos();
                            mamiferos.registrarMamiferos();
                            refListMamiferos.adicionarMamiferos(mamiferos);

                            // Após registrar, verifique a visita ao veterinário
                            mamiferos.verificarVisitaVeterinaria();
                            break;
                        case 2:
                            Aves aves = new Aves();
                            aves.registrarAves();
                            refListAves.adicionarAves(aves);

                            // Após registrar, verifique a visita ao veterinário
                            aves.verificarVisitaVeterinaria();
                            break;
                        case 3:
                            Repteis repteis = new Repteis();
                            repteis.registrarMamifero();
                            refListRepteis.adicionarRepteis(repteis);

                            // Após registrar, verifique a visita ao veterinário
                            repteis.verificarVisitaVeterinaria();
                            break;
                        case 4:
                            // Voltar para o menu principal
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - Listar Mamífero\n" +
                            "2 - Listar Aves\n" +
                            "3 - Listar Répteis\n" +
                            "4 - Voltar para o menu principal"
                    );
                    System.out.print("Opção: ");

                    int optionListarAnimal = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionListarAnimal){
                        case 1:
                            refListMamiferos.listarMamiferos();
                            break;
                        case 2:
                            refListAves.listarAves();
                            break;
                        case 3:
                            refListRepteis.listarRepteis();
                            break;
                        case 4:
                            // Voltar para o menu principal
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 - Adicionar ao Alojamento Mamífero\n" +
                            "2 - Adicionar ao Alojamento Aves\n" +
                            "3 - Adicionar ao Alojamento Répteis\n" +
                            "4 - Voltar para o menu principal"
                    );
                    System.out.print("Opção: ");

                    int optionAddAlojamentoAnimal = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionAddAlojamentoAnimal){
                        case 1:
                            Mamiferos mamiferos = new Mamiferos();
                            refAlojamentoMamiferos.adicionarMamiferos(mamiferos);
                            System.out.println("Adicionado(a) com sucesso!");
                            break;
                        case 2:
                            Aves aves = new Aves();
                            refAlojamentoAves.adicionarAves(aves);
                            System.out.println("Adicionado(a) com sucesso!");
                            break;
                        case 3:
                            Repteis repteis = new Repteis();
                            refAlojamentoRepteis.adicionarRepteis(repteis);
                            System.out.println("Adicionado(a) com sucesso!");
                            break;
                        case 4:
                            // Voltar para o menu principal
                            break;
                    }
                    break;

                case 4:
                    for (Mamiferos mamiferos : refListMamiferos.listMamiferos) {
                        mamiferos.data(mamiferos, null, null);
                    }
                    for (Aves aves : refListAves.listAves) {
                        aves.data(null, aves, null);
                    }
                    for (Repteis repteis : refListRepteis.listRepteis) {
                        repteis.data(null, null, repteis);
                    }
                    break;

                case 5:
                    continuar = false;
                    break;
            }
        }
    }
}
