package br.com.digitalhouse;

public class Aluno {

    public String nome;
    public int numeroDeAluno;

    public Aluno(String nome, int numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(int numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object novoAluno) {

        if (!(novoAluno instanceof Aluno)) {
            return false;
        }

        //((Aluno) novoAluno).getNumeroDeAluno();
        return this.numeroDeAluno == (((Aluno) novoAluno).getNumeroDeAluno());




    }
}
