public class Main {
    public static void main(String[] args) {
        Rio rio1 = new Rio("Tiete", 3, false);
        Rio rio2 = new Rio();

        rio2.nome = "Sapucai";
        rio2.nivel = 6;
        rio2.poluido = true;

        rio1.mostrar();
        rio2.mostrar();
        rio1.sujar();
        rio2.limpar();
        rio1.chover(4);
        rio2.ensolarar(4);
        rio1.mostrar();
        rio2.mostrar();
    }
}