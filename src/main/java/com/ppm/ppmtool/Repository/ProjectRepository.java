package com.ppm.ppmtool.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ppm.ppmtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	Project  findByProjectIdentifier(String projectIdentifier);
	
}
