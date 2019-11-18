package com.TST.task1.entities;

public class Division implements IDivision {
    /**
     * Id отдела
     */
    int id;
    /**
     * Название
     */
    String name;

    /**
     * Возвращает Id отдела
     * @return Отдел
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * Устанавливает Id отдела
     * @param id Id отдела
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Возвращает название отдела
     * @return Название отдела
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя отдела
     * @param name Имя отдела
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

}
