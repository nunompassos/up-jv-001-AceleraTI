package tech.ada.velha;

public class Obj {
    private static int counter = 0;
    private String name;
    private int idade;
    private boolean healthy;

    public Obj(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() <= 2) {
            throw new Exception();
        }
        this.name = name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getHealthy() {
        return healthy;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; counter: " + counter;
    }
}
