package br.com.digitalhouse.demo.requestparam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
class RequestParamClass {

    @GetMapping("/")
    public String getIndex(){
        return "Say your name in URI separeted with /";
    }

    @GetMapping("/{name}")
    public String getParam(@PathVariable(value = "name") String name){
        return "Welcome " + name;
    }

}
