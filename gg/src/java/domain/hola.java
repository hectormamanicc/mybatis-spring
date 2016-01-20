/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import mybatis.mapper.PaisesMapper;
import service.impl.PaisesServiceImpl;

/**
 *
 * @author Hector Mamani CC
 */
public class hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesServiceImpl daw= new PaisesServiceImpl();
        System.out.println("wwwwa"+daw.query());
        // TODO code application logic here
    }
    
}
