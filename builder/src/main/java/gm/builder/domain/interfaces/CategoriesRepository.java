package gm.builder.domain.interfaces;

import gm.builder.domain.entities.categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<categories, Integer> {
}
