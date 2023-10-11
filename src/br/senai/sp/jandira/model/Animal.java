package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;
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

    public void setDataUltimaRevisao(LocalDate data) {
        this.dataRevisao = data;
    }
    public Period tempoDesdeUltimaVisita() {
        LocalDate dataAtual = LocalDate.now();
        if (dataRevisao != null) {
            return Period.between(dataRevisao, dataAtual);
        } else {
            return null;
        }
    }
}


