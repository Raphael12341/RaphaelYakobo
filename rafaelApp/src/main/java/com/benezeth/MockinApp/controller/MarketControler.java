package com.benezeth.MockinApp.controller;

import com.benezeth.MockinApp.entity.Market;
import com.benezeth.MockinApp.exception.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markets")
@SuppressWarnings("ALL")
public class MarketControler {
    private MarketService marketService;

    @Autowired
    public MarketControler(MarketService marketService){
        this.marketService=marketService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Market>getMarketById(@PathVariable Long id){
        Market market=marketService.getMarketById(id);
        return market==null ? ResponseEntity.notFound().build() : ResponseEntity.ok(market);
    }
    @GetMapping
    public ResponseEntity<List<Market>>getAllMarkets(){
        List<Market>markets=marketService.getAllMarkets();
        return markets.isEmpty()?ResponseEntity.noContent().build() : ResponseEntity.ok(markets);

    }
    @PostMapping
    public ResponseEntity<Market>saveMarket(@RequestBody Market market){
        Market savedMarket =marketService.saveMarket(market);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMarket);
    }
    @DeleteMapping
    public ResponseEntity<Void>deleteMarket(@PathVariable Long id){
        marketService.deletemarket(id);
        return ResponseEntity.noContent().build();
    }
}
