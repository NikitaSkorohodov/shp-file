/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;


import enyity.Product;
import enyity.Client;
import enyity.Oborot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author NikitaSkr
 */
public class DataManeger {
    private final String PRODUCT_FILE = "files/Product";
    private final String CLIENTS_FILE = "files/Clients";
    private final String SUMM_FILE = "files/Summ";
    
    public DataManeger() {
        File file = new File("files");
        file.mkdirs();
    }
    public void saveBooks(Product[] products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCT_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла products");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
    public Product[] loadProducts() {
        Product[] products = new Product[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(PRODUCT_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (Product[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла Product");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс");
        }
        return products;
    }
     public void saveClients(Client[] clients) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(CLIENTS_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clients);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла MyReaders");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
     public Client[] loadClients() {
        Client[] clients = new Client[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(CLIENTS_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clients = (Client[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла MyBooks");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс");
        }
        return clients;
    }
     public void saveSumma(Oborot [] oborots) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(SUMM_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(oborots);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла products");
       } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода");
        }
    }
    public Oborot[] loadSumma() {
        Oborot[] oborots = new Oborot[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(SUMM_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            oborots = (Oborot[]) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет файла Product");
        } catch (IOException ex) {
           System.out.println("Ошибка ввода/вывода");
       } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс");
        }
        return oborots;
    }

}
