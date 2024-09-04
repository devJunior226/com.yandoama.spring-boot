package com.yandoama.ramde.controller;

import com.yandoama.ramde.dto.YtCategoryDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Slf4j
@RestController
public class YtCategoryController {

    /**
     * Enregistrement d'une categorie
     * @param category dto
     * @return une categorie avec id
     */
    @PostMapping("/categories")
    public ResponseEntity<YtCategoryDto> postCategory(
            @RequestBody @Valid YtCategoryDto category) {
        log.info("Saving a category of id {} : {}", category.getId(), category.getNom().toUpperCase());
        Long nouveauId = new Random().nextLong();
        String nouveauNom = new Random().toString();
        String nom = "RAMDE";
        category.setId(nouveauId);
        category.setNom(nom);

        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    /**
     * Editing a category
     * @param categoryId => for category id
     * @param category => contains the category informations we want to edit
     * @return a category with its id
     */
    @PutMapping("/categories/{id}")
    public ResponseEntity<YtCategoryDto> putCategory(
            @PathVariable("id") Long categoryId,
            @RequestBody @Valid YtCategoryDto category) {
        log.info("Updating category of id {}", categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    /**
     * Deleting a category
     * @param categoryId => id of the category
     * @return just the deleted category with its id
     */
    @DeleteMapping("/categories/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable("id") Long categoryId) {
        log.warn("Deleting category of id {}", categoryId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
























