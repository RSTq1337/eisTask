package by.rstq.test.enity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CoverageOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Option option;
}
