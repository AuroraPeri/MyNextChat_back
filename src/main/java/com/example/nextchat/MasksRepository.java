package com.example.nextchat;

import org.springframework.data.repository.CrudRepository;

import com.example.nextchat.Masks;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MasksRepository extends CrudRepository<Masks, Integer> {

}