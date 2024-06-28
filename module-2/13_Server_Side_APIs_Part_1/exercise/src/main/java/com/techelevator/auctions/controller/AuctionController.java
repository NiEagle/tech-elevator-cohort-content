package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class AuctionController {

    private AuctionDao auctionDao;

    public AuctionController() {
        this.auctionDao = new MemoryAuctionDao();
    }
    private List<Auction> auctions = new ArrayList<>();

    @RequestMapping(path = "/auctions" , method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required=false) String title_like,@RequestParam(required=false) Double currentBid_lte) {
        if (title_like != null) {
            return auctionDao.getAuctionsByTitle(title_like);
        }
        if (currentBid_lte != null && currentBid_lte < 0) {
            return auctionDao.getAuctionsByMaxBid(currentBid_lte);
        }
        return auctionDao.getAuctions();
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return auctionDao.getAuctionById(id);
    }
        //Auction getAuctionById(int id);
       @RequestMapping(path = "/auctions", method = RequestMethod.POST)

        public Auction createAuction(@RequestBody Auction auction) {
            return auctionDao.createAuction(auction);
        }


}
