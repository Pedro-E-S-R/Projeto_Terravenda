package terravenda.com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import terravenda.com.example.entities.Imovel;

public interface IImovelRepositories extends JpaRepository<Imovel, Long> {
}
