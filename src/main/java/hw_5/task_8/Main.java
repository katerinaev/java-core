package hw_5.task_8;
/*
8. Музей
Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
*/
public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.setExhibit(manuscript);
        museum.manageExhibit();
        System.out.println();
        museum.setExhibit(sculpture);
        museum.manageExhibit();
    }
}
