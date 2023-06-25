package com.example.model.enums;

public enum CategoryEnum {
    ELECTRONIC("Electronic",1),
    BOOK("Book",2),
    HOME("Home",3),
    HEALTH_CARE("Health Care",4),
    COSMETIC("Cosmetic",5),
    TOY("Toy",6),
    ENTERTAINMENT("Entertainment",7),
    GAMES("Games",8),
    BABY("Baby",9),
    CONSTRUCTION("Constriction",10);

    private final String name;

    private final long value;

    CategoryEnum(String name, long value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public long getValue() {
        return value;
    }
}
