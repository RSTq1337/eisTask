package by.rstq.test.service;

import by.rstq.test.enity.PersonalPolicy;
import by.rstq.test.enity.mapper.MainMapper;
import by.rstq.test.enity.dto.PersonalPolicyDTO;
import by.rstq.test.exception.IncorrectDataException;
import by.rstq.test.repo.PolicyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    private final PolicyRepo repository;

    public PolicyServiceImpl(PolicyRepo repository) {
        this.repository = repository;
    }

    public List<PersonalPolicy> getAllPolicies(){
        return repository.findAll();
    }

    public void createPolicy(PersonalPolicyDTO personalPolicyDTO){
        if (!(personalPolicyDTO.getFinish().after(personalPolicyDTO.getStart()))){
            throw new IncorrectDataException("The start date cannot be after the end date");
        } else if (!(personalPolicyDTO.getCoverageOptions().size() >1)) {
            throw new IncorrectDataException(("Should be at least two coverages options"));
        } else
            repository.save(MainMapper.INSTANCE.fromPersonalPolicyDTOToPersonalPolicy(personalPolicyDTO));
    }
}

