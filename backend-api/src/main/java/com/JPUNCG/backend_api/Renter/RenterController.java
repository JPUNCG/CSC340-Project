package com.JPUNCG.backend_api.Renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renters")
public class RenterController {

    @Autowired
    private RenterService renterService;

    @GetMapping
    public List<Renter> getAllRenters() {
        return renterService.getAllRenters();
    }

    @PostMapping
    public Renter createRenter(@RequestBody Renter renter) {
        return renterService.createRenter(renter);
    }

    @PostMapping("/login")
    public Object login(@RequestBody Renter renter) {
        Renter found = renterService.getRenterByUsernameAndPassword(renter.getUsername(), renter.getPassword());
        if (found != null) {
            return found;
        } else {
            return "Login failed";
        }
    }

    @DeleteMapping("/{id}")
    public List<Renter> deleteRenter(@PathVariable Long id) {
        renterService.deleteRenter(id);
        return renterService.getAllRenters();
    }
}
