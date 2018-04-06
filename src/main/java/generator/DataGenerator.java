package generator;

import generator.POJO.*;
import generator.POJO.column.OptionActivation;
import generator.POJO.column.TarifActivation;
import generator.POJO.column.UsagePerMonth;
import generator.POJO.document.*;
import generator.POJO.graph.FromCityRel;
import generator.customAnnotation.impl.OperatorGenerator;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private final int usersNumber = 20;
    private final int operatorsNumber = OperatorGenerator.getOperatorsNumber();
    private final int optionsNumber = 40;
    private final int citiesNumber = 50;
    private final int tariffsNumber = 40;

    private final int tariffsActivationNumber = usersNumber;
    private final int optionsActivationNumber = optionsNumber;
    private final int usagePerMonthNumber = usersNumber;

    private final int fromCityRelNumber = usersNumber;

    private List<Integer> usersId = new ArrayList<>(usersNumber);
    private List<Integer> operatorsId = new ArrayList<>(operatorsNumber);
    private List<Integer> optionsId = new ArrayList<>(optionsNumber);
    private List<Integer> citiesId = new ArrayList<>(citiesNumber);
    private List<Integer> tariffsId = new ArrayList<>(tariffsNumber);

    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new CsvExporter();

    public void generate() {

        /* generate data for document-oriented */
        usersId = generateObject(User.class, usersNumber);
        operatorsId = generateObject(Operator.class, operatorsNumber);
        optionsId = generateObject(Option.class, optionsNumber);
        citiesId = generateObject(City.class, citiesNumber);
        tariffsId = generateObject(Tariff.class, tariffsNumber);

        /* generate data for column-oriented */
        generateObject(TarifActivation.class, tariffsActivationNumber);
        generateObject(OptionActivation.class, optionsActivationNumber);
        generateObject(UsagePerMonth.class, usagePerMonthNumber);

        /* generate data for graph */
        generateObject(FromCityRel.class, fromCityRelNumber);

    }

    private <T extends DBObject> List<Integer> generateObject(Class<T> tClass, int amount) {
        List<T> tList = factory.produce(tClass, amount);
        List<Integer> ids = new ArrayList<>(amount);
        exporter.export(tList);
        for (T tObj : tList) {
            ids.add(tObj.getId());
        }
        return ids;
    }
}
