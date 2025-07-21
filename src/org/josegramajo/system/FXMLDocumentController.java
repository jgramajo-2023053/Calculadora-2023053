package org.josegramajo.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    Double valor1 , valor2, result;
    String operacion;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnMas;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMenos;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMulti;
    @FXML private Button btnUnoX;
    @FXML private Button btnCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnDivi;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private TextField txtPantalla;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Botón 1
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
            // Botón 2
            else if (event.getSource() == btnDos)
                txtPantalla.setText(txtPantalla.getText()+"2");
            // Botón 3
            else if (event.getSource() == btnTres)
                txtPantalla.setText(txtPantalla.getText()+"3");
            // Bottón 4
            else if (event.getSource() == btnCuatro)
                txtPantalla.setText(txtPantalla.getText()+"4");
            // Botón 5
            else if (event.getSource() == btnCinco)
                txtPantalla.setText(txtPantalla.getText()+"5");
            // Botón 6
            else if (event.getSource() == btnSeis)
                txtPantalla.setText(txtPantalla.getText()+"6");
            // Botón 7
            else if (event.getSource() == btnSiete)
                txtPantalla.setText(txtPantalla.getText()+"7");
            // Botón 8
            else if (event.getSource() == btnOcho)
                txtPantalla.setText(txtPantalla.getText()+"8");
            // Botón 9
            else if (event.getSource() == btnNueve)
                txtPantalla.setText(txtPantalla.getText()+"9");
            // Botón 0
            else if (event.getSource() == btnCero)
                txtPantalla.setText(txtPantalla.getText()+"0");
            // Botón +/-
            else if (event.getSource() == btnMasMenos)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())*(-1)));
            // Botón CE
            else if (event.getSource() == btnCE){
                txtPantalla.clear();
                btnPunto.setDisable(false);
            }// Botón C
             else if (event.getSource() == btnC){
                btnPunto.setDisable(false);
                valor1 = null;
                valor2 = null;
                txtPantalla.clear();
             // Botón 1/x
            }else if (event.getSource() == btnUnoX){
                valor1 = Double.parseDouble(txtPantalla.getText());
                result = 1 / valor1;
                txtPantalla.setText(String.valueOf(result));
            }// Botón ²√x
             else if (event.getSource() == btnRaiz){
                btnPunto.setDisable(false);
                valor1 = Double.parseDouble(txtPantalla.getText());
                result = Math.sqrt(valor1);
                txtPantalla.setText(String.valueOf(result));
                valor1 = result;
            }// Botón .
             else if (event.getSource() == btnPunto){
                    if (txtPantalla.getText().length()==0)
                        txtPantalla.setText(txtPantalla.getText()+"0.");
                    else
                        txtPantalla.setText(txtPantalla.getText()+".");
                btnPunto.setDisable(true);
            }// Botón x²
             else if (event.getSource() == btnCuadrado){
                btnPunto.setDisable(false);
                valor1 = Double.parseDouble(txtPantalla.getText());
                result = valor1 * valor1;
                txtPantalla.setText(String.valueOf(result));
            }// Botón +
             else if (event.getSource() == btnMas){
                btnPunto.setDisable(false);
                if (valor1!=null)
                    valor1 = valor1 + Double.parseDouble(txtPantalla.getText());
                else
                    valor1 = Double.parseDouble(txtPantalla.getText());
                operacion = "Suma";
                txtPantalla.clear();
            }// Botón -
             else if (event.getSource() == btnMenos){
                btnPunto.setDisable(false);
                if (valor1!=null)    
                    valor1 = valor1 - Double.parseDouble(txtPantalla.getText());
                else
                    valor1 = Double.parseDouble(txtPantalla.getText());
                operacion = "Resta";
                txtPantalla.clear();
            }// Botón *
             else if (event.getSource() == btnMulti){
                btnPunto.setDisable(false);
                operacion = "Multiplicacion";
                valor1 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
            }// Botón ÷
             else if (event.getSource() == btnDivi){
                btnPunto.setDisable(false);
                valor1 = Double.parseDouble(txtPantalla.getText());
                operacion = "Division";
                txtPantalla.clear();
            }// Botón %
             else if (event.getSource() == btnPorcentaje){
                btnPunto.setDisable(false);
                valor2 = valor1 * (Double.parseDouble(txtPantalla.getText()) / 100);
                if (operacion == "Multiplicacion"){
                    valor2 = Double.parseDouble(txtPantalla.getText()) / 100;
                }
                txtPantalla.setText(String.valueOf(valor2));
            }// Botón =
             else if (event.getSource() == btnIgual){
                btnPunto.setDisable(true);
                if (operacion == "Suma"){
                    valor2 = Double.parseDouble(txtPantalla.getText());
                    result = valor1 + valor2;
                }else if (operacion == "Resta"){
                    valor2 = Double.parseDouble(txtPantalla.getText());
                    result = valor1 - valor2;
                }else if (operacion == "Multiplicacion"){
                    valor2 = Double.parseDouble(txtPantalla.getText());
                    result = valor1 * valor2;
                }else if (operacion == "Division"){
                    valor2 = Double.parseDouble(txtPantalla.getText());
                    result = valor1 / valor2;
                }else if (txtPantalla.getText().length()==0)
                    result = 0.0;
                else
                    result = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                txtPantalla.setText(String.valueOf(result));
            }
                
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
