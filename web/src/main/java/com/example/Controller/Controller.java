package com.example.Controller;

import com.example.GService.ChaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    ChaService service;

    @RequestMapping("lll")
    @ResponseBody
    private int lll(){
        return service.cha();
    }
}
