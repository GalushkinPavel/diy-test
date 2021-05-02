import to.PositionType;

public class RowModel {
    private String anyCode;
    private PositionType positionType;

    public RowModel(String anyCode, PositionType positionType) {
        this.anyCode = anyCode;
        this.positionType = positionType;
    }

    public String getAnyCode() {
        return anyCode;
    }

    public void setAnyCode(String anyCode) {
        this.anyCode = anyCode;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
}
