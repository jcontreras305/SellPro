/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CreateDataBase {

    public CreateDataBase() {
    }
    
    private final String Proveedores = "CREATE TABLE proveedores("
            + "id_proveedor      VARCHAR (50) PRIMARY KEY NOT NULL,"
            + "RFC               VARCHAR (50) NOT NULL,"
            + "nombreProveedor   VARCHAR (50), "
            + "telefono          VARCHAR (15),"
            + "estado            VARCHAR (30),"
            + "ciudad            VARCHAR (30),"
            + "calle             VARCHAR (30),"
            + "numeroCasa        INT,"
            + "CP                INT,"
            + "email             VARCHAR (50),"
            + "tipoProveedor     VARCHAR (20),"
            + "numCuenta         INT )";
    
    private final String Producto = "CREATE TABLE Producto("
            + "id_producto      VARCHAR(30) PRIMARY KEY NOT NULL,"
            + "codigoBarras    VARCHAR (50) NOT NULL,"
            + "codigoSAT       VARCHAR(50),"
            + "nombreProducto  VARCHAR(50) NOT NULL,"
            + "existenciaProducto DOUBLE(10,2),"
            + "utilidad_01     DOUBLE(10,2),"
            + "utilidad_02     DOUBLE(10,2),"
            + "utilidad_03     DOUBLE(10,2),"
            + "utilidad_04     DOUBLE(10,2),"
            + "utilidad_05     DOUBLE(10,2),"
            + "utilidad_06     DOUBLE(10,2),"
            + "utilidad_07     DOUBLE(10,2),"
            + "utilidad_08     DOUBLE(10,2),"
            + "costoProduto    DOUBLE(10,2),"
            + "unidadMedida    VARCHAR(50),"
            + "marcaProducto   VARCHAR (50),"
            + "minimo DOUBLE   (10,2),"
            + "nombreProveedor VARCHAR(50),"
            + "contenidoCaja   INT),"
            + "FOREIGN KEY (fk_nombreProveedorP) REFERENCES Proveedores(nombreProveedor)";
    private final String Compra="CREATE TABLE Compra("
            +"id_Compra         INT PRIMARY KEY NOT NULL,"
            + "no_Factura       INT,"
            + "fecha            DATE,"
            + "nombreProveedor  VARCHAR(50)"
            + "monto            DOUBLE(10,2)"
            + "FOREING KEY (fk_nombreProveedorC) REFERENCES Proveedores(nombreProveedor))";
    private final String Detalle_Compra="CREATE TABLE Detalle_Compra("
            + "id_Compra        INT, "
            + "id_Producto      VARCHAR(30),"
            + "nombreProducto   VARCHAR(20),"
            + "cantidadComprada INT,"
            + "costo            DOUBLE(10,2)"
            + "FOREIGN KEY (fk_id_Compra) REFERENCES Compra (id_Compra)"
            + "FOREIGN KEY (fk_id_ProductoDC) REFERENCES Producto (id_producto))";

    private final String Cliente="CRETA TABLE Cliente("
            + "id_Cliente      INT PRIMARY KEY NOT NULL"
            + "RFC             VARCHAR(20),"
            + "nombreCliente   VARCHAR(50),"
            + "telefono        VARCHAR(20),"
            + "categoria       VARCHAR(50),"
            + "estado          VARCHAR(30),"
            + "ciudad          VARCHAR(30),"
            + "calle           VARCHAR(30),"
            + "numeroCasa      INT, "
            + "email           VARCHAR(50),"
            + "cp              INT())";    
    private final String Venta="CREATE TABLE Venta("
            + "id_Venta         INT PRIMARY KEY NOT NULL,"
            + "id_Cliente       INT, "
            + "fecha            DATE, "
            + "nombreCliente    VARCHAR(50),"
            + "tipoVenta        VARCHAR(20)"
            + "monto            DOUBLE(10,2)"
            + "FOREIGN KEY (fk_id_ClienteV) REFERENCES Cliente (id_Cliente))";
   private final String Detalle_Venta="CREATE TABLE Detalle_Venta("
           + "id_Venta          INT,"
           + "id_Producto       INT,"
           + "nombreProducto    VARCHAR(30),"
           + "cantidadVendida   INT,"
           + "precio            FLOAT(4,2),"
           + "tipoVenta         VARCHAR(20),"
           + "FOREIGN KEY (fk_id_VentaDV) REFERENCES Venta(id_Venta),"
           + "FOREIGN KEY (fk_id_ProductoDV) REFERENCES Producto(id_Producto))"; 
}
