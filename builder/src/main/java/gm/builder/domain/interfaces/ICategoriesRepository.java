package gm.builder.domain.interfaces;
import gm.builder.domain.entities.Categories;

import java.util.List;

public interface ICategoriesRepository {
    List<Categories> getCategories();
}
