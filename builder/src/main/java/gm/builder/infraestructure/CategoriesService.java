package gm.builder.infraestructure;

import gm.builder.domain.entities.Categories;
import gm.builder.domain.interfaces.ICategoriesRepository;

import java.util.List;

public class CategoriesService implements ICategoriesRepository {

    private CategoriesReposity categoriesReposity;

    public List<Categories> getCategories() { return categoriesReposity.findAll(); }
}
