package Mids.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        TresureChest chest = new TresureChest();
        ItemIterator ringIterator = chest.iterator(ItemType.RING);
        while (ringIterator.hasNext()){
            System.out.println(ringIterator.next());
        }

        ItemIterator potioniterator = chest.iterator(ItemType.POTION);
        while (ringIterator.hasNext()){
            System.out.println(potioniterator.next());
        }
    }
}
