package collections_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {

		System.out.println("Crie um dicionario que relacione os modelos de seus repsctivos carros");
		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("gol", 14.4);
				put("golf", 15.6);
				put("jetta", 16.1);
				put("polo", 12.1);
				put("celtão", 20.1);
			}
		};
		System.out.println(carrosPopulares);

		System.out.println("Substitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);

		System.out
				.println("Confira se o modelo Tucson está dentro do obejto: " + carrosPopulares.containsKey("tucson"));

		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("golf"));

		System.out.println("Exiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);

		System.out.println("Exiba os consumos do carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);

		System.out.println("Exiba o modelos mais eficiente: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";

		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}
		
		
		System.out.println("Exiaba o modelos menos economico: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
			
		} 
		
		
		System.out.println("Exiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while (iterator.hasNext()) {
			soma += iterator.next();
			
		}
		System.out.println(soma);
		
		
		System.out.println("Exiba a media deste dicionario: " + soma/carrosPopulares.size());
		
		
		System.out.println("Remova os modelos com o consumo igual a 15.6");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		
		System.out.println("Exiba todos os carros na ordem que foram inseridos: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
			{
				put("gol", 14.4);
				put("golf", 15.6);
				put("jetta", 16.1);
				put("polo", 12.1);
				put("celtão", 20.1);
			}
		};
		System.out.println(carrosPopulares1);
		
		
		System.out.println("Exiba os carros de acordo com o modelo: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		
		System.out.println("Apague o dicionario de carro: ");
		carrosPopulares.clear();
		
		
		System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());
		
		
		
	}

}
