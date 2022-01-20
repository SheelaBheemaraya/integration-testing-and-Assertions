package com.thbs.bt.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thbs.bt.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
