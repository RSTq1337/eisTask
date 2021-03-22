package by.rstq.test.enity.mapper;

import by.rstq.test.enity.CoverageOption;
import by.rstq.test.enity.PersonalPolicy;
import by.rstq.test.enity.dto.CoverageOptionDTO;
import by.rstq.test.enity.dto.PersonalPolicyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MainMapper {

    MainMapper INSTANCE = Mappers.getMapper(MainMapper.class);

    PersonalPolicyDTO fromPersonalPolicyToPersonalPolicyDTO(PersonalPolicy personalPolicy);

    PersonalPolicy fromPersonalPolicyDTOToPersonalPolicy(PersonalPolicyDTO personalPolicyDTO);

    CoverageOptionDTO fromCoverageOptionToCoverageOptionDTO(CoverageOption coverageOption);

    @Mappings({
            @Mapping(source = "coverageOptionDTO.option", target = "option")
    })
    CoverageOption fromCoverageOptionDTOToCoverageOption(CoverageOptionDTO coverageOptionDTO);

}
