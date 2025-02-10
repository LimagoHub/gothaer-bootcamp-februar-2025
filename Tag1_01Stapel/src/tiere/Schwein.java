package tiere;

public class Schwein {

    private String name;
    private int gewicht;
    static int counter;

    static {
        Schwein.counter = 0;
    }
    public Schwein() {
        this("Nobody");
    }

    public Schwein(String name){
        this.name = name;
        this.gewicht = 10;
        Schwein.counter ++;
    }

    public static int getCounter() {
        return Schwein.counter;
    }

    protected void finalize() {
        counter --;
        System.out.println("Quiiiieeeek");
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    public void fuettern(){

        setGewicht(getGewicht()+1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }



}
