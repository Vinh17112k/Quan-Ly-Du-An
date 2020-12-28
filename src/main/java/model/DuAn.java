/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Quang Vinh
 */
public class DuAn {
    private int id, cost;
    private String name, type;
    public static int currentId=9999;

    public DuAn(int cost, String name, String type) {
        this.id=++currentId;
        this.cost = cost;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        DuAn.currentId = currentId;
    }
    public Object[] toObjects()
    {
        return new Object[]{id, name, type, cost};
    }
}
