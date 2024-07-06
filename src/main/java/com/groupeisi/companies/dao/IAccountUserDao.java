package com.groupeisi.companies.dao;

import java.util.List;

import com.groupeisi.companies.entities.AccountUserEntity;

public interface IAccountUserDao extends Repository<AccountUserEntity>{

	AccountUserEntity login(String email, String password);
}
