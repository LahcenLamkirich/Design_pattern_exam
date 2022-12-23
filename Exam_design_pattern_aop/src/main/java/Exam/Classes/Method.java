package Exam.Classes;

import Exam.Enumerateur.Visibility;

public class Method {
    private String name;
//    private ReturnType returnType;
//    private List<Parameter> parameters;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private boolean isAbstract;

    public Method(String name, /*ReturnType returnType, List<Parameter> parameters,*/
                  Visibility visibility, boolean isStatic, boolean isFinal, boolean isAbstract) {
        this.name = name;
//        this.returnType = returnType;
//        this.parameters = parameters;
        this.visibility = visibility;
        this.isStatic = isStatic;
        this.isFinal = isFinal;
        this.isAbstract = isAbstract;
    }
}
