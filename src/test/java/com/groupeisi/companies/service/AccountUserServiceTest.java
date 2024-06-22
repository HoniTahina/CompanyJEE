package com.groupeisi.companies.service;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.quality.Strictness;

import com.groupeisi.companies.dao.AccountUserDao;
import com.groupeisi.companies.dto.AccountUserDto;
import com.groupeisi.companies.entities.AccountUserEntity;

import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AccountUserServiceTest {
	
	private AccountUserDao accountUserDao;
	@InjectMocks
	private AccountUserService accountUserService;
	
	@BeforeEach
	void init() {
		accountUserDao = mock(AccountUserDao.class);
		accountUserService.setAccountUserDao(accountUserDao);
	}
	
	@Test
	void loginSuccess() {
		AccountUserEntity accountUserEntity = new AccountUserEntity(1L, "a@gmail.com", "passer", true);
		when(accountUserDao.login(anyString(), anyString()))
		.thenReturn(accountUserEntity);
		
		Optional<AccountUserDto> accouUserDto = accountUserService.login("a@gmail.com", "passer");
		Assertions.assertTrue(accouUserDto.isPresent());
	}
	
	@Test
	void loginFailed() {
		Optional<AccountUserDto> accouUserDto = accountUserService.login("", "passer");
		Assertions.assertTrue(accouUserDto.isEmpty());
		
		accouUserDto = accountUserService.login("a@gmail.com", "");
		Assertions.assertTrue(accouUserDto.isEmpty());
		
		when(accountUserDao.login(anyString(), anyString()))
		.thenReturn(null);
		
		accouUserDto = accountUserService.login("a@gmail.com", "passer");
		Assertions.assertTrue(accouUserDto.isEmpty());
		
	}
}
