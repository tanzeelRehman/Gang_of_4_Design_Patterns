package Mids.Iterator;

import java.util.ArrayList;
import java.util.List;


public class TresureChest {

   List<Item> items;

public TresureChest(){
   items = List.of(
           new Item("Potion of Power",ItemType.POTION),
            new Item("Ring of Shadows",ItemType.RING),
           new Item("Any ",ItemType.ANY),
           new Item("Weapon",ItemType.WEAPON)
   );


}
    public ItemIterator iterator(ItemType type){
        return new TresureChestItemIterator(this,type);
    }

    public List<Item> getItems(){
    List<Item> list = new ArrayList<>();
    list.addAll(items);
    return list;
    }





}
