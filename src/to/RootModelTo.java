package to;

import java.util.ArrayList;
import java.util.List;

// Группа технологий со своим кодом
public class RootModelTo {
    public RootModelTo(String rootCode) {
        this.rootCode = rootCode;
    }

    private String rootCode;
    private List<TechModelTo> techList = new ArrayList<>();

    public String getRootCode() {
        return rootCode;
    }

    public void setRootCode(String rootCode) {
        this.rootCode = rootCode;
    }

    public List<TechModelTo> getTechList() {
        return techList;
    }

    public void setTechList(List<TechModelTo> techList) {
        this.techList = techList;
    }

    @Override
    public String toString() {
        return "RootModelTo{" +
                "rootCode='" + rootCode + '\'' +
                ", techList=" + techList +
                '}';
    }
}
