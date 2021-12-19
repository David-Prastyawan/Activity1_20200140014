/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.java.tabel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author David Prastyawan
 */

@Controller
public class projectController{
    
    @RequestMapping("/tabeljson")
    public String getTable(Model Data){
        
    ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID","No.KTP","Nama","Alamat"));
        data.add(Arrays.asList("01","8256202001","David","Banyuwangi"));
        data.add(Arrays.asList("02","8256202002","Asra","Jambi"));
        data.add(Arrays.asList("03","8256202003","Raffi","Yogyakarta"));
        data.add(Arrays.asList("04","8256202004","Indra","Kalimantan"));
        data.add(Arrays.asList("05","8256202005","Abid","Jambi"));
        data.add(Arrays.asList("06","8256202006","Yoga","Palembang"));
        data.add(Arrays.asList("07","8256202007","Erik","Batam"));
        data.add(Arrays.asList("08","8256202008","Nopal","Aceh"));
        data.add(Arrays.asList("09","8256202009","Fikar","Maluku"));
        data.add(Arrays.asList("10","8256202010","Pandi","Jambi"));
        data.add(Arrays.asList("11","8256202011","Rosi","Kalimantan"));
        data.add(Arrays.asList("12","8256202012","Fajar","Purworejo"));
        data.add(Arrays.asList("13","8256202013","Zairon","Palembang"));
        data.add(Arrays.asList("14","8256202014","Eko","Boyolali"));
        data.add(Arrays.asList("15","8256202015","Hamdan","Bandung"));
        data.add(Arrays.asList("16","8256202016","Baim","Bogor"));
        data.add(Arrays.asList("17","8256202017","Saripudin","Palembang"));
        data.add(Arrays.asList("18","8256202018","Nando","NTT"));
        data.add(Arrays.asList("19","8256202019","Bagas","Boyolali"));
        data.add(Arrays.asList("20","8256202020","Alan","Banyuwangi"));
        
        Data.addAttribute("table", data);                
        return "tableview";
    }    
}
