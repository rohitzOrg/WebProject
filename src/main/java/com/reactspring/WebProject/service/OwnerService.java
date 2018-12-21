package com.reactspring.WebProject.service;

import java.util.List;

import com.reactspring.WebProject.entity.Owner;

public interface OwnerService {

	public List<Owner> findAllOwners();
	public Owner create(Owner owner);
}
