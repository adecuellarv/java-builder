package gm.builder.infraestructure;
import gm.builder.domain.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesReposity extends JpaRepository<Categories, Integer> {
}
