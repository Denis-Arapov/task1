package com.TST.task1;

/**
 * Класс узла двусвязного списка
 * @param <T> Тип храпимых данных
 */
public class Node<T> {
    /**
     * Хранимое значение
     */
    private T data;
    /**
     * Следующий элемент списка
     */
    private Node<T> next;
    /**
     * Предыдущий элемент
     */
    private Node<T> prev;

    /**
     * Конструктор принемает данные
     * @param data Принемаемые данные
     */
    public Node(T data) {
        this.data = data;
    }

    /**
     * Возвращает следующий узел
     * @return слудующий узел
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Устанавливает следующий узел
     * @param next следующий узел
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Возвращает предыдущий узел
     * @return предыдущий узел
     */
    public Node<T> getPrev() {
        return prev;
    }

    /**
     * Устанавливет предыдуший узел
     * @param prev предыдущий узел
     */
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    /**
     * Возвтращает данные из узле
     * @return Данные узла
     */
    public T getData() {
        return data;
    }

    /**
     * Записывает данные в узел
     * @param data Записываемые данные
     */
    public void setData(T data) {
        this.data = data;
    }
}
