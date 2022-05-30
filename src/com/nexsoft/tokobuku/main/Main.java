package com.nexsoft.tokobuku.main;

import java.util.ArrayList;
import java.util.List;

import com.nexsoft.tokobuku.Controller;
import com.nexsoft.tokobuku.Label;
import com.nexsoft.tokobuku.ModelBuku;
import com.nexsoft.tokobuku.MultiLineLabel;
import com.nexsoft.tokobuku.UIManager;
import com.nexsoft.tokobuku.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UIManager manager = new UIManager();
		List<ModelBuku> lstBuku = new ArrayList<ModelBuku>();
		ModelBuku buku1 = new ModelBuku("KKN di desa Penyanyi", "12345", 15000, "Intan", "PT Buku Bajakan");
		ModelBuku buku2 = new ModelBuku("Stranger Things", "23456", 20000, "Antoni", "PT Buku Asli");
		
		lstBuku.add(buku1);
		lstBuku.add(buku2);
		
		Controller controller = new Controller(manager, lstBuku);
		controller.start();
	}
}
