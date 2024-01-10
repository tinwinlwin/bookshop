package com.example.bookshop.service;

import com.example.bookshop.dto.CartItem;
import com.example.bookshop.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartBean cartBean;

    public void addToCart(Book book){
        cartBean.addCardItem(toCardItem(book));
    }

    public Integer cartSize(){
        return cartBean.cartSize();
    }
    private CartItem toCardItem(Book book){
        return new CartItem(
                book.getId(),
                book.getIsbn(),
                book.getTitle(),
                book.getPrice(),
                1
                );
    }
}
