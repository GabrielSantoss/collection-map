package collections_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

	}

}
