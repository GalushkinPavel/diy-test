package to;

import java.util.ArrayList;
import java.util.List;

//  Технология - набор материалов
public class TechModelTo {
    public TechModelTo(String techCode) {
        this.techCode = techCode;
    }

    private String techCode;
    private List<MaterialTo> rowTos = new ArrayList<>();

    public String getTechCode() {
        return techCode;
    }

    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }

    public List<MaterialTo> getRowTos() {
        return rowTos;
    }

    public void setRowTos(List<MaterialTo> rowTos) {
        this.rowTos = rowTos;
    }

    @Override
    public String toString() {
        return "TechModelTo{" +
                "techCode='" + techCode + '\'' +
                ", rowTos=" + rowTos +
                '}';
    }
}
