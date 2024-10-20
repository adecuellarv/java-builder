package gm.builder.infraestructure.components;

import gm.builder.domain.entities.components;
import gm.builder.domain.interfaces.ComponentsRepository;
import gm.builder.infraestructure.categories.ICategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponenstService implements IComponentsService {

    @Autowired
    private ComponentsRepository componentsRepository;

    @Override
    public List<components> getComponentsByCategory(Integer Id) { return componentsRepository.findAComponentsByIdCat(Id); }
}
