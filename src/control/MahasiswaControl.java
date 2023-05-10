package control;

import java.util.List;
import dao.MahasiswaDAO;
import entity.Mahasiswa;
import table.TableMahasiswa;

public class MahasiswaControl {
    private MahasiswaDAO mDao = new MahasiswaDAO();
    
    
    
    public TableMahasiswa showMahasiswa(String query){
        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
        TableMahasiswa tableMahasiswa = new TableMahasiswa(dataMahasiswa);

        return tableMahasiswa;
    }
    
    public void insertDataMahasiswa(Mahasiswa m){
        
    }
    
    public void updateDataMahasiswa(Mahasiswa m){
        
    }

    public void deleteDataMahasiswa(String npm){
        
    }
    
}


