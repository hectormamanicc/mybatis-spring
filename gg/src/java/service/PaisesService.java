/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import domain.Paises;
import java.util.List;
/**
 *
 * @author Hector Mamani CC
 */
public interface PaisesService {
    public List<Paises> query();
    public Paises get(Integer idcat);
    public String insert(Paises paises);
    public String update (Paises paises);
    public String delete(Integer idpais);
}
