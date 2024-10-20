package gm.builder.infraestructure.categories;

import gm.builder.domain.entities.categories;
import gm.builder.domain.interfaces.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriesService implements ICategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<categories> getCategories() { return categoriesRepository.findAll(); }
}
