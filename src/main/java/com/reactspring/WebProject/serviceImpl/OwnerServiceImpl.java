package com.reactspring.WebProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactspring.WebProject.entity.Owner;
import com.reactspring.WebProject.repository.OwnerRepository;
import com.reactspring.WebProject.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	OwnerRepository ownerRepo;
	
	@Override
	public List<Owner> findAllOwners() {
		// TODO Auto-generated method stub
		return ownerRepo.findAll();
	}

	@Override
	public Owner create(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepo.saveAndFlush(owner);
	}

}
