
public class Manager {
        
    Login login;
    Stock stock;
    Punto_de_Ventas ptoVenta;
    Administrador adm;

    public Manager() {
       login = new Login(this);
       ptoVenta = new Punto_de_Ventas(this);
       stock = new Stock(this);
       adm = new Administrador(this);
       login.setVisible(true);
    }
    
    
    public static void main(String h[] ) {
        new Manager();
    }
}
