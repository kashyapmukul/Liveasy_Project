package com.liveasy_project.Liveasy.Service;

import com.liveasy_project.Liveasy.Entity.Loads;
import com.liveasy_project.Liveasy.Repository.LoadsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class LoadsService {

    @Autowired
    public LoadsRepo loadsRepo;

    public Loads addData(Loads loads) {
        return loadsRepo.save(loads);
    }

    public List<Loads> listAll() { return (List<Loads>) loadsRepo.findAll();
    }

    public Optional<Loads> findById(int loadId) { return loadsRepo.findById(loadId);
    }

    public void deleteById(int loadId) { loadsRepo.deleteById(loadId);
    }

    public void updata(Loads loads) { loadsRepo.save(loads);
    }

    public List<Loads> grtByShipperId(String id){
        return loadsRepo.findAllByshipperId(id);
    }
}
