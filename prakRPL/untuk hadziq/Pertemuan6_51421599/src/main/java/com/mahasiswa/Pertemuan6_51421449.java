/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mahasiswa;

import com.mahasiswa.controller.MahasiswaController;
import com.mahasiswa.service.MahasiswaService;
import com.mahasiswa.view.MahasiswaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
/**
 *
 * @author ACER
 */

@SpringBootApplication
public class Pertemuan6_51421449 implements ApplicationRunner {
     @Autowired
     private MahasiswaService mahasiswaService;
     
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Pertemuan6_51421449.class, args);
        
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        MahasiswaView mahasiswaView = new MahasiswaView(controller);
        mahasiswaView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    }
}
