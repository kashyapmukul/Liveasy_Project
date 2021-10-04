package com.liveasy_project.Liveasy.Controller;

import com.liveasy_project.Liveasy.Entity.Loads;
import com.liveasy_project.Liveasy.Service.LoadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LoadsController {

    @Autowired
    public LoadsService loadsService;

    @PostMapping("/addLoadData")
    public String addData(@RequestBody  Loads loads){
        loadsService.addData(loads);
        return "loads details added successfully ";
    }

    @GetMapping("/getdata")
    public List<Loads> list(){
        return loadsService.listAll();
    }
    @GetMapping("/getLoadID/")
    public Optional<Loads> getId(@RequestParam("shipperId") int loadId){
        return loadsService.findById(loadId);

    }

    @GetMapping("/load")
    public List<Loads> getByShipperId(@RequestParam("shipperId") String id){
        return loadsService.grtByShipperId(id);
    }









    @DeleteMapping("/deleteLoadId/{loadId}")
    public String deleleId(@PathVariable int loadId){
        loadsService.deleteById(loadId);
        return "Delete SuccessFully Load id : "+ loadId;
    }

    @PutMapping("/updataLoadId/{loadId}")
    public String putId(@PathVariable int loadId,@RequestBody Loads loads){
        loadsService.updata(loads);
        return "Update SuccessFully data";
    }

}
