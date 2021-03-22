package by.rstq.test.service;

import by.rstq.test.enity.PersonalPolicy;
import by.rstq.test.enity.dto.PersonalPolicyDTO;

import java.util.List;

public interface PolicyService {

    public List<PersonalPolicy> getAllPolicies();

    public void createPolicy(PersonalPolicyDTO personalPolicyDTO);
}
