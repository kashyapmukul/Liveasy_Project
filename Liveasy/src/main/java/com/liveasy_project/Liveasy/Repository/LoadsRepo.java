package com.liveasy_project.Liveasy.Repository;

import com.liveasy_project.Liveasy.Entity.Loads;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoadsRepo extends CrudRepository<Loads,Integer> {

    List<Loads> findAllByshipperId(@Param("shipperId") String shipperId);

}
