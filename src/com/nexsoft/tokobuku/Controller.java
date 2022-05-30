package com.nexsoft.tokobuku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	
	UIManager manager;
	List<ModelBuku> buku;
	
	public Controller() {
		
	}
	
	public Controller (UIManager manager, List<ModelBuku> buku) {
		this.manager = manager;
		this.buku = buku;
	}
	
	public void start() {
		MenuUI();
	}
	
	public void Pilih() {
		System.out.println("Masukkan pilihan anda : ");
		Scanner in = new Scanner(System.in);
		int pilih = in.nextInt();
		
		switch(pilih) {
		case 1: 
		TambahBuku();
			
		break;
		case 2:
		LihatBuku();
			
		break;
		case 3:
		System.out.println("Program berakhir, Terima kasih :D");
		System.exit(0);
		break;
		default:
		}
	}
	
	public void MenuUI() {
		View canvas = new View("canvas1", 5, 1);
		List<String> menu = new ArrayList<String>();
		menu.add(" 1. Tambah Buku    ");
		menu.add(" 2. List Buku    ");
		menu.add(" 3. Keluar    ");
		MultiLineLabel multi = new MultiLineLabel(menu);
		
		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());
		
		manager.addView(canvas);
		
		manager.render();
		Pilih();
	}
	
	public void TambahBuku() {
		Scanner in = new Scanner(System.in);
	
		View canvas = new View();
	
		ModelBuku model = new ModelBuku();
	
		canvas.addComponent(HeaderUI());
		
		canvas.addComponent(new Label("Judul Buku ->"));
		
		manager.addView(canvas);
		manager.render();
	
		String judul = in.nextLine();

		model.setJudulBuku(judul);
		canvas.addComponent(new Label(judul));
	
		canvas.addComponent(new Label("ISBN ->"));
		manager.render();
		String isbn = in.nextLine();
	
		model.setIsbn(isbn);
		canvas.addComponent(new Label(isbn));
	
		canvas.addComponent(new Label("Harga ->"));
		manager.render();
		int harga = in.nextInt();
	
		model.setHarga(harga);
		canvas.addComponent(new Label("Rp " + String.valueOf(harga)));
		manager.render();
		
		buku.add(model);
		
		MenuUI();
	}
	
	public void LihatBuku() {
		View canvas = new View();
		List<String> menu = new ArrayList<String>();
		List<String> menuAwal = new ArrayList<String>();
		
		int x = 1;
		for (ModelBuku book : buku) {
			menu.add(x + " " + book.getJudulBuku() + " Rp. " + book.getHarga());
			x++;
		}
		
		MultiLineLabel multi = new MultiLineLabel(menu);
		
		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());
		
		manager.addView(canvas);
		manager.render();
		
		menuAwal.add(" 1. Tambah Buku    ");
		menuAwal.add(" 2. List Buku    ");
		menuAwal.add(" 3. Keluar    ");
		
		MultiLineLabel multiAwal = new MultiLineLabel(menuAwal);
		canvas.addComponent(multiAwal);
		manager.addView(canvas);
		manager.render();
		
		Pilih();
	}
	
	public MultiLineLabel HeaderUI() {
		
		List<String> header = new ArrayList<String>();
		header.add("                        ");
		header.add("       Toko Buku        ");
		header.add("                        ");
		MultiLineLabel multi = new MultiLineLabel(header);
		return multi;
	}
	
	public MultiLineLabel FooterUI() {
		
		List<String> footer = new ArrayList<String>();
		footer.add("                        ");
		footer.add("    Jalan Buntu no 10   ");
		footer.add("                        ");
		MultiLineLabel multi = new MultiLineLabel(footer);
		return multi;
	}
	
}
