package Exam.Classes;

import java.util.List;

public class Classe extends Entity{
    private List<Attribute> attributes;
    private List<Method> methods;
    private List<Constructeur> constructors;

    public Classe(String name, List<Attribute> attributes, List<Method> methods, List<Constructeur> constructors) {
        super(name);
        this.attributes = attributes;
        this.methods = methods;
        this.constructors = constructors;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<Constructeur> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<Constructeur> constructors) {
        this.constructors = constructors;
    }
}
