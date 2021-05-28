package br.com.digitalhouse.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class Test {

//
//    @GetMapping("/produtos") status 200 e 404
//    https://localhost:8080/produtos
//    @GetMapping("/produtos/{id}") status 200 e 404
//    https://localhost:8080/produtos/2
//    @PostMapping("/produtos/{json}") status 201
//    https://localhost:8080/produtos/{"squadName": "Super hero squad","homeTown": "Metro City"}
//    @PutMapping("/produtos/{id}/{produto}") status  200 e 406
//    https://localhost:8080/produtos/2/{squadName": "Super hero squad"}
//    @DeleteMapping("/produtos/{id}") status 200 e 400
//    https://localhost:8080/produtos/2
//
//    Acho que está certo, só os status que complicou kk
//public JSONObject registerProduct(@RequestParam(value = "id") String id, @RequestParam(value = "nome") String nome,
//                                  @RequestParam(value = "tipo") String tipo, @RequestParam(value = "quantidade") String quantidade)
}
