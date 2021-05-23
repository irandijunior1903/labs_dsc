package br.ufpb.dscaula.lab2.daos;

import br.ufpb.dscaula.lab2.entidades.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComentarioDAO extends JpaRepository<Comentario, Long> {

}
