package br.ufpb.dscaula.lab2.dtos;

import br.ufpb.dscaula.lab2.entidades.Disciplina;
import lombok.Data;

@Data
public class DisciplinaDTO {
    private Long id;
    private String nome;

    public DisciplinaDTO(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
    }
}