package org.example;

public class entity {
    int id;
    String try_coloms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTry_coloms() {
        return try_coloms;
    }

    public void setTry_coloms(String try_coloms) {
        this.try_coloms = try_coloms;
    }

    public entity(int id, String try_coloms) {
        this.id = id;
        this.try_coloms = try_coloms;
    }

    public entity() {

    }
}
