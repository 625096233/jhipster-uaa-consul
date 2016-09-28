package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Bar;
import com.mycompany.myapp.repository.BarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Bar.
 */
@Service
@Transactional
public class BarService {

    private final Logger log = LoggerFactory.getLogger(BarService.class);
    
    @Inject
    private BarRepository barRepository;

    /**
     * Save a bar.
     *
     * @param bar the entity to save
     * @return the persisted entity
     */
    public Bar save(Bar bar) {
        log.debug("Request to save Bar : {}", bar);
        Bar result = barRepository.save(bar);
        return result;
    }

    /**
     *  Get all the bars.
     *  
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public List<Bar> findAll() {
        log.debug("Request to get all Bars");
        List<Bar> result = barRepository.findAll();

        return result;
    }

    /**
     *  Get one bar by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public Bar findOne(Long id) {
        log.debug("Request to get Bar : {}", id);
        Bar bar = barRepository.findOne(id);
        return bar;
    }

    /**
     *  Delete the  bar by id.
     *
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Bar : {}", id);
        barRepository.delete(id);
    }
}
