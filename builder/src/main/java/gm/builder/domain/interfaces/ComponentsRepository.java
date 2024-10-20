package gm.builder.domain.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import gm.builder.domain.entities.components;

import java.util.List;

public interface ComponentsRepository extends JpaRepository<components, Integer> {
    @Query("SELECT c FROM components c WHERE c.CategoryID = :id")
    List<components> findAComponentsByIdCat(@Param("id") Integer id);
}
