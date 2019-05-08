package com.swing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SwingMainController {
    @GetMapping(value = "test")
    public Map test(){
        Map map = new HashMap();
        map.put("name","troy");
        return map;
    }
}
