package HalukHocaGithub._17_Abstract.TekClassOrnek;

abstract class kopek {

    public void havHav() {
        System.out.println("HAV HAV!!");
    }

    public abstract void besin();

}

class corgi extends kopek {


    @Override
    public void besin() {
        System.out.println("Corgi türü köpekler sadece proteinli mama yerler.");
    }

}


public class abstractTekClass {
    public static void main(String[] args) {

        corgi karabas = new corgi();

        karabas.besin();
        karabas.havHav();


    }
}
