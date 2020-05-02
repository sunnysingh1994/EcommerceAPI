package sunny.example.ecommerce.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import sunny.example.ecommerce.demo.entity.Item;
import sunny.example.ecommerce.demo.repository.ItemRepository;
import sunny.example.ecommerce.demo.service.ItemService;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item updateItem(Item updateItem, String id) {
        Optional<Item> itemOptional = itemRepository.findById(Long.valueOf(id));
        Item item = itemOptional.get();
        item.setItemName(updateItem.getItemName());
        item.setDescription(updateItem.getDescription());
        item.setPrice(updateItem.getPrice());
        return itemRepository.save(item);
    }


    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }


    @Override
    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }
}
