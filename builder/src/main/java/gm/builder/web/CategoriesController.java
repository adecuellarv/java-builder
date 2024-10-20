package gm.builder.web;

import gm.builder.domain.entities.categories;
import gm.builder.infraestructure.categories.ICategoriesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(value = "http://localhost:3000")
public class CategoriesController {
    private static final Logger logger = LoggerFactory.getLogger(CategoriesController.class);

    @Autowired
    private ICategoriesService iCategoriesService;

    @GetMapping("/categories")
    public List<categories> obtenerCat(){
        var categories = iCategoriesService.getCategories();
        categories.forEach((category -> logger.info(category.toString())));
        return categories;
    }
}
