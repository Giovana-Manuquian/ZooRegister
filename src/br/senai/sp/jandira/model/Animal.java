package br.senai.sp.jandira.model;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Animal {
    Scanner scanner = new Scanner(System.in);
    String nome, sexo, historicoMedico, medicacoesPrescritas;
    int idade, id;
    LocalDate dataRevisao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getMedicacoesPrescritas() {
        return medicacoesPrescritas;
    }

    public void setMedicacoesPrescritas(String medicacoesPrescritas) {
        this.medicacoesPrescritas = medicacoesPrescritas;
    }

    public LocalDate getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(LocalDate dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public void verificarVisitaVeterinaria() {
        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataUltimaVisita = getDataRevisao().atStartOfDay();

        // Calcula a diferença em anos
        long anosDesdeUltimaVisita = ChronoUnit.YEARS.between(dataUltimaVisita, dataAtual);

        // Verifica se passou exatamente 1 ano desde a última visita
        if (anosDesdeUltimaVisita >= 1) {
            JOptionPane.showMessageDialog(null, "Hora de passar no Veterinário: " + getNome(), "VisitaVeterinário!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void data(Mamiferos mamiferos, Aves aves, Repteis repteis) {
        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime dataUltimaVisita = null;

        if (mamiferos != null) {
            dataUltimaVisita = mamiferos.getDataRevisao().atStartOfDay();
        } else if (aves != null) {
            dataUltimaVisita = aves.getDataRevisao().atStartOfDay();
        } else if (repteis != null) {
            dataUltimaVisita = repteis.getDataRevisao().atStartOfDay();
        }

        if (dataUltimaVisita != null) {
            // Calcula a diferença em anos
            long anosDesdeUltimaVisita = ChronoUnit.YEARS.between(dataUltimaVisita, dataAtual);

            if (anosDesdeUltimaVisita >= 1) {
                System.out.println("Hora de passar no veterinário");
            } else {
                System.out.println("Está tudo certo");
            }
        }
    }
}


