package project.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import project.model.ConstructorPoints;
import project.repository.ContructorPoints;

public class TotalPointsConstruc implements Initializable {

    @FXML
    private TableColumn<ConstructorPoints, String> NombreConstrucPoints;

    @FXML
    private TableColumn<ConstructorPoints, Float> TotalContrucPoints;

    @FXML
    private TableView<ConstructorPoints> tablaConstrucPoints;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Configurar las columnas de la tabla
        NombreConstrucPoints.setCellValueFactory(new PropertyValueFactory<>("constructorName"));
        TotalContrucPoints.setCellValueFactory(new PropertyValueFactory<>("points"));

        // Cargar los datos en la tabla
        loadConstructorsData();
    }

    private void loadConstructorsData() {
        ContructorPoints constructorPointsRepository = new ContructorPoints();
        List<ConstructorPoints> constructorList = constructorPointsRepository.getConstructorTotalPoints();

        // Limpiar la tabla antes de agregar nuevos datos
        if (tablaConstrucPoints != null) {
            tablaConstrucPoints.getItems().clear();
            // Agregar los datos a la tabla
            tablaConstrucPoints.getItems().addAll(constructorList);
        }
    }
}
