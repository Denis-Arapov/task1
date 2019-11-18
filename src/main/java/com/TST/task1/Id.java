package com.TST.task1;

/**
 * Класс который имеет метод создания уникального ID
 */
public class Id {

    /**
     * Последний возвращённый ID
     */
    static Integer id = 0;

    /**
     * @return Возвращает уникальный ID
     */
    static public Integer getid() {
        return id++;
    }
}
