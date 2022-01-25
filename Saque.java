public class Saque {

    private int nota100 = 0;
    private int nota50 = 0;
    private int nota20 = 0;
    private int nota10 = 0;

    public Saque(int nota100, int nota50, int nota20, int nota10){
        this.nota100 = nota100;
        this.nota50 = nota50;
        this.nota20 = nota20;
        this.nota10 = nota10;
    }

    public int getNota100() { return this.nota100; }
    public int getNota50() { return this.nota50; }
    public int getNota20() { return this.nota20; }
    public int getNota10() { return this.nota10; }

}
