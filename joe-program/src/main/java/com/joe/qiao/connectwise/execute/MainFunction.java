package com.joe.qiao.connectwise.execute;

/**
 * @author Joe Qiao
 * @Date 16/01/2018.
 */
public class MainFunction {

    public static void main(String[] args) {
        MainFunction mainFunction = new MainFunction();
      //  mainFunction.removeAll("/service/tickets","board/name","joe_test1",true,CWRestOperator.AND);
    }
    
//    public int removeAll(String path, String key, String value, boolean isTextValue, CWRestOperator operator){
//       try {
//           RestParmeter restParmeter = new RestParmeter();
//           restParmeter.addConditionsParm(key, value, isTextValue, operator);
//           HttpGen getHttpGen = new HttpGen();
//        //   int status = getHttpGen.execute(path,restParmeter);
//      //     List<Configuration> configurations = JSONHelper.fromJsonForObjList(getHttpGen.getResult(),Configuration.class);
//           int total =1;
////           for(Configuration c:configurations){
////               int deleteId=c.getId();
////               DeleteHttpGen deleteHttpGen = new DeleteHttpGen();
////           //    deleteHttpGen.execute("/service/tickets"+"/"+deleteId);
////               System.out.println(deleteId+"  " + "toal = "+ total);
////               total++;
////           }
////       } catch (IOException e) {
////           e.printStackTrace();
////       } catch (URISyntaxException e) {
////           e.printStackTrace();
////       } catch (AuthenticationException e) {
////           e.printStackTrace();
////       } catch (Exception e) {
////           e.printStackTrace();
////       }
//       return 1;
//    }
}
