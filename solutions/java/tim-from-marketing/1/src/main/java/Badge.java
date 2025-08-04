class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department == null) {
            return name + " - " + "OWNER";
        } else if (department == null) {
            return String.format("[%d] - %s - OWNER", id, name);    
        } else if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        
        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
