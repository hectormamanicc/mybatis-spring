/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;
import domain.Paises;
import java.util.List;
import mybatis.mapper.PaisesMapper;
import service.PaisesService;

/**
 *
 * @author Hector Mamani CC
 */
public class PaisesServiceImpl implements PaisesService {
    private PaisesMapper paisesMapper;
    public void setPaisesMapper(PaisesMapper paisesMapper){
    this.paisesMapper=paisesMapper;
    }
    
    

    @Override
    public List<Paises> query() {
   List<Paises> list = paisesMapper.query();
return list;

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paises get(Integer idcat) {
       Paises paises = paisesMapper.get(idcat);
       return paises;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(Paises paises) {
       String result=null;
       int ctos= paisesMapper.insert(paises);
       if(ctos==0){
       result="0 filas detectadas";
       }
       
       
return result;        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(Paises paises) {
       String result=null;
       int ctos= paisesMapper.update(paises);
       if(ctos==0){
       result="0 filas detectadas";
        
//To change body of generated methods, choose Tools | Templates.
    }
    return result; 
    }

    @Override
    public String delete(Integer idpais) {
      String result=null;
       int ctos= paisesMapper.delete(idpais);
       if(ctos==0){
       result="0 filas detectadas"; //To change body of generated methods, choose Tools | Templates.
    }
      return result;  
}
}
