package com.groupeisi.companies.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.groupeisi.companies.entities.ProduitEntity;
public class ProduitDao extends RepositoryImpl<ProduitEntity> implements IProduitDao {

	@Override
	public Optional<ProduitEntity> login(String email, String password) {
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<ProduitEntity> cr = cb.createQuery(ProduitEntity.class);
		Root<ProduitEntity> user = cr.from(ProduitEntity.class);
		// Predicate pour la clause where
		Predicate predicateEmail = cb.equal(user.get("email"), email);
		Predicate predicatePwd = cb.equal(user.get("password"), password);
		Predicate finalPredicate = cb.and(predicateEmail, predicatePwd);

		cr.select(user);
		cr.where(finalPredicate);

		return Optional.ofNullable(session.createQuery(cr).getSingleResult());
	}

}
