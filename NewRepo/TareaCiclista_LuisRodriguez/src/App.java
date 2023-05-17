import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.List;
import java.util.Map;

import clases.Carrera;
import clases.Ciclista;
import clases.Equipo;

public class App {
    public static void main(String[] args) throws Exception {

        List<Ciclista> listaCiclistas = UtilesJson.leerCiclistasJson("src/recursos/ciclistas.json");

        List<Equipo> equipos = UtilesJson.leerEquiposCsv("src/recursos/equipos.csv");

        Map<Integer,Integer> etapa1 = UtilesJson.leerEtapa("src/recursos/etapa1.json");
        Map<Integer,Integer> etapa2 = UtilesJson.leerEtapa("src/recursos/etapa2.json");
        Map<Integer,Integer> etapa3 = UtilesJson.leerEtapa("src/recursos/etapa3.json");
        


        Carrera carreraFuap = new Carrera(listaCiclistas, "Carrera Carrerosa");

        carreraFuap.crearEquipos(equipos);
        carreraFuap.insertarTiemposEtapa(etapa1);
        carreraFuap.insertarTiemposEtapa(etapa2);
        carreraFuap.insertarTiemposEtapa(etapa3); 

        try (FileWriter fw = new FileWriter("src/ficheroFinal/VueltaAMalaga.txt");
            BufferedWriter bw = new  BufferedWriter(fw)) 
        {
        
            bw.write("======================== VUELTA A MALAGA  ========================\n\n\n");

            bw.write("====== CICLISTAS PARTICIPANTES EN LA CARRERA ======\n\n");
            bw.write(listaCiclistas+"\n\n");

            bw.write("====== CLASIFICACION FINAL ======\n\n");
            bw.write(carreraFuap.clasificacionCompleta()+"\n\n");



            //Podium
            bw.write(carreraFuap.podium()+"\n\n");
            
            bw.write("====== CLASIFICACION POR EQUIPOS ======\n");
            bw.write(carreraFuap.clasificacionPorEquipos());

            bw.write("\n\n====== POSICION DEL CORREDOR Wilco Kelderman(BOHA) Dorsal: 22\n\n");
            bw.write("QUEDO EN EL PUESTO NUMERO "+
            carreraFuap.posicionCorredor(carreraFuap.buscarPorDorsal(22))+" ||"+// Puesto en el que quedo el corredor
            carreraFuap.buscarPorDorsal(22));//Info del corredor



        } catch (Exception e) {
        }

     



       
        
    }
}
