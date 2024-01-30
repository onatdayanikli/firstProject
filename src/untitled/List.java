package untitled;

public class List<T> {
    public T info;
    public List<T> next;

    public List(T x, List<T> l) {
        info = x;
        next = l;
    }

    public void insert(T x) {
        next = new List<T>(x, next);
    }

    public List<T> reverse(List<T> toReverse) {
        List<T> reversed = new List<T>(toReverse.info, null);
        while (toReverse.next!=null){
            reversed = new List<T>(toReverse.next.info, reversed);
            toReverse = toReverse.next;
        }
        return reversed;
    }
}
