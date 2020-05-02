package sunny.example.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sunny.example.ecommerce.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
}
