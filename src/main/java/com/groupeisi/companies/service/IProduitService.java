package com.groupeisi.companies.service;

import java.util.List;
import java.util.Optional;

import com.groupeisi.companies.dto.AccountUserDto;

public interface IProduitService {
	Optional<AccountUserDto> login(String email, String password);

	Optional<List<AccountUserDto>> findAll();
	boolean save(AccountUserDto accountUserDto);
}
