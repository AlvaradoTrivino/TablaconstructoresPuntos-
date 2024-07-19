package project.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import project.model.Conexion;
import project.model.ConstructorPoints;

public class ContructorPoints {

    public List<ConstructorPoints> getConstructorTotalPoints() {
        List<ConstructorPoints> constructorList = new ArrayList<>();

        String sql = "SELECT d.name, " +
                     "SUM(r.points) AS total_points " +
                     "FROM results as r " +
                     "JOIN constructors as d ON r.constructor_id = d.constructor_id " +
                     "GROUP BY d.name " +
                     "ORDER BY total_points DESC " +
                     "LIMIT 50;";

        try {
            // Establecer la conexión
            Conexion dbConexion = new Conexion();
            Connection conn = dbConexion.EstablecerConexion("bd_pruebas", "postgres", "12345", "postgresql");

            // Ejecutar la consulta
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                String constructorName = rs.getString("name");
                float totalPoints = rs.getFloat("total_points");

                // Crear objeto ConstructorPoints usando el constructor adecuado
                ConstructorPoints constructor = new ConstructorPoints(constructorName, totalPoints);
                constructorList.add(constructor);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return constructorList;
    }

    public static void main(String[] args) {
        ContructorPoints constructorPointsRepository = new ContructorPoints();
        List<ConstructorPoints> constructorList = constructorPointsRepository.getConstructorTotalPoints();

        // Imprimir encabezado de la tabla
        System.out.printf("%-20s %-10s%n", "Constructor Name", "Total Points");

        // Imprimir cada registro con formato
        for (ConstructorPoints constructor : constructorList) {
            System.out.printf("%-20s %-10.2f%n", constructor.getConstructorName(), constructor.getPoints());
        }
    }
}
