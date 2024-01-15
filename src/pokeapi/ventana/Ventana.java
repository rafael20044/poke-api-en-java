package pokeapi.ventana;

import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lbMostrar = new javax.swing.JLabel();
        lbNombrePokemon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbTipoPokemon = new javax.swing.JLabel();
        lbGeneracionPokemon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pokeapi_256.png"))); // NOI18N

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbNombrePokemon.setText("NA");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Generación:");

        lbTipoPokemon.setText("NA");

        lbGeneracionPokemon.setText("NA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBuscar)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTipoPokemon)
                            .addComponent(lbNombrePokemon)
                            .addComponent(lbGeneracionPokemon))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbNombrePokemon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lbGeneracionPokemon))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTipoPokemon)
                                .addGap(181, 181, 181))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtNombre.getText();
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + nombre);
            HttpURLConnection co = (HttpURLConnection) url.openConnection();
            co.setRequestMethod("GET");
            co.connect();
            int respuesta = co.getResponseCode();
            if (respuesta == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(co.getInputStream()));
                StringBuilder builder = new StringBuilder();
                String line;
                setCursor(Cursor.WAIT_CURSOR);
                while ((line = br.readLine()) != null) {
                    builder.append(line);
                }
                br.close();

                JSONObject json = new JSONObject(builder.toString());
                String imagen = json.getJSONObject("sprites").getString("front_default");
                String nombrePokemon = json.getString("name");
                JSONArray tiposArray = json.getJSONArray("types");
                StringBuilder tiposPokemon = new StringBuilder();
                for (int i = 0; i < tiposArray.length(); i++) {
                    tiposPokemon.append(tiposArray.getJSONObject(i).getJSONObject("type").getString("name"));
                    if (i < tiposArray.length() - 1) {
                        tiposPokemon.append(", ");
                    }
                }

               // String urlPokemon = json.getString("url");
               // int generacion = obtenerGeneracion(urlPokemon);

                mostar(imagen, nombrePokemon, tiposPokemon.toString());
                co.disconnect();
            } else {
                JOptionPane.showMessageDialog(this, "Error");
                setCursor(Cursor.DEFAULT_CURSOR);
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex);
            setCursor(Cursor.DEFAULT_CURSOR);
        } catch (IOException ex) {
            setCursor(Cursor.DEFAULT_CURSOR);
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void mostar(String url, String name, String tipo) {
        try {
            ImageIcon icon = new ImageIcon(new URL(url));
            lbMostrar.setIcon(icon);
            lbNombrePokemon.setText(name);
            //lbGeneracionPokemon.setText(generacion+"");
            lbTipoPokemon.setText(tipo);
            setCursor(Cursor.DEFAULT_CURSOR);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbGeneracionPokemon;
    private javax.swing.JLabel lbMostrar;
    private javax.swing.JLabel lbNombrePokemon;
    private javax.swing.JLabel lbTipoPokemon;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
