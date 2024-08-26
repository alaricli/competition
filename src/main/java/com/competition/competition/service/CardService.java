package com.competition.competition.service;

import com.competition.competition.entity.Card;
import com.competition.competition.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    // GET
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElse(null);
    }

    // POST
    public Card addCard(Card Card) {
        return cardRepository.save(Card);
    }

    // PUT
    public Card updateCard(Card Card) {
        return cardRepository.save(Card);
    }

    // DELETE
    public ResponseEntity<Void> deleteCardById(Long id) {
        cardRepository.deleteById(id);
        return null;
    }
}
