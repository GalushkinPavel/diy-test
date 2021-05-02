package to;

// Материал
public class MaterialTo {
    public MaterialTo(String materialCode) {
        this.materialCode = materialCode;
    }

    private String materialCode;

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    @Override
    public String toString() {
        return "MaterialTo{" +
                "materialCode='" + materialCode + '\'' +
                '}';
    }
}
