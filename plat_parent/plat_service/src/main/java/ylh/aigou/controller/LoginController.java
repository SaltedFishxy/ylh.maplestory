package ylh.aigou.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ylh.aigou.Employee;
import ylh.aigou.util.AjaxResult;

@RestController
public class LoginController {
//    value = "/login" :路径
//    method = RequestMethod.POST：post提交方式
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("woaichipg".equals(employee.getName())&&"pg".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("失败");
    }
}
