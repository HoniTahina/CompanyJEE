package com.groupeisi.companies.dao;

import java.util.List;

import com.groupeisi.companies.entities.AccountUserEntity;

public class AccountUserDao extends RepositoryImpl<AccountUserEntity> implements IAccountUserDao {

	@Override
	public AccountUserEntity login(String email, String password) {
		return new AccountUserEntity(1L, "a@gmail.com", "passer", true);
	}

	public List<AccountUserEntity> findAll() {

		return List.of(new AccountUserEntity(1L, "a@gmail.com", "passer", true),
				new AccountUserEntity(2L, "bgmail.com", "passer", false),
				new AccountUserEntity(3L, "ct@gmail.com", "passer", true),
				new AccountUserEntity(4L, "dt@gmail.com", "passer", false));
	}

}
