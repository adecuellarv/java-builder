package gm.builder.web;

import gm.builder.domain.entities.components;
import gm.builder.infraestructure.components.IComponentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(value = "http://localhost:3000")
public class ComponentsController {
    private static final Logger logger = LoggerFactory.getLogger(ComponentsController.class);

    @Autowired
    private IComponentsService iComponentsService;

    @GetMapping("/components/{id}")
    public List<components> obtenerComponents(@PathVariable Integer id){
        var components = iComponentsService.getComponentsByCategory(id);
        components.forEach((component -> logger.info(component.toString())));
        return components;
    }
}
