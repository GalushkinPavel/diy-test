import to.MaterialTo;
import to.RootModelTo;
import to.TechModelTo;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class ViewModelsConverter {

    // Сюда приходит список:  TECHNOLOGY,MATERIAL,MATERIAL,..,MATERIAL
    public static TechModelTo toTechModel(List<RowModel> source) {
        TechModelTo result = null;
        for (RowModel rowModel : source) {
            switch (rowModel.getPositionType()) {
                case ROOT -> throw new IllegalArgumentException();
                case TECHNOLOGY -> {
                    if (result != null) throw new IllegalArgumentException();
                    result = new TechModelTo(rowModel.getAnyCode());
                }
                case MATERIAL -> {
                    if (result == null) throw new IllegalArgumentException();
                    result.getRowTos().add(new MaterialTo(rowModel.getAnyCode()));
                }
            }
        }
        return result;
    }

    // Сюда приходит список:  ROOT,TECHNOLOGY,MATERIAL,MATERIAL,..,MATERIAL, [ROOT,TECHNOLOGY,MATERIAL,MATERIAL,..,MATERIAL], ...
    public static List<RootModelTo> toRootModels(List<RowModel> source) {
        if (source.isEmpty()) return emptyList();

        // TODO - реализовать
        List<RootModelTo> roots = new ArrayList<>();
        for (RowModel rowModel : source) {
            switch (rowModel.getPositionType()) {
                case ROOT -> {
                    roots.add(new RootModelTo(rowModel.getAnyCode()));
                }
                case TECHNOLOGY -> {
                    if (roots.isEmpty()) throw new IllegalArgumentException();
                    roots.get(roots.size() - 1).getTechList().add(new TechModelTo(rowModel.getAnyCode()));
                }
                case MATERIAL -> {
                    if (roots.isEmpty()) throw new IllegalArgumentException();
                    List<TechModelTo> techList = roots.get(roots.size() - 1).getTechList();
                    if (techList.isEmpty()) throw new IllegalArgumentException();
                    techList.get(techList.size() - 1).getRowTos().add(new MaterialTo(rowModel.getAnyCode()));
                }
            }
        }
        return roots;
    }
}
