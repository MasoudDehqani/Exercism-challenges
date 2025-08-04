class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department == null) {
            return name + " - " + "OWNER";
        } else if (department == null) {
            return "[" + id.toString() + "]" + " - " + name + " - " + "OWNER";    
        } else if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        
        return "[" + id.toString() + "]" + " - " + name + " - " + department.toUpperCase();
    }
}
