package com.groupeisi.companies.dao;

import java.util.List;
import java.util.Optional;

import com.groupeisi.companies.entities.AccountUserEntity;
import com.groupeisi.companies.entities.ProduitEntity;

public interface IProduitDao extends Repository<ProduitEntity>{

	Optional<ProduitEntity> login(String email, String password);
}
