package br.ufpb.dscaula.lab2.dtos;

import br.ufpb.dscaula.lab2.entidades.Disciplina;
import lombok.Data;

@Data
public class DisciplinaNotasDTO {
    private Long id;
    private String nome;
    private double nota;

    public DisciplinaNotasDTO(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
        this.nota = disciplina.getNota();
    }
}