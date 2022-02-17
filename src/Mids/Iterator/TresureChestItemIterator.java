package Mids.Iterator;

import java.util.List;

public class TresureChestItemIterator implements ItemIterator {
    private TresureChest chest;
    private int indx;

    public TresureChestItemIterator(TresureChest chest, ItemType type) {
        this.chest = chest;

        this.type = type;
    }

    private ItemType type;


    @Override
    public boolean hasNext() {
        return findNextIndex() !=-1;
    }

    @Override
    public Item next() {
        indx = findNextIndex();
        if (indx != -1){
            return chest.getItems().get(indx);
        }
        return null;
    }
    private int findNextIndex(){
        List<Item> items = chest.getItems();
        boolean found = false;
        int tempindx = indx;
        while (!found){
            tempindx++;
            if(tempindx >= items.size()){
                tempindx =-1;
                break;
            }
            if (type.equals(ItemType.ANY)|| items.get(tempindx).getType().equals(type)){
                break;
            }
        }
        return tempindx;
    }
}
