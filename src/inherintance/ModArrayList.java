package inherintance;

import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {
    public E getUsingMod(int index) {
        int i = index;
        if (index < 0) {
            i = -index;
        }
        i = i % size();

        return get(i);
    }

    public static void main(String[] args) {
        ModArrayList<Integer> iList = new ModArrayList<>();
        iList.add(1);
        iList.add(2);
        iList.add(3);

        System.out.println(iList.getUsingMod(-1));
        System.out.println(iList.getUsingMod(100));
        System.out.println(iList.getUsingMod(0));
    }
}
