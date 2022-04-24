public class Al_Main {
    HashMap<String, ArrayList<Al_Message>> map =new HashMap<>();
    Integer boolNum=1006;
    public  void inti(){
        ArrayList<Al_Message> str1 =new ArrayList<>();
        Al_Message stu1 =new Al_Message(1001,"勒布朗-詹姆斯","前锋","203cm",6);
        Al_Message stu2=new Al_Message(1002,"安东尼-戴维斯","中锋","210cm",3);
        Al_Message stu3=new Al_Message(1003,"奥斯丁-里弗斯","后卫","196cm",15);
        str1.add(stu1);
        str1.add(stu2);
        str1.add(stu3);
        map.put("湖人队",str1);
        ArrayList<Al_Message> str2 =new ArrayList<>();
        Al_Message stu4 =new Al_Message(1004,"斯蒂芬-库里","后卫","191cm",30);
        Al_Message stu5 =new Al_Message(1005,"安德鲁-维金斯","前锋","201cm",22);
        str2.add(stu4);
        str2.add(stu5);
        map.put("勇士队",str2);
    }
    public void  showAllBoolNameMessage(){
        Set<String> set = map.keySet();
        for (String s : set) {
            ArrayList<Al_Message> list = map.get(s);
            System.out.println(s+"球员如下:");
            for (Al_Message message : list) {
                System.out.println(message);
            }
        }
    }
    public void showBoolForLocation(String boolLocation){
        Set<String> set = map.keySet();
        for (String s : set) {
            ArrayList<Al_Message> list = map.get(s);
            for (Al_Message message : list) {
                if (boolLocation.equals(message.getBoolLocation())){
                    System.out.println(message);
                }
            }
        }
    }
    public boolean addNewBool(String boolNameForHome,Al_Message message){
        boolean flag =false;
        ArrayList<Al_Message> str =new ArrayList<>();
        Set<String> set = map.keySet();
        for (String s : set){
            if (boolNameForHome.equals(s)){
                flag=true;
            }
        }
        if (flag){
                message.setBoolNum(boolNum);
                map.get(boolNameForHome).add(message);
                map.put(boolNameForHome,map.get(boolNameForHome));
                boolNum++;
                return true;
        }else {
            message.setBoolNum(boolNum);
            str.add(message);
            map.put(boolNameForHome,str);
            boolNum++;
            return true;
        }
    }
    public Al_Message  showBoolMessage(String boolName){
        Set<String> set = map.keySet();
        for (String s : set) {
            ArrayList<Al_Message> list = map.get(s);
            for (Al_Message message : list) {
                if (boolName.equals(message.getBoolName())){
                    return message;
                }
            }
        }
        return null;
    }
    public boolean deleteBoolMessage(Al_Message message,String boolName){
        Set<String> set = map.keySet();
        boolean flag=true;
        for (String s : set){
            for (int i = 0; i < map.get(s).size(); i++){
                if (boolName.equals(map.get(s).get(i).getBoolName())){
                    message.setBoolNum(map.get(s).get(i).getBoolNum());
                    map.get(s).set(i,message);
                    flag=false;
                    return true;
                }
            }
        }
        if (flag){
            return false;
        }
        return false;
    }
    public boolean deleteBool(String deleteBool){
        Set<String> set = map.keySet();
        for (String s : set) {
            for (Al_Message message : map.get(s)){
                if (deleteBool.equals(message.getBoolName())){
                    map.get(s).remove(message);
                    return true;
                }
            }
        }
        return false;
    }
}
