package com.benezeth.MockinApp.exception;

import com.benezeth.MockinApp.entity.Market;
import com.benezeth.MockinApp.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("ALL")
public class MarketService {
    private MarketRepository marketRepository;
    @Autowired
    public MarketService(MarketRepository marketRepository){
        this.marketRepository=marketRepository;
    }
    public Market getMarketById(Long id){
        return marketRepository.findById(id).orElse(null);
    }
    public List<Market>getAllMarkets(){
        return marketRepository.findAll();
    }
    public Market saveMarket(Market market){
        return marketRepository.save(market);

    }
    public void deletemarket(Long id){
        marketRepository.deleteById(id);
    }
}
