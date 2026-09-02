package Methods;
import Classes.Exercise1.*;

public class Exercise1 {
    public Products [][] FillProductsMatrix(Products [][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = new Products("Producto " + (i*10 + j + 1), Math.random() * 100 + 1, (int) (Math.random() * 10 + 1));

            }
        }
        return p;
    }

    public Products FindProductByName(Products [][] p, String name) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (p[i][j].getName().equals(name)) {
                    System.out.println("Producto encontrado en la posición: [" + i + "][" + j + "]");
                    return p[i][j];
                }
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }
}