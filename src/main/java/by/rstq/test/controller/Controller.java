package by.rstq.test.controller;

import by.rstq.test.enity.PersonalPolicy;
import by.rstq.test.enity.mapper.MainMapper;
import by.rstq.test.enity.dto.PersonalPolicyDTO;
import by.rstq.test.service.PolicyService;
import by.rstq.test.service.PolicyServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    final PolicyService service;

    public Controller(PolicyServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonalPolicyDTO> getAll(){
        List<PersonalPolicy> result = service.getAllPolicies();
        List<PersonalPolicyDTO> resultDto = new ArrayList<>();
        for (PersonalPolicy a: result) {
            resultDto.add(MainMapper.INSTANCE.fromPersonalPolicyToPersonalPolicyDTO(a));
        }
        return resultDto;
    }

    @PostMapping
    public void createNew(@RequestBody PersonalPolicyDTO personalPolicyDTO){
            service.createPolicy(personalPolicyDTO);
    }
}
