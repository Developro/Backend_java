package ru.clucky.Backend_java.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.clucky.Backend_java.Auth;

@RestController
@RequestMapping("/api/auth")
public class AuthRestController {

    @PostMapping
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Auth login(@RequestParam String log, @RequestParam String pass){


        return new Auth(log, pass);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Auth logout(){
        return new Auth("testLogout", "testLOGOUT");
    }

    @RequestMapping(value = "/refresh", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Auth refresh(){
        return new Auth("testRefresh", "testREFRESH");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Auth register(){
        return new Auth("testRegister", "testREGISTER");
    }
}
