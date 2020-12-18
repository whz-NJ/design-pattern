Visitor（访问者模式）
Allows for one or more operation to be applied to a set of objects at 
runtime, decoupling the operations from the object structure.
翻译成中文就是：允许一个或者多个操作应用到一组对象上，解耦操作和对象本身。
提取公共 Visitable 接口的目的是想在模式调用者中统一遍历各个 ConcretVisiableXXX。
提取公共 Visitor 接口的目的是不想在新增新功能时修改 Visiable 接口以及 ConcretVisiableXXX 中的代码。

overload和override区别：
    override 是父子类中相同入参类型的同名函数，
    overload 是一个类内部不同入参类型的同名函数。
override 调用时使用父类还是子类的方法由调用者实际运行类型确定（正常思维）
overload 调用时调用哪个类的方法由caller对象实际运行类型确定（正常思维），调用caller类内部哪个同名不同参数类型的方法由入参编译类型确定（无法根据方法入参实际类型确定，所以是单分派）。


