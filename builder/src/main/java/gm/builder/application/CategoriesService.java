package gm.builder.application;

import gm.builder.domain.interfaces.ICategoriesRepository;

public class CategoriesService {
    private final ICategoriesRepository iCategoriesRepository;

    public CategoriesService(ICategoriesRepository iCategoriesRepository) {
        this.iCategoriesRepository = iCategoriesRepository;
    }
}
