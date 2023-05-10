package pdf2ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lector {
	public static ArrayList<Worker> createWorkersList() {
		ArrayList<Worker> workersList = new ArrayList<Worker>();
		Path file = Paths.get("files/trabajadores.txt");

		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			System.out.println("Reading workers file please stand by...");
			String line = null;
			while ((line = br.readLine()) != null) {
				String name = line;
				workersList.add(new Worker(line));
			}
			System.out.println("Reading done, list of workers created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workersList;
	}

	public static void createTotalPeonadas(ArrayList<Worker> lista) {
		ArrayList<Worker> workersList = new ArrayList<Worker>();
		workersList = lista;
		Path file = Paths.get("files/peonadas.txt");
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			String line = null;
			String[] filtered = null;
			while ((line = br.readLine()) != null) {
				filtered = line.split("[:,]");
				for (int i = 0; i < workersList.size(); i++) {
					for (int j = 0; j < filtered.length; j++) {
						if (workersList.get(i).getNombre().equals(filtered[j])) {
							workersList.get(i).setPeonadas();
						}
					}
				}

			}
			System.out.println("Generating file please wait");
			Path fileGenerated = Paths.get("files/totalPeonadas.txt");
			try (BufferedWriter bw = Files.newBufferedWriter(fileGenerated, StandardCharsets.UTF_8)) {
				for (Worker lineaWorkersList : workersList) {
					bw.write(lineaWorkersList.toString()+"\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static void main(String[] args) {
		createTotalPeonadas(createWorkersList());
	}
}
