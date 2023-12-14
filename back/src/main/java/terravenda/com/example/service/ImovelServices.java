package terravenda.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import terravenda.com.example.entities.Imovel;
import terravenda.com.example.repositories.IImovelRepositories;

import java.util.List;
import java.util.Optional;

@Component
public class ImovelServices {

    @Autowired
    IImovelRepositories iImovelRepositories;

    public List<Imovel> findAll() {
        return iImovelRepositories.findAll();
    }
    public Imovel findById(long id){
        Optional<Imovel> obj = iImovelRepositories.findById(id);
        return obj.get();
    }
}
