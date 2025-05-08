public class Config {
    private static Config instance;
    private String valor;

    private Config(){}

    public static Config getInstance(){
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public static void main(String[] args) {
        String decimalStr = "3.1456";
        double decimal = Double.parseDouble(decimalStr);

        Config.getInstance().setValor("teste");
        System.out.println(Config.getInstance().getValor());
        System.out.print(decimal);
    }
}

