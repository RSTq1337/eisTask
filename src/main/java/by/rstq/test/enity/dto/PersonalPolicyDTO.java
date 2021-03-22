package by.rstq.test.enity.dto;

import by.rstq.test.enity.CoverageOption;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalPolicyDTO {

    private Long id;
    private String owner;
    private String object;
    private Date start;
    private Date finish;
    private Set<CoverageOption> coverageOptions;
}
