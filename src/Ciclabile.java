public class Ciclabile {

    int[] arrayInteri;
    int currentElement = 0;

    public int getElementoSuccessivo() {
        if (currentElement < arrayInteri.length) {
            return arrayInteri[currentElement++];
        }
        return arrayInteri[currentElement - 1];
    }

    public boolean hasAncoraElementi() {

        boolean hasElement = false;

        if (currentElement < arrayInteri.length) {
            hasElement = true;
        }
        return hasElement;
    }

    public void addElemento(int elemento) {
        int[] newArrayInteri = new int[arrayInteri.length + 1];

        for (int i = 0; i < arrayInteri.length; i++) {
            newArrayInteri[i] = arrayInteri[i];
        }

        newArrayInteri[arrayInteri.length] = elemento;
        arrayInteri = newArrayInteri;
    }

    public Ciclabile(int[] arrayInteri) {
        this.arrayInteri = arrayInteri;
    }

    public Ciclabile() {
        this.arrayInteri = new int[0];
    }

    public static void main(String[] args) throws Exception {

    }
}
