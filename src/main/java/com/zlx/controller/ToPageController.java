package com.zlx.controller;

import com.zlx.pojo.Admin;
import com.zlx.pojo.BuyTotal;
import com.zlx.service.BuyTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ToPageController {

    @RequestMapping(value = {"/login","/"})
    public String toLoginPage(HttpSession session){
        return "login";
    }

    @RequestMapping("/cashier")
    public String toCashierPage(){
        return "cashier";
    }
    @RequestMapping("/administrator")
    public String toAdministratorPage(HttpSession session){

        return "administrator";
    }

    @RequestMapping("/cashier/welcome")
    public String toCashierWelcomePage(){
        return "cashier/welcome";
    }

    @RequestMapping("/addVip")
    public String toAddVipPage(){
        return "addVip";
    }

    @RequestMapping("/cashier/cashRegister")
    public String toCashierCashRegisterPage(){
        return "cashier/cashRegister";
    }


    @RequestMapping("/administrator/welcome")
    public String toAdministratorWelcomePage(){
        return "/administrator/welcome";
    }

    @RequestMapping("/administrator/viewCashier")
    public String toAdministratorViewCashier(){
        return "administrator/viewCashier";
    }
    @RequestMapping("/administrator/addCashier")
    public String toAdministratorAddCashier(){
        return "administrator/addCashier";
    }
    @RequestMapping("/commodityStocks")
    public String toAdministratorCommodityManagement(){
        return "commodityStocks";
    }
    @RequestMapping("/salesRecord")
    public String toAdministratorSalesRecord(){

        return "salesRecord";
    }
    @RequestMapping("/viewVip")
    public String toViewVip(){
        return "viewVip";
    }
    @RequestMapping("/updatePassword")
    public String toUpdatePassword(){
        return "updatePassword";
    }
    @RequestMapping("/editVip")
    public String toEditVipPage(){
        return "editVip";
    }
    @RequestMapping("/addGoods")
    public String toAddGoodsPage(){
        return "addGoods";
    }
    @RequestMapping("/editGoods")
    public String toEditGoodsPage(){
        return "editGoods";
    }
}