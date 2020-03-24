package ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DelayController {

    @GetMapping("/")
    public String index_show(Model model){
        Map<String,String> table = new HashMap<>();
        table.put("a","a");
        table.put("b","a");
        table.put("c","c");
        model.addAttribute("table",table);
        return "index";
    }
}
