class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        String byear = Integer.toBinaryString(year);
        String bmonth = Integer.toBinaryString(month);
        String bday = Integer.toBinaryString(day);
        return byear+"-"+bmonth+"-"+bday;
    }
}