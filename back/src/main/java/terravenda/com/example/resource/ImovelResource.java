package terravenda.com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import terravenda.com.example.entities.Imovel;
import terravenda.com.example.service.ImovelServices;

import java.util.List;

@RestController
@RequestMapping(name = "/imovel")
public class ImovelResource {

    @Autowired
    ImovelServices service;

    @GetMapping
    public ResponseEntity<List<Imovel>> findAll(){
        List<Imovel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
