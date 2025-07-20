package iterator;


public class BrowseHistory {
    private String[] urls =  new String[10];
    private int index;

    public BrowseHistory() {
        index = 0;
    }

    public void push(String url) {
        urls[index] = url;
        index ++;
    }

    public String pop() {
        var lastIndex = urls.length - 1;
        var lastUrl = urls[lastIndex];
        urls[lastIndex] = null;

        return lastUrl;
    }

    public IteradorSp createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements IteradorSp {
        private BrowseHistory history;
        private int index = 0;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return urls[index] != null;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index ++;
        }
    }
}
