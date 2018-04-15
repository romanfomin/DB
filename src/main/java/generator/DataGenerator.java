package generator;

import generator.POJO.*;
import generator.POJO.column.OptionActivation;
import generator.POJO.column.TariffActivation;
import generator.POJO.column.UsagePerMonth;
import generator.POJO.document.*;
import generator.POJO.graph.*;
import generator.customAnnotation.impl.OperatorGenerator;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private final int usersNumber = 2000000;
    private final int operatorsNumber = OperatorGenerator.getOperatorsNumber();
    private final int optionsNumber = 40;
    private final int citiesNumber = 50;
    private final int tariffsNumber = 40;

    private final int tariffsActivationNumber = usersNumber;
    private final int optionsActivationNumber = usersNumber;
    private final int usagePerMonthNumber = usersNumber;

    private final int fromCityRelNumber = usersNumber;
    private final int hasTariffRelNumber = 100;
    private final int hasOptionRelNumber = 300;

    private List<Integer> usersId;
    private List<Integer> operatorsId;
    private List<Integer> optionsId;
    private List<Integer> citiesId;
    private List<Integer> tariffsId;

    private List<OptionActivation> optionActivations;
    private List<TariffActivation> tariffActivations;
    private List<UsesOptionRel> usesOptionRels = new ArrayList<>();
    private List<UsesTariffRel> usesTariffRels = new ArrayList<>();
    private List<UsesOperatorRel> usesOperatorRels = new ArrayList<>();

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
        tariffActivations = generateColumnObject(TariffActivation.class, tariffsActivationNumber);
        optionActivations = generateColumnObject(OptionActivation.class, optionsActivationNumber);
        generateColumnObject(UsagePerMonth.class, usagePerMonthNumber);


        /* generate data for graph */
        generateObject(FromCityRel.class, fromCityRelNumber);
        generateObject(HasOptionRel.class, hasOptionRelNumber);
        generateObject(HasTariffRel.class, hasTariffRelNumber);

        for (TariffActivation ta : tariffActivations) {
            usesOperatorRels.add(new UsesOperatorRel(ta.getId(), ta.getOperatorId()));
        }
        exporter.export(usesOperatorRels);
        usesOperatorRels.clear();

        for (TariffActivation ta : tariffActivations) {
            usesTariffRels.add(new UsesTariffRel(ta.getId(), ta.getTariffId()));
        }
        exporter.export(usesTariffRels);
        tariffActivations.clear();
        usesTariffRels.clear();

        for (OptionActivation oa : optionActivations) {
            usesOptionRels.add(new UsesOptionRel(oa.getId(), oa.getOptionId()));
        }
        exporter.export(usesOptionRels);
        optionActivations.clear();
        usesOptionRels.clear();
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

    private <T extends DBObject> List<T> generateColumnObject(Class<T> tClass, int amount) {
        List<T> tList = factory.produce(tClass, amount);
        exporter.export(tList);
        return tList;
    }
}
