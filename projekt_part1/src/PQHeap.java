
/**
 *
 * @author Robin Lausten Petersen   - ropet17
 * @author Jeppe Enevold Jensen - jeppj17
 * @author Kim Christensen - kichr17
 */
public class PQHeap implements PQ {

    private Element[] elements;
    private int heapSize;

    public PQHeap(int i) {
        elements = new Element[i];
        heapSize = 0;
    }

    @Override
    public Element extractMin() {
        Element min = elements[0];

    }

    @Override
    public void insert(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int parent(int i) {
        return (int) Math.floor(i-1 / 2);
    }

    private int left(int i) {
        return (i * 2) + 1;
    }

    private int right(int i) {
        return (i + 1) * 2;
    }

}
