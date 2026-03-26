package hw_8.generics.task_3;
/*
 3. Задача на дженерик с двумя типами данных
 Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
 Класс должен позволять получать и устанавливать каждый из этих объектов.
*/
public class Pair<T1, T2> {
    private T1 t1;
    private T2 t2;

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setT1(1000);
        pair.setT2(" dollars.");
        System.out.println(pair.getT1() + pair.getT2());
    }

}
