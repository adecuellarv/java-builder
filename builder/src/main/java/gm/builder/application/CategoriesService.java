package gm.builder.application;

import gm.builder.infraestructure.ICategoriesService;

public class CategoriesService {
    private final ICategoriesService iCategoriesRepository;

    public CategoriesService(ICategoriesService iCategoriesRepository) {
        this.iCategoriesRepository = iCategoriesRepository;
    }
}
