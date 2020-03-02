package com.json.departments;

public class Departments_2 {
    private String id;
    private String name;
    private String shortDesc;
    private String img;


    public Departments_2() {
    }

    public Departments_2(String id, String name, String shortDesc, String img) {
        this.id = id;
        this.name = name;
        this.shortDesc = shortDesc;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
