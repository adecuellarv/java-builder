package gm.builder.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class components {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ComponentID")
    Integer ComponentID;
    @Column(name = "ComponentNameEsp")
    String ComponentNameEsp;
    @Column(name = "ComponentNameEn")
    String ComponentNameEn;
    @Column(name = "ComponentImage")
    String ComponentImage;
    @Column(name = "FrameworkID")
    Integer FrameworkID;
    @Column(name = "CategoryID")
    Integer CategoryID;
}
