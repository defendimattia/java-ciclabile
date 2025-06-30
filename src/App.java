public class App {

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

    public App(int[] arrayInteri) {
        this.arrayInteri = arrayInteri;
    }

    public static void main(String[] args) throws Exception {

    }
}
