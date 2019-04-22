package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("RODRIGO", 12345));
        alunos.add(new Aluno("JOAO", 54321));
        alunos.add(new Aluno("MARIANO", 67890));

        Aluno felipe = new Aluno("FELIPE", 12347);

        System.out.println("O Aluno " + felipe.getNome() + " está na lista de alunos?" + alunos.contains(felipe));

    }




}
