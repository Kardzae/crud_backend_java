package com.epico.crud.repository;

import com.epico.crud.domain.Autor;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Autor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {}
