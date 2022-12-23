package Exam.Classes;

import Exam.Enumerateur.DataTypee;
import Exam.Enumerateur.Visibility;

public class Attribute {
    private String name;
    private DataTypee datatype;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;

    public Attribute(String name, DataTypee datatype, Visibility visibility, boolean isStatic, boolean isFinal) {
        this.name = name;
        this.datatype = datatype;
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataTypee getDatatype() {
        return datatype;
    }

    public void setDatatype(DataTypee datatype) {
        this.datatype = datatype;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
}
