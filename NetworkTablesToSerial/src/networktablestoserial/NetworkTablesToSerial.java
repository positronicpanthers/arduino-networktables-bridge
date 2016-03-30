/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networktablestoserial;

import edu.wpi.first.wpilibj.networking.NetworkTable;

/**
 *
 * @author tmas
 */
public class NetworkTablesToSerial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NetworkTable table;
        double airpressure;
        // Init NetworkTable
        NetworkTable.setIPAddress("10.6.23.2");  // ip of crio
        table = NetworkTable.getTable("arduinoLED");
        // in the image processing loop
        table.beginTransaction();
        airpressure = table.getDouble("airpressure");
        table.endTransaction();
    }
    
}
