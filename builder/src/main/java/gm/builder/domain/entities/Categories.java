package gm.builder.domain.entities;

public class Categories {
    private int categoryId;
    private String categoryNameEsp;
    private String categoryNameEn;

    public Categories(int categoryId, String categoryNameEsp, String categoryNameEn){
        this.categoryId = categoryId;
        this.categoryNameEn = categoryNameEn;
        this.categoryNameEsp = categoryNameEsp;
    }
}
