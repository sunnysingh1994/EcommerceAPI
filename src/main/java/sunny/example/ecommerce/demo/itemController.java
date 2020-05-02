package sunny.example.ecommerce.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sunny.example.ecommerce.demo.entity.Item;
import sunny.example.ecommerce.demo.serviceImpl.ItemServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class itemController {
    @Autowired
    private ItemServiceImpl itemServiceImpl;

    @RequestMapping("/items" )
    public List<Item> getallItmes(){
        return itemServiceImpl.getItems();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addItems")
    public Item addItems(@RequestBody Item items){
        return itemServiceImpl.addItem(items);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/detailItems/{id}")
    public Optional<Item> getItemById(@PathVariable Long id){
        return itemServiceImpl.getItemById(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/updateItems/{id}")
    public void updateItems(@RequestBody Item items, @PathVariable String id){
            itemServiceImpl.updateItem(items,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteItems/{id}")
    public void deleteItems(@PathVariable Long id){
        itemServiceImpl.deleteItem(id);
    }
}
