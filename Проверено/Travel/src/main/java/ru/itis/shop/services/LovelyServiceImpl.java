package ru.itis.shop.services;

import ru.itis.shop.models.Lovely;
import ru.itis.shop.models.GroupPlaces;
import ru.itis.shop.models.User;
import ru.itis.shop.repositories.LovelyRepository;
import ru.itis.shop.repositories.UsersRepositoryJdbcTemplateImpl;

import java.util.List;

public class LovelyServiceImpl implements LovelyService {


    private LovelyRepository basketRepository;
    private UsersRepositoryJdbcTemplateImpl userRepository;

    public LovelyServiceImpl(LovelyRepository basketRepository) {
        this.basketRepository=basketRepository;
    }

    @Override
    public List<GroupPlaces> getProduct(Long basketId) {
        return basketRepository.getPlaces(basketId);
    }

    @Override
    public Lovely createLovely(User user) {
        return basketRepository.createCookieLovely(user);
    }

    @Override
    public List<GroupPlaces> addProductToUserLovely(Lovely basket, Long productId) {
        basketRepository.addProduct(productId, basket.getId());
        return basketRepository.getPlaces(basket.getId());
    }

    @Override
    public Lovely getLovely(User user) {
        return basketRepository.getLovely(user);
    }


}
