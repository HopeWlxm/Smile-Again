# Smile Again 
---
## **使用的技术**
* Mysql
* SSM
* Shiro
* bootstrp
* 分页插件 PageHelper
* ## **快速启功**
* 创建mysql数据库:smileagain
* 导入smileagain.sql
* 导入此工程到idea，启动tomcat
* 输入http://localhost:8080/xxx (xxx为任意字符,因为没有认证,自动跳转到login.jsp)
![Image text](https://github.com/HopeWlxm/Smile-Again/blob/master/image/login.png)
* 输入 admin 1234
* 进入
![Image text](https://github.com/HopeWlxm/Smile-Again/blob/master/image/index.png)
其中 user manager是自己实现,需要 user:query 权限，若没有则不显示该导航栏
* 进入到
![Image text](https://github.com/HopeWlxm/Smile-Again/blob/master/image/user-manager.png)
## **问题反馈**
这个demo很多地方需要修改。
第一个，从数据库中读取到sys_user的image字段的值，里面保存的是每个用户的头像，在index页面展示，现在是死的。
但是这个网页的JSP结构很乱，因为这个网页本来是github里的一个bootstrap的项目，全是html。然后我修改了。当时没有想到这么多。现在再更改就比较麻烦。
第二个，在user-list页面展示的完完全全是sys_user表的内容。我想展示的是id,username,rolename,percode,locked。但目前自己仅有的思路是5表联查，这个对我来说已经很难了，还要牵涉到pagehelper的分页，就一脸懵逼。

若使用过程中有问题，或者有大神能给在下一些思路（万分感谢）,麻烦加QQ：774330898
