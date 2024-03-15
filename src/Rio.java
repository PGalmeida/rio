public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    public Rio(){

    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if(this.nivel - x >= 0){
            this.nivel -= x;
        }else {
            System.out.println("O rio já está seco ou não pode secar mais!");
        }
    }
    public void limpar(){
        if(!this.poluido){
            this.poluido = true;
        }
    }
    public void sujar(){
        if(this.poluido){
            this.poluido = false;
        }
    }
    public void mostrar(){
        System.out.println("------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("nível: "+this.nivel);
        System.out.println("Poluído: "+this.poluido);
    }
}
