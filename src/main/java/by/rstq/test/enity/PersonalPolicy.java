package by.rstq.test.enity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String owner;

    @NotBlank
    private String object;

    private Date start;

    private Date finish;

    @OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="coverage_option_id")
    private Set<CoverageOption> coverageOptions;

}
