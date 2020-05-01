package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String taoOrdning(){
        return "tao-ordning";
    }

    @GetMapping("/driftsstatus")
    public String driftsstatus(){
        return "driftsstatus";
    }

    @GetMapping("/energibesparelser")
    public String energibesparelser(){
        return "energibesparelser";
    }

    @GetMapping("/fjernvarme")
    public String fjernvarme(){
        return "not-found";
    }

    @GetMapping("/fjernvarme/om-os/")
    public String omOs(){
        return "not-found";
    }

    @GetMapping("/fjernvarme/selvbetjening/")
    public String selvbetjening(){
        return "not-found";
    }


    @GetMapping("/kontakt-os/")
    public String kontakt(){
        return "not-found";
    }

    @GetMapping("/behandling-af-data/")
    public String data(){
        return "not-found";
    }

    @GetMapping("/fjernvarme/hvad-er-fjernvarme/")
    public String hvadErVarme(){
        return "not-found";
    }

    @GetMapping("/fjernvarme/tao-ordningen/")
    public String taoOrdningen(){
        return "tao-ordning";
    }
}
