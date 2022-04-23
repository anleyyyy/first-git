public class Al_Menu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean flag =true;
        Al_Main sm =new Al_Main();
        sm.inti();
        while (flag){
            System.out.println("---------球员管理系统------------");
            System.out.println("1.展示所有球员信息");
            System.out.println("2.根据位置展示所有的球员信息");
            System.out.println("3.新增一名球员信息");
            System.out.println("4.修改一名球员信息");
            System.out.println("5.删除一名球员信息");
            System.out.println("请输入你的选择");
            int key = sc.nextInt();
            switch (key){
                case 1:
                    sm.showAllBoolNameMessage();
                    break;
                case 2:
                    System.out.println("请输入球员的位置");
                    String boolLocation = sc.next();
                    sm.showBoolForLocation(boolLocation);
                    break;
                case 3:
                    Al_Message stu =new Al_Message();
                    System.out.println("请输入你要添加球员的球队名称");
                    String boolNameForHome = sc.next();
                    System.out.println("请输入球员名字");
                    stu.setBoolName(sc.next());
                    System.out.println("请输入球员所打的位置");
                    stu.setBoolLocation(sc.next());
                    System.out.println("请输入球员的身高");
                    stu.setBoolHeight(sc.next());
                    System.out.println("请输入球员的球衣号码");
                    stu.setBoolNameNum(sc.nextInt());
                    boolean b = sm.addNewBool(boolNameForHome, stu);
                    if (b){
                        System.out.println("添加成功");
                    }else {
                        System.out.println("添加失败");
                    }
                    break;
                case 4:
                    Al_Message stu1 =new Al_Message();
                    System.out.println("请输入你要查找的球员名称");
                    String boolName = sc.next();
                    Al_Message message = sm.showBoolMessage(boolName);
                    if (message!=null) {
                        System.out.print("原球员名称为:" + message.getBoolName()+" ");
                        System.out.println("请输入你要修改的名称");
                        stu1.setBoolName(sc.next());
                        System.out.print("原球员所打的位置为:" + message.getBoolLocation()+" ");
                        System.out.println("请输入你要修改的球员所打打的位置");
                        stu1.setBoolLocation(sc.next());
                        System.out.print("原球员的身高为:" + message.getBoolHeight()+" ");
                        System.out.println("请输入修改的球员身高");
                        stu1.setBoolHeight(sc.next());
                        System.out.print("原球员的号码为:" + message.getBoolNameNum()+" ");
                        System.out.println("请输入修改的球员号码");
                        stu1.setBoolNameNum(sc.nextInt());
                        boolean b1 = sm.deleteBoolMessage(stu1,boolName);
                        if (b1) {
                            System.out.println("修改成功");
                        } else {
                            System.out.println("修改失败");
                        }
                    }else {
                        System.out.println("你输入的球员不存在");
                    }
                    break;
                case 5:
                    System.out.println("请输入你要删除的球员姓名");
                    String deleteName = sc.next();
                    boolean b2 = sm.deleteBool(deleteName);
                    if (b2){
                        System.out.println("删除成功");
                    }else {
                        System.out.println("删除失败");
                    }
                    break;
                default:
                    System.out.println("你输入信息有误");
            }
            System.out.println("是否继续(Y/N)");
            String s = sc.next();
            if (s.equalsIgnoreCase("Y")){
                flag=true;
            }else {
                flag=false;
            }
        }
    }
}
