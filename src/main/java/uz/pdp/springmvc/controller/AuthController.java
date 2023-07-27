package uz.pdp.springmvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uz.pdp.springmvc.model.User;
import uz.pdp.springmvc.service.UserService;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

//    @Autowired
//    public AuthController(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(value = "/auth/sign-up")
    public String signUpPage() {
        return "auth/sign-up";
    }
    @RequestMapping(value = "/auth/sign-up", method = RequestMethod.POST)
    public String signUp(@ModelAttribute User user) {
        userService.signUp(user);
        return "index";
    }

    @RequestMapping(value = "/auth/sign-in")
    public String signInPage() {
        return "auth/sign-in";
    }

    @RequestMapping(value = "/auth/sign-in", method = RequestMethod.POST)
    public String signIn(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        System.out.println(username);
        System.out.println(password);
        User user = userService.signIn(username, password);
        if(user == null) {
            return "index";
        }
        model.addAttribute("user", user);
        return "menu";
    }
}
