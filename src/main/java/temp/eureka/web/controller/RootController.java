package temp.eureka.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RootController {

    @GetMapping("/custom-dashboard")
    public RedirectView redirectToEurekaDashboard() {
        return new RedirectView("/eureka");
    }
}
