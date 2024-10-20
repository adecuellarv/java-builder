package gm.builder.infraestructure.components;
import gm.builder.domain.entities.components;
import java.util.List;

public interface IComponentsService {
    public List<components> getComponentsByCategory(Integer Id);
}
