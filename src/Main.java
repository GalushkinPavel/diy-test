import to.PositionType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RowModel> source = List.of(
                new RowModel("root0", PositionType.ROOT),

                new RowModel("root1", PositionType.ROOT),
                new RowModel("tech1", PositionType.TECHNOLOGY),
                new RowModel("mater1", PositionType.MATERIAL),
                new RowModel("mater2", PositionType.MATERIAL),
                new RowModel("mater3", PositionType.MATERIAL),

                new RowModel("root2", PositionType.ROOT),
                new RowModel("tech2", PositionType.TECHNOLOGY),
                new RowModel("mater4", PositionType.MATERIAL),
                new RowModel("mater5", PositionType.MATERIAL),
                new RowModel("mater6", PositionType.MATERIAL),
                new RowModel("tech3", PositionType.TECHNOLOGY),
                new RowModel("mater7", PositionType.MATERIAL),
                new RowModel("mater8", PositionType.MATERIAL),
                new RowModel("mater9", PositionType.MATERIAL)
        );

        // System.out.println(ViewModelsConverter.toRootModels(source));
        ViewModelsConverter.toRootModels(source).forEach(root -> {
            System.out.println("->" + root.getRootCode());
            root.getTechList().forEach(tech -> {
                System.out.println("--->" + tech.getTechCode());
                tech.getRowTos().forEach(row -> System.out.println("----->" + row.getMaterialCode()));
            });
        });
    }
}
