package com.IoT.view;

import com.IoT.controller.algorithms.InsertionSort;
import com.IoT.controller.algorithms.MergeSort;
import com.IoT.controller.algorithms.SelectionSort;
import com.IoT.model.DeviceModel;
import com.IoT.util.ValidationUtil;
import javax.swing.*;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class IoT extends javax.swing.JFrame {
    private List<DeviceModel> originalDeviceList;
    private List<DeviceModel> deviceList;
    private java.awt.CardLayout cardLayout;
    private final Color errorColor = new Color(255, 51, 0);
    private final Color yellowColor = new Color(239, 192, 32);
    private final ValidationUtil validationUtil;
    private final SelectionSort selectionSort;
    private final MergeSort mergeSort;
    private final InsertionSort insertionSort = null;
    
    
    public IoT() {
        initComponents(); // Initialize components
        validationUtil = new ValidationUtil();// Create an instance of validationutil
        selectionSort = new SelectionSort();// Create an instance of selectionSort
        mergeSort = new MergeSort();// Create an instance of MergeSort
        InsertionSort insertionSort = new InsertionSort();// Create an instance of InsertionSort
        startProgress(); // Start the loading process
        initializeLayout(); // setup cardlayout and add screen 
        initializeData();
    }
    
    /**
     * Initializes the application's data, including the student list and table.
     * Populates the student list with sample data for demonstration purposes.
     */
    private void initializeData(){
         deviceList = new LinkedList<>();
         originalDeviceList = new LinkedList<>();
         // Registring sample Device
         registerDevice(new DeviceModel(5423, "SN123", "Esp32", "microcontroller", 20, 1300, 26000));
         registerDevice(new DeviceModel(5555, "SN124", "Esp32 s3", "Micro controller", 10, 150, 1500));
         registerDevice(new DeviceModel(3215, "SN125", "Arduino Nano", "Micro controller", 25, 50, 1250));
         registerDevice(new DeviceModel(7890, "SN127", "Buzzer", "Sound sources", 30, 250, 5000));
         registerDevice(new DeviceModel(8901, "SN128", "Jumper wire", "Electric", 12, 180, 2200));
         registerDevice(new DeviceModel(9012, "SN129", "Rasperry pie", "Micro Controller", 22, 1200, 24000));
         registerDevice(new DeviceModel(1234, "SN130", "Ultra Sonic", "Sensor", 18, 300, 4500));
         registerDevice(new DeviceModel(2345, "SN131", "Capacitor", "Electric", 10, 400, 6000));
         registerDevice(new DeviceModel(3456, "SN132", "Resistor", "Electric", 5, 350, 7000));
        
}
    // Method to add device
    private void registerDevice(DeviceModel device){
    deviceList.add(device);
    DefaultTableModel model = (DefaultTableModel) tblDevice.getModel();
    model.addRow(new Object[]{
         device.getDevId(), device.getSerialNumber(), device.getDevName(), device.getType(), device.getQuantity(), device.getAmount(), device.getTotal()
});
}

    
    /**
     * Initializes the layout of the application by setting up the CardLayout
     * and adding panels for different screens. Each panel is uniquely
     * identified for easy navigation between screens.
     */
    private void initializeLayout(){
        cardLayout = new java.awt.CardLayout();
        getContentPane().setLayout(cardLayout);
        
        //Add panels with unique identifiers
        getContentPane().add(pnlLoadingScreen, "LoadingScreen");
        getContentPane().add(pnlLoginScreen, "LoginScreen");
        getContentPane().add(pnlMainScreen, "MainScreen");
        
        
        //Start with the loading screen
        loadScreen("LoadingScreen");
        
    }
    
    /**
     * Switches the application screen to the specified screen name.
     *
     * @param screenName The name of the screen to display.
     */
    private void loadScreen(String screenName){
        cardLayout.show(getContentPane(), screenName);
    }
    
    
    /**
     * Simulates the loading progress using a SwingWorker thread. Updates a
     * progress bar incrementally and switches to the login screen upon
     * completion.
     */
    private void startProgress(){
       javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30); // Simulated delay for progress bar
                    publish(i); // Publish progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                jProgressBar1.setValue(progress);
            }

            @Override
            protected void done() {
                loadScreen("LoginScreen"); // Switch to login screen
            }
        };
        worker.execute(); // Start the worker thread
    } 
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainScreen = new javax.swing.JPanel();
        Dashboard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        searchTxtField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        devIdTxtField = new javax.swing.JTextField();
        serialNumberTxtField = new javax.swing.JTextField();
        devNameTxtField = new javax.swing.JTextField();
        devTypeTxtField = new javax.swing.JTextField();
        quantityTxtField = new javax.swing.JTextField();
        amtTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        devIdLabel = new javax.swing.JLabel();
        serialLabel = new javax.swing.JLabel();
        devNameLabel = new javax.swing.JLabel();
        devTypeLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        devIdSortBtn = new javax.swing.JButton();
        devNameMergeSortBtn = new javax.swing.JButton();
        TotalInsertionSortBtn = new javax.swing.JButton();
        fetchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevice = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        plainMainBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        pnlLoginScreen = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        passWordTxtField = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        errorLogLabel = new javax.swing.JLabel();
        pnlLoadingScreen = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();

        pnlMainScreen.setBackground(new java.awt.Color(0, 102, 204));
        pnlMainScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlMainScreen.setPreferredSize(new java.awt.Dimension(1366, 968));

        Dashboard.setBackground(new java.awt.Color(0, 153, 153));
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        heading.setBackground(new java.awt.Color(0, 153, 255));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome To IoT(Information Of Things) Management System");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headingLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("## Transform Your IoT Experience with Our Comprehensive Management System");

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel22.setText("Our IoT management system empowers businesses to optimize their operations by providing real-time data insights, efficient ");

        jLabel23.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel23.setText(" device management, and enhanced security, all within a scalable framework that adapts to their needs. With instant visibility");

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel24.setText("device performance and usage patterns, users can leverage advanced analytics tools to transform raw data into actionable ");

        jLabel25.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel25.setText("insights, enabling data-driven decision-making and proactive responses to potential issues through customizable alerts and");

        jLabel26.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel26.setText("notifications. The platform features a centralized dashboard that simplifies the management of all connected devices,");

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel27.setText(" allowing for easy configuration, remote firmware updates, and seamless integration of new devices, regardless of type or ");

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel28.setText("manufacturer.");

        jPanel7.setBackground(new java.awt.Color(255, 153, 102));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Get Started Free");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Request a Demo");

        jLabel30.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel30.setText("\" OR \"");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(185, 185, 185))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("# Key Feature");

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel31.setText("Real-Time Monitoring:");

        jLabel32.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel32.setText("\"Gain instant visibility into your IoT devices with live data analytics.\"");

        jLabel33.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel33.setText("Device Management:");

        jLabel34.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel34.setText("\"Protect your data with advanced security protocols and encryption.\"");

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel35.setText("Integration Capabilities:");

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel36.setText("\"Seamlessly integrate with existing systems and third-party applications.\"");

        jLabel37.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel37.setText("User -Friendly Interface:");

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel38.setText("\"Navigate effortlessly with our intuitive and customizable dashboard.\"");

        jLabel39.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel39.setText("Data Security: ");

        jLabel40.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel40.setText("\"Protect your data with advanced security protocols and encryption.\"");

        jLabel41.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel41.setText("Geolocation Tracking:");

        jLabel42.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel42.setText("\"Track the location of your IoT devices in real-time, providing valuable insights for logistics.\"");

        jLabel43.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel43.setText("Edge Computing:");

        jLabel44.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel44.setText("\"Leverage edge computing capabilities to process data closer to the source.\"");

        jLabel45.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel45.setText("Energy Management:");

        jLabel46.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel46.setText("\"Monitor and optimize energy consumption across your devices, helping to reduce costs.\"");

        jLabel47.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel47.setText("Multi-User Access:");

        jLabel48.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel48.setText("\"Support multiple user roles and permissions, allowing teams to collaborate effectively.\"");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel38)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabel9.setText("@copyright - Rohan Chaurasiya(2025)");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel11.setText("Kathmandu - Kamalpokhari");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel12.setText("Province - 03");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel13.setText("Nepal");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel14.setText("Contact Us");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel15.setText("Email - rohanchaurasiya123@gmail.com");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel16.setText("Toll Free No - +97741038####");

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel17.setText("Number - +977-980#######");

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel18.setText("Social Media");

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel19.setText("Whatsaap - +977-9812######");

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel20.setText("Viber - +977-9832######");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(304, 304, 304)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        Dashboard.addTab("Home", jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        searchTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        searchTxtField.setForeground(new java.awt.Color(0, 51, 102));
        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        devIdTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Device ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        serialNumberTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Serial Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        devNameTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Device Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        devTypeTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Device Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        quantityTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        amtTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Amount", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        totalTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 13))); // NOI18N

        devIdLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        devIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devIdLabel.setMaximumSize(new java.awt.Dimension(338, 17));
        devIdLabel.setMinimumSize(new java.awt.Dimension(338, 17));
        devIdLabel.setPreferredSize(new java.awt.Dimension(338, 17));
        devIdLabel.setSize(new java.awt.Dimension(338, 17));

        serialLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        serialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        devNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        devNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        devTypeLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        devTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        quantityLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        amountLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        totalLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("jLabel9");

        addButton.setBackground(new java.awt.Color(255, 102, 102));
        addButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 102, 102));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 102, 102));
        deleteButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        devIdSortBtn.setBackground(new java.awt.Color(255, 102, 102));
        devIdSortBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        devIdSortBtn.setText("sortByDevId");
        devIdSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devIdSortBtnActionPerformed(evt);
            }
        });

        devNameMergeSortBtn.setBackground(new java.awt.Color(255, 102, 102));
        devNameMergeSortBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        devNameMergeSortBtn.setText("sortByDevName");
        devNameMergeSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devNameMergeSortBtnActionPerformed(evt);
            }
        });

        TotalInsertionSortBtn.setBackground(new java.awt.Color(255, 102, 102));
        TotalInsertionSortBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        TotalInsertionSortBtn.setText("sortByTotal");
        TotalInsertionSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalInsertionSortBtnActionPerformed(evt);
            }
        });

        fetchButton.setBackground(new java.awt.Color(255, 102, 102));
        fetchButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        fetchButton.setText("Fetch");
        fetchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchButtonActionPerformed(evt);
            }
        });

        tblDevice.setBackground(new java.awt.Color(204, 204, 204));
        tblDevice.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tblDevice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device ID", "Serial Number", "Device Name", "Device Type", "Quantity", "Amount", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDevice);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(devIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(serialNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(devNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(devTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amtTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(devIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(serialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(devNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(devTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(fetchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(1072, Short.MAX_VALUE)
                        .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(devIdSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(devNameMergeSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalInsertionSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amtTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 352, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TotalInsertionSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devNameMergeSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devIdSortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Dashboard.addTab("Dashboard", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );

        Dashboard.addTab("About Us", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );

        Dashboard.addTab("Notification", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );

        Dashboard.addTab("Raise Issues", jPanel6);

        plainMainBar.setBackground(new java.awt.Color(51, 204, 255));
        plainMainBar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IoT Management System");

        logOutButton.setBackground(new java.awt.Color(0, 102, 102));
        logOutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plainMainBarLayout = new javax.swing.GroupLayout(plainMainBar);
        plainMainBar.setLayout(plainMainBarLayout);
        plainMainBarLayout.setHorizontalGroup(
            plainMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plainMainBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addContainerGap())
        );
        plainMainBarLayout.setVerticalGroup(
            plainMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plainMainBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(plainMainBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logOutButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainScreenLayout = new javax.swing.GroupLayout(pnlMainScreen);
        pnlMainScreen.setLayout(pnlMainScreenLayout);
        pnlMainScreenLayout.setHorizontalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plainMainBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashboard)
                .addContainerGap())
        );
        pnlMainScreenLayout.setVerticalGroup(
            pnlMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainScreenLayout.createSequentialGroup()
                .addComponent(plainMainBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dashboard)
                .addContainerGap())
        );

        pnlLoginScreen.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlLoginScreen.setMaximumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setMinimumSize(new java.awt.Dimension(1130, 514));
        pnlLoginScreen.setPreferredSize(new java.awt.Dimension(1366, 968));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IoT/resources/Screenshot 2025-01-18 at 15.14.37.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Sign in to IoT Management System");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Please enter the log in details below.");

        userNameTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        userNameTxtField.setForeground(new java.awt.Color(0, 51, 102));
        userNameTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        passWordTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        passWordTxtField.setForeground(new java.awt.Color(0, 51, 102));
        passWordTxtField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        logInButton.setBackground(new java.awt.Color(0, 51, 102));
        logInButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Forget your password");

        errorLogLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        errorLogLabel.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout pnlLoginScreenLayout = new javax.swing.GroupLayout(pnlLoginScreen);
        pnlLoginScreen.setLayout(pnlLoginScreenLayout);
        pnlLoginScreenLayout.setHorizontalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginScreenLayout.createSequentialGroup()
                                .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(logInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addComponent(passWordTxtField)
                                        .addComponent(userNameTxtField)))
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginScreenLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(224, 224, 224))))
                    .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(errorLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlLoginScreenLayout.setVerticalGroup(
            pnlLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginScreenLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(errorLogLabel)
                .addGap(18, 18, 18)
                .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(passWordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 514));
        setSize(new java.awt.Dimension(1130, 514));

        pnlLoadingScreen.setBackground(new java.awt.Color(14, 41, 69));
        pnlLoadingScreen.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/IoT/resources/Screenshot 2025-01-17 at 19.56.14.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
        );

        jProgressBar1.setBackground(new java.awt.Color(14, 209, 209));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loading......");

        javax.swing.GroupLayout pnlLoadingScreenLayout = new javax.swing.GroupLayout(pnlLoadingScreen);
        pnlLoadingScreen.setLayout(pnlLoadingScreenLayout);
        pnlLoadingScreenLayout.setHorizontalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoadingScreenLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(228, 228, 228))
        );
        pnlLoadingScreenLayout.setVerticalGroup(
            pnlLoadingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadingScreenLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLoadingScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // Get the username and password input
        String username = userNameTxtField.getText();
        String password = new String(passWordTxtField.getPassword());

        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            errorLogLabel.setText("Please enter your username and password.");
        } // Check if username and password are incorrect
        else if (!username.equals("admin") || !password.equals("admin")) {
            errorLogLabel.setText("Username and password mismatch.");
        } // If credentials are correct, proceed to load the main screen
        else {
            errorLogLabel.setText(""); // Clear any previous error messages
            loadScreen("MainScreen"); // Load the main screen
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        passWordTxtField.setText("");
        userNameTxtField.setText("");
        loadScreen("LoginScreen"); // Load the main screen
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        boolean isValid = true;

        // Validate DeviceId
        isValid &= validateField(
        devIdTxtField, "Device Id", devIdLabel, "Must be a valid Device ID.",
        errorColor, yellowColor, ValidationUtil.isValidDevId(devIdTxtField.getText())
);

// Validate Serial Number
        isValid &= validateField(
        serialNumberTxtField, "Serial Number", serialLabel, "Must be between 4 and 20 characters.",
        errorColor, yellowColor, ValidationUtil.isValidSerialNumber(serialNumberTxtField.getText())
);

// Validate Device Name
isValid &= validateField(
        devNameTxtField, "Device Name", devNameLabel, "Must be valid Name.",
        errorColor, yellowColor, ValidationUtil.isValidDevName(devNameTxtField.getText())
);

// Validate Device Type
isValid &= validateField(
        devTypeTxtField, "Device Type", devTypeLabel, "Must be one of: sensor, microprocessor, electric.",
        errorColor, yellowColor, ValidationUtil.isValidType(devTypeTxtField.getText())
);

// Validate Amount
isValid &= validateField(
        amtTxtField, "Amount", amountLabel, "Must be a valid amount.",
        errorColor, yellowColor, ValidationUtil.isValidAmount(amtTxtField.getText())
);

// Validate Quantity
isValid &= validateField(
        quantityTxtField, "Quantity", quantityLabel, "Must be a valid quantity.",
        errorColor, yellowColor, ValidationUtil.isValidQuantity(quantityTxtField.getText())
);

// Validate Total
isValid &= validateField(
        totalTxtField, "Total", totalLabel, "Must be a valid total.",
        errorColor, yellowColor, ValidationUtil.isValidTotal(totalTxtField.getText())
);




        

        if (isValid) {
            // Create a StudentModel instance
        DeviceModel newDevice = new DeviceModel(
        Integer.parseInt(devIdTxtField.getText().trim()),
        serialNumberTxtField.getText().trim(),
        devNameTxtField.getText().trim(),
        devTypeTxtField.getText().trim(),
        Integer.parseInt(quantityTxtField.getText().trim()),
        Integer.parseInt(amtTxtField.getText().trim()),
        Integer.parseInt(totalTxtField.getText().trim())
);

            // Check for duplicate LMU ID
            if (checkDuplicateDevice(newDevice)) {
                devIdTxtField.setBorder(createTitledBorder(errorColor, "Device ID"));
                showDialogBox("Device ID already exists.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
            } else {
                // Add the student if no duplicate is found
                deviceList.add(newDevice);
                clearDeviceForm();
                loadListToTable(deviceList);
                devIdTxtField.setBorder(createTitledBorder(yellowColor, "Device ID"));
                showDialogBox("Device added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_addButtonActionPerformed

    private void devIdSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devIdSortBtnActionPerformed
        List<DeviceModel> sortedList = selectionSort.sortByDevID(deviceList, false);
        loadListToTable(sortedList);
    }//GEN-LAST:event_devIdSortBtnActionPerformed

    private void devNameMergeSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devNameMergeSortBtnActionPerformed
        // Sort the device list by devId in ascending order (false for ascending)
        List<DeviceModel> sortedList = mergeSort.sortByDevName(deviceList, false);

    // Load the sorted list into the table
         loadListToTable(sortedList);
    }//GEN-LAST:event_devNameMergeSortBtnActionPerformed

    private void TotalInsertionSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalInsertionSortBtnActionPerformed
        // Sort the deviceList using InsertionSort in ascending order (false indicates ascending)
        List<DeviceModel> sortedList = insertionSort.sortByTotal(deviceList);

         // Load the sorted list to the table
        loadListToTable(sortedList);
    }//GEN-LAST:event_TotalInsertionSortBtnActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchTerm = searchTxtField.getText().trim(); // Get the search term from the text field

    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a device type to search.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Filter the deviceList based on the devType
    List<DeviceModel> filteredList = new LinkedList<>();
    for (DeviceModel device : deviceList) {
        if (device.getType().equalsIgnoreCase(searchTerm)) {
            filteredList.add(device);
        }
    }

    // Load the filtered list into the table
    if (filteredList.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No devices found with the specified type.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    } else {
        loadListToTable(filteredList);
    }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
        // Get the devId from the text field
    String devIdText = devIdTxtField.getText().trim();

    // Validate the input
    if (devIdText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Device ID to fetch.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        int devId = Integer.parseInt(devIdText); // Convert the input to an integer

        // Search for the device in the deviceList
        DeviceModel foundDevice = null;
        for (DeviceModel device : deviceList) {
            if (device.getDevId() == devId) {
                foundDevice = device;
                break;
            }
        }

        // If the device is found, populate the text fields
        if (foundDevice != null) {
            serialNumberTxtField.setText(foundDevice.getSerialNumber());
            devNameTxtField.setText(foundDevice.getDevName());
            devTypeTxtField.setText(foundDevice.getType());
            quantityTxtField.setText(String.valueOf(foundDevice.getQuantity()));
            amtTxtField.setText(String.valueOf(foundDevice.getAmount()));
            totalTxtField.setText(String.valueOf(foundDevice.getTotal()));
        } else {
            // If no device is found, show a message
            JOptionPane.showMessageDialog(this, "No device found with the specified Device ID.", "Fetch Result", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // Handle the case where the input is not a valid integer
        JOptionPane.showMessageDialog(this, "Please enter a valid Device ID.", "Input Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_fetchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         // Get the devId from the text field
    String devIdText = devIdTxtField.getText().trim();

    // Validate the input
    if (devIdText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Device ID to delete.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        int devId = Integer.parseInt(devIdText); // Convert the input to an integer

        // Search for the device in the deviceList
        DeviceModel deviceToDelete = null;
        for (DeviceModel device : deviceList) {
            if (device.getDevId() == devId) {
                deviceToDelete = device;
                break;
            }
        }

        // If the device is found, remove it from the list and update the table
        if (deviceToDelete != null) {
            deviceList.remove(deviceToDelete); // Remove from the list
            loadListToTable(deviceList); // Refresh the table
            clearDeviceForm(); // Clear the input fields
            JOptionPane.showMessageDialog(this, "Device deleted successfully.", "Delete Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If no device is found, show a message
            JOptionPane.showMessageDialog(this, "No device found with the specified Device ID.", "Delete Result", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // Handle the case where the input is not a valid integer
        JOptionPane.showMessageDialog(this, "Please enter a valid Device ID.", "Input Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         // Get the devId from the text field
    String devIdText = devIdTxtField.getText().trim();

    // Validate the input
    if (devIdText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Device ID to update.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        int devId = Integer.parseInt(devIdText); // Convert the input to an integer

        // Search for the device in the deviceList
        DeviceModel deviceToUpdate = null;
        for (DeviceModel device : deviceList) {
            if (device.getDevId() == devId) {
                deviceToUpdate = device;
                break;
            }
        }

        // If the device is found, update its attributes
        if (deviceToUpdate != null) {
            // Update the device's attributes with the values from the text fields
            deviceToUpdate.setSerialNumber(serialNumberTxtField.getText().trim());
            deviceToUpdate.setDevName(devNameTxtField.getText().trim());
            deviceToUpdate.setType(devTypeTxtField.getText().trim());
            deviceToUpdate.setQuantity(Integer.parseInt(quantityTxtField.getText().trim()));
            deviceToUpdate.setAmount(Integer.parseInt(amtTxtField.getText().trim()));
            deviceToUpdate.setTotal(Integer.parseInt(totalTxtField.getText().trim()));

            // Refresh the table to show the updated data
            loadListToTable(deviceList);
            JOptionPane.showMessageDialog(this, "Device updated successfully.", "Update Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // If no device is found, show a message
            JOptionPane.showMessageDialog(this, "No device found with the specified Device ID.", "Update Result", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // Handle the case where the input is not a valid integer
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Quantity, Amount, and Total.", "Input Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_updateButtonActionPerformed
    
    /**
     * Populates the JTable with the current list of student records. Clears
     * existing rows in the table model before adding new data.
     */
    private void loadListToTable(List<DeviceModel> deviceList) {
        DefaultTableModel model = (DefaultTableModel) tblDevice.getModel();

        // Clear existing rows if needed
        model.setRowCount(0);

        // Populate the table with student data
        deviceList.forEach(device -> model.addRow(new Object[]{
            device.getDevId(),
            device.getSerialNumber(),
            device.getDevName(),
            device.getType(),
            device.getQuantity(),
            device.getAmount(),
            device.getTotal(),
            
        }));
    }

    /**
     * Validates a single input field based on specific criteria and updates its
     * visual state.
     *
     * @param textField the JTextField to validate
     * @param fieldName the name of the field for error display
     * @param errorLbl the JLabel to show error messages
     * @param errorMsg the error message to display for invalid input
     * @param errorColor the color for error borders and text
     * @param successColor the color for successful validation borders
     * @param isValidFormat whether the input satisfies the field-specific
     * validation criteria
     * @return true if the field passes validation, false otherwise
     */
    private boolean validateField(JTextField textField, String fieldName, JLabel errorLbl, String errorMsg, Color errorColor, Color successColor, boolean isValidFormat) {
        if (ValidationUtil.isNullOrEmpty(textField.getText())) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText("Field cannot be empty!");
            errorLbl.setVisible(true);
            return false;
        } else if (!isValidFormat) {
            textField.setBorder(createTitledBorder(errorColor, fieldName));
            errorLbl.setText(errorMsg);
            errorLbl.setVisible(true);
            return false;
        } else {
            textField.setBorder(createTitledBorder(successColor, fieldName));
            errorLbl.setVisible(false);
            return true;
        }
    }

    /**
     * Creates a custom TitledBorder with specified color and title.
     *
     * @param color the color for the border and title
     * @param title the title text for the border
     * @return a TitledBorder instance
     */
    private javax.swing.border.TitledBorder createTitledBorder(Color color, String title) {
        return javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(color, 2),
                title,
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 12),
                color
        );
    }

    /**
     * Displays a message dialog box with the given message, title, and type.
     *
     * @param message the message to display
     * @param title the title of the dialog box
     * @param messageType the type of message (e.g., information, warning, or
     * error)
     */
    private void showDialogBox(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }

    /**
     * Clears all input fields in the student form. Resets each field's value to
     * an empty string.
     */
    private void clearDeviceForm() {
        devIdTxtField.setText("");
        serialNumberTxtField.setText("");
        quantityTxtField.setText("");
        amtTxtField.setText("");
        totalTxtField.setText("");
        devNameTxtField.setText("");
        devTypeTxtField.setText("");
    }

    /**
     * Checks whether a student with the same LMU ID already exists in the
     * student list.
     *
     * @param student the StudentModel object to check for duplicates
     * @return true if a duplicate is found, false otherwise
     */
    private boolean checkDuplicateDevice(DeviceModel device) {
        return deviceList.stream()
                .anyMatch(existingDevice
                        -> existingDevice.getDevId() == device.getDevId());
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see  
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        IoT app = new IoT();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            app.setVisible(true);
        });

        app.startProgress();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Dashboard;
    private javax.swing.JButton TotalInsertionSortBtn;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amtTxtField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel devIdLabel;
    private javax.swing.JButton devIdSortBtn;
    private javax.swing.JTextField devIdTxtField;
    private javax.swing.JLabel devNameLabel;
    private javax.swing.JButton devNameMergeSortBtn;
    private javax.swing.JTextField devNameTxtField;
    private javax.swing.JLabel devTypeLabel;
    private javax.swing.JTextField devTypeTxtField;
    private javax.swing.JLabel errorLogLabel;
    private javax.swing.JButton fetchButton;
    private javax.swing.JPanel heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logInButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPasswordField passWordTxtField;
    private javax.swing.JPanel plainMainBar;
    private javax.swing.JPanel pnlLoadingScreen;
    private javax.swing.JPanel pnlLoginScreen;
    private javax.swing.JPanel pnlMainScreen;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTxtField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JLabel serialLabel;
    private javax.swing.JTextField serialNumberTxtField;
    private javax.swing.JTable tblDevice;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userNameTxtField;
    // End of variables declaration//GEN-END:variables
}
