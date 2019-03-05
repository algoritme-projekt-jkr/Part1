
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
        elements[0] = elements[heapSize-1];
        heapSize--;
        minHeapify(0);
        return min;
    }

    @Override
    public void insert(Element e) {
        
        int i = heapSize;
        elements[i] = e;
        
        while(i > 0 && elements[parent(i)].getKey()> elements[i].getKey()){
            Element temp = elements[i];
            elements[i] = elements[parent(i)];
            elements[parent(i)] = temp;
            i = parent(i);
        }
        heapSize++;
    }

    private int parent(int i) {
        return (int) Math.floor((i-1) / 2);
    }

    private int left(int i) {
        return (i * 2) + 1;
    }

    private int right(int i) {
        return (i + 1) * 2;
    }
    
    private void minHeapify(int i){ 
        int l = left(i);
        int r = right(i);
        int smallest;
        if(l < heapSize && elements[l].getKey() < elements[i].getKey()){
            smallest = l;
        }else {
            smallest = i;
        }
        if(r < heapSize && elements[r].getKey() < elements[smallest].getKey()){
            smallest = r;
        }
        if (smallest != i){
            Element temp = elements[i];
            elements[i] = elements[smallest];
            elements[smallest] = temp;
            minHeapify(smallest);
        } 
    }
    

}
