package com.JPUNCG.backend_api;

import com.JPUNCG.backend_api.Renter.Renter;
import com.JPUNCG.backend_api.Provider.Provider;
import com.JPUNCG.backend_api.Renter.RenterService;
import com.JPUNCG.backend_api.Provider.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private RenterService renterService;

    @Autowired
    private ProviderService providerService;

    @GetMapping({"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, @RequestParam String role) {
        if ("renter".equals(role)) {
            Renter renter = renterService.getRenterByUsernameAndPassword(username, password);
            if (renter != null) {
                return "redirect:/renter/home/" + renter.getRenterId();
            }
        } else if ("provider".equals(role)) {
            Provider provider = providerService.getProviderByUsernameAndPassword(username, password);
            if (provider != null) {
                return "redirect:/provider/home/" + provider.getProviderId();
            }
        }
        return "redirect:/login?error";
    }

    @PostMapping("/signup")
    public String signup(Renter renter, Provider provider, @RequestParam String role) {
        if ("renter".equals(role)) {
            renterService.createRenter(renter);
            return "redirect:/login";
        } else if ("provider".equals(role)) {
            providerService.createProvider(provider);
            return "redirect:/login";
        }
        return "redirect:/signup?error";
    }
}