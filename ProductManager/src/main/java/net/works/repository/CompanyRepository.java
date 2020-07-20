package net.works.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.works.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
