package generator;

import generator.POJO.DBObject;
import generator.POJO.Operator;
import generator.POJO.User;
import generator.customAnnotation.OperatorGenerator;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private final int usersNumber = 20;
    private final int operatorsNumber = OperatorGenerator.getOperatorsNumber();

    private List<Integer> usersId = new ArrayList<>(usersNumber);
    private List<Integer> operatorsId = new ArrayList<>(operatorsNumber);

    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new CsvExporter();

    public void generate() {

        usersId = generateObject(User.class, usersNumber);
        operatorsId = generateObject(Operator.class, operatorsNumber);

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
