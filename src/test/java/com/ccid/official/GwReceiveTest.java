package com.ccid.official;


import com.ccid.official.controller.GwReceiveController;
import com.ccid.official.dao.entity.po.GwReceive;
import org.junit.Test;

public class GwReceiveTest {
    @Test
    public void userFindByIdTest(){
        GwReceiveController gwReceiveController = new GwReceiveController();
        GwReceive gwReceive = new GwReceive();
        gwReceive.setDescribe("sfsafsafsadf");
        gwReceive.setAttribute("sfasdfsdfsdfdsaf");
        System.out.println(gwReceiveController.addGwReceive(gwReceive));
    }
}
