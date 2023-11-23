import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Module {
    private String moduleName;
    private String moduleCode;
    private double qcaPoints;
    private String grade;
    private ArrayList<String> moduleGrades;
    private static final double CREDIT_HOURS = 6.0; // Each module worth 6 credit hours
    private static final Map<String, Double> GRADE_TO_QCA_MAP = createGradeToQCAMap();

    public Module(String moduleName, String moduleCode, double qcaPoints) {
        this.moduleName = moduleName;
        this.moduleCode = moduleCode;
        this.qcaPoints = qcaPoints;
        this.moduleGrades = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public double getQcaPoints() {
        return qcaPoints;
    }

    public void setQcaPoints(double qcaPoints) {
        this.qcaPoints = qcaPoints;
    }

    public double getCreditHours() {
        return CREDIT_HOURS;
    }

    public void addGrade(String grade) {
        moduleGrades.add(grade);
    }
    
    public String getGrade() {
        return student
    }
    
    public ArrayList<String> getGrades() {
        return moduleGrades;
    }

    public double calculateModuleAverageGrade() {
        if (moduleGrades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (String grade : moduleGrades) {
            sum += convertGradeToQCA(grade);
        }
        return sum / moduleGrades.size();
    }

    private double convertGradeToQCA(String grade) {
        return GRADE_TO_QCA_MAP.getOrDefault(grade, 0.0);
    }

    private static Map<String, Double> createGradeToQCAMap() {
        Map<String, Double> gradeToQCAMap = new HashMap<>();
        gradeToQCAMap.put("A1", 4.00);
        gradeToQCAMap.put("A2", 3.60);
        gradeToQCAMap.put("B1", 3.20);
        gradeToQCAMap.put("B2", 3.00);
        gradeToQCAMap.put("B3", 2.80);
        gradeToQCAMap.put("C1", 2.60);
        gradeToQCAMap.put("C2", 2.40);
        gradeToQCAMap.put("C3", 2.00);
        gradeToQCAMap.put("D1", 1.60);
        gradeToQCAMap.put("D2", 1.20);
        gradeToQCAMap.put("F", 0.00);
        gradeToQCAMap.put("NG", 0.00);
        return gradeToQCAMap;
    }
    
}