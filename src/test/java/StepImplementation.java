import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;

import java.io.File;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

public class StepImplementation {

    @Step("在所有场景之前执行")
    public void beforeExec(){
        System.out.println("开始执行测试");
    }


    @Step("计算下列数据表中a加b的值 <表>")
    public void stepWithTable1(Table table) {
        List<List<String>> rows = table.getRows();
      for (List<String> row : rows) {
          int c= Integer.parseInt(row.get(0))+Integer.parseInt(row.get(1));
          System.out.println(c+"------------------");
      }

    }
    @Step("计算csv文件中a列和b列的值 <table>")
    public void sumCsvfile(Table table) {
        List<List<String>> rows = table.getRows();
        for (List<String> row : rows) {
            int c= Integer.parseInt(row.get(0))+Integer.parseInt(row.get(1));
            System.out.println(c);
        }

    }
    @Step("计算<a>加<b>的值")
    public void summary(int a, int b) {
        int c=a+b;
        System.out.println(c);
        Assert.assertEquals("a+b",c,4);
    }

}
