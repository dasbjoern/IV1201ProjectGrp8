package com.projectgroup8.iv1201.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgroup8.iv1201.repository.*;
import com.projectgroup8.iv1201.model.*;

/**
 * The service that accesses the repositories of the Recruitment Database
 */
@Service
public class RecruitmentService {
    
    @Autowired
    private AvailabilityRepository availabilityRepository;
    @Autowired
    private CompetenceProfileRepository competenceProfileRepository;
    @Autowired
    private CompetenceRepository competenceRepository;
    @Autowired
    private PersonRepository personRepository;
    // @Autowired
    // private RoleRepository roleRepository;

    /**
     * Gets a person by username
     * @param username The username
     * @return A <code>Person</code> with the username. <ode>null</code> if no person was found
     */
    public Person getPerson(String username){
        return personRepository.findByUsername(username);
    }
}