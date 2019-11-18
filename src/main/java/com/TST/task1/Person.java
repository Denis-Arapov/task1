package com.TST.task1;
import com.TST.task1.entities.IDivision;
import com.TST.task1.entities.IPerson;
import com.TST.task1.entities.enums.Gender;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * Класс описывающий человека
 */
public class Person implements IPerson {
    /**
     * Имя человека
     */
    private String firstName;
    /**
     * Фамилия человека
     */
    private String lastName;
    /**
     * ID человека
     */
    private Integer id;
    /**
     * Дата рождения человека хранимая в поле класса LocalDate
     */
    private LocalDate birthdate;
    /**
     * Пол человека true - мужчина, false - женщина
     */
    private Gender gender;
    /**
     * Отдел
     */
    private IDivision division;
    /**
     * Зарплата
     */
    private BigDecimal salary;
    /**
     * Конструктор класса Person, по мимо принимаемых параметров задаёт ID равное ID предыдущего человека +1
     *
     * @param firstName Имя
     * @param lastName Фамилия
     * @param birthday   Дата рождения типа LocalDate
     * @param gender Пол человека
     */
    public Person(String firstName,String lastName, LocalDate birthday, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = Id.getid();
        this.birthdate = birthday;
        this.gender = gender;
    }

    /**
     * @return Возвращает дату рождения человека
     */
    public Integer getAge() {
        Calendar date = new GregorianCalendar();
        return date.get(Calendar.YEAR) - this.birthdate.getYear();
    }

    /**
     * @return Возвращает ФИО
     */
    public String getFio() {
        return (getFirstName() + getLastName());
    }

    /**
     * @return Возвращает ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * задаёт Id
     * @param id Id человека
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Возвращает имя
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * Задаёт имя
     * @param firstName Имя
     */
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Возвращает фамилию
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * задаёт фамилию
     * @param firstName Фамилия
     */
    @Override
    public void setLastName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return возвращает дату
     */
    @Override
    public LocalDate getBirthdate() {
        return birthdate ;
    }

    /**
     * задаёт дату рождения
     * @param birthdate Дата рождения
     */
    @Override
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return Возвращает пол человека
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Задаёт пол человека
     * @param gender Пол
     */
    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return возвращает отдел
     */
    @Override
    public IDivision getDivision() {
        return division;
    }

    /**
     * Задаёт отдел
     * @param division Отдел
     */
    @Override
    public void setDivision(IDivision division) {
        this.division = division;
    }

    /**
     * @return Вохвращает зарплату
     */
    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * Задаёт зарплату
     * @param salary Зарплата
     */
    @Override
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * @return Возвращает строку в формате ФИО + id + возраст + пол
     */
    @Override
    public String toString() {
        return "Person{" +
                "fio='" + firstName +" "+lastName + '\'' +
                ", id=" + id +
                ", age=" + getAge().toString() +
                ", gender=" + getGender() +
                '}';
    }


    public static Comparator<Person> compareByFio = new Comparator<Person>() {
        public int compare(Person one, Person other) {
            return one.getFio().compareTo(other.getFio());
        }
    };

    public static Comparator<Person> compareById = new Comparator<Person>() {
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getId(),o2.getId());
        }
    };

    public static Comparator<Person> compareByAge = new Comparator<Person>() {
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(),o2.getAge());
        }
    };

}

