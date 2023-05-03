/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author ASUS
 */
import java.util.List;
import dao.ProdiDao;
import entity.Prodi;

public class ProdiControl {
    
    private ProdiDao pDao = new ProdiDao();
    
    
    public void insertDataProdi(Prodi p) {
        pDao.insertProdi(p);
    }

    
    public String showDataProdi() {

        List<Prodi> dataProdi = pDao.showProdi();

        String prodiString = "";

        for (int i=0; i < dataProdi.size(); i++) {
            prodiString = prodiString + dataProdi.get(i).getKodeProdi() + " || " 
                    + dataProdi.get(i).getNamaProdi() + "\n";
        }

        return prodiString;
    }
    
    public void updateDataProdi(Prodi p){
        //TODO
    }
    
    public void DeleteDataProdi(Prodi p){
        //TODO
    }
    
    public void searchDataProdi(Prodi p){
        //TODO
    }

}

