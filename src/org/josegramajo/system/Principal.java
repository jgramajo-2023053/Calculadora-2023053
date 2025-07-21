/*
 *  José Maunel Gramajo Pineda
 *           IN5AV
 *      Fecha de Creación
 *         02/04/2024
 *    Fecha de Modificación
 *         03/04/2024
 */
package org.josegramajo.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Principal extends Application {
    private Stage escenarioPrincipal;
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("José Gramajo"); /*Titulo del programa*/
        escenarioPrincipal.getIcons().add(new Image("/org/josegramajo/image/Icon.png")); /*Icono del archivo*/
        Scene scene = new Scene(root);
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
