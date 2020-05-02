package sunny.example.ecommerce.demo.service;

import org.springframework.stereotype.Service;
import sunny.example.ecommerce.demo.entity.Item;

import java.util.List;
import java.util.Optional;

@Service
public interface ItemService {

    public List<Item> getItems();
    public Item updateItem(Item item,String id);
    public void deleteItem(Long id);
    public Item addItem(Item item);
    public Optional<Item> getItemById(Long id);


}