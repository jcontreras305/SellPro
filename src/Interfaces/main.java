package Interfaces;
import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author anaar_000
 */
public class main {
     public static void main(String[] args) throws UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        
        //UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\anaar_000\\Documents\\NetBeansProjects\\ejemplo\\src\\Lib UpperEssential\\Marino1.theme"));//nuevo y editae producto
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\anaar_000\\Documents\\NetBeansProjects\\ejemplo\\src\\Lib UpperEssential\\negro.theme"));
        
//        NuevoProducto lib=new NuevoProducto();
//        lib.setLocationRelativeTo(null);
//        lib.setVisible(true);
//        
//        EditarProducto edit=new EditarProducto();
//        edit.setLocationRelativeTo(null);
//        edit.setVisible(true);
        
//        NuevoCliente clie=new NuevoCliente();
//        clie.setLocationRelativeTo(null);
//        clie.setVisible(true);
        
//        Iinventario in=new Iinventario();
//        in.setLocationRelativeTo(null);
//        in.setVisible(true);
        
//        Marcas mar=new Marcas();
//        mar.setLocationRelativeTo(null);
//        mar.setVisible(true);
        
//        Proveedor prov=new Proveedor();
//        prov.setLocationRelativeTo(null);
//        prov.setVisible(true);
        
         
//        Ventas ven=new Ventas();
//        ven.setLocationRelativeTo(null);
//        ven.setVisible(true);
        
//         Pagos pa=new Pagos();
//         pa.setLocationRelativeTo(null);
//         pa.setVisible(true);
         
//         Reimprimir ti=new Reimprimir();
//         ti.setLocationRelativeTo(null);
//         ti.setVisible(true);
        
//           Calcularpedido pe=new Calcularpedido();
//           pe.setLocationRelativeTo(null);
//           pe.setVisible(true);
             
        
            Compras co=new Compras();
            co.setLocationRelativeTo(null);
            co.setVisible(true);
           
     }
}