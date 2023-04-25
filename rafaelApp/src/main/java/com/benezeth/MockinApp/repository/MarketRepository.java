package com.benezeth.MockinApp.repository;

import com.benezeth.MockinApp.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("ALL")
public interface MarketRepository extends JpaRepository <Market,Long>{
}
