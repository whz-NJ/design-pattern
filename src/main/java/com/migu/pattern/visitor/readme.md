Visitor（访问者模式）
Allows for one or more operation to be applied to a set of objects at 
runtime, decoupling the operations from the object structure.
翻译成中文就是：允许一个或者多个操作应用到一组对象上，解耦操作和对象本身。


overload和override区别：override是不同类相同入参类型的同名函数，overload是一个类内部不同入参类型的同名函数。
override 调用时使用哪个类的方法由调用者实际运行类型确定。
overload 调用时调用哪个类的方法由caller对象实际运行类型确定（可以理解为caller对象有和C++语言中类似的虚表指针，指向实际运行类型的overload方法），
调用caller类内部哪个同名方法由入参编译类型确定（无法根据方法入参实际类型确定，所以是单分派）。
提取公共Visitable接口的目的是想在模式调用者中统一遍历各个ConcretVisiableXXX。
提取公共Visitor接口的目的是不想在新增新功能时修改Visiable接口以及ConcretVisiableXXX中的代码。
