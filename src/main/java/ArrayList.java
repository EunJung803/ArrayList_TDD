public class ArrayList {
    private int size;
    private int[] data;

    public ArrayList() {
        size = 0;
        data = new int[2];
    }

    public int size() {
        return size;
    }

    public void add(int addFactor) {
        addAt(addFactor, size);
    }

    private void sizeUp() {
        int[] newData = new int[size * 2];
        for(int i=0; i<size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int get(int index) {
        return data[index];
    }

    public void removeAt(int index) {
        for(int n=index; n<size; n++) {
            data[n] = data[n+1];
        }
        size --;
    }

    public int getArrayLength() {
        return data.length;
    }

    public void showAllValues() {
        System.out.println("==전체 데이터 출력==");
        for(int i=0; i<size; i++) {
            System.out.printf("%d : %d\n", i, data[i]);
        }
    }

    public void addAt(int addFactor, int index) {
        if(size == data.length) {
            sizeUp();
        }
        data[index] = addFactor;
        size++;
    }
}
