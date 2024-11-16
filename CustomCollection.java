import java.util.Iterator;

public class CustomCollection implements Iterable<String> {
    private String[] items;
    private int size;

    public CustomCollection(String[] items) {
        this.items = items;
        this.size = items.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            return items[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported.");
        }
    }

    public static void main(String[] args) {
        String[] items = {"One", "Two", "Three"};
        CustomCollection collection = new CustomCollection(items);

        for (String item : collection) {
            System.out.println(item);
        }
    }
}
