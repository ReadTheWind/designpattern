# 设计模式简单实现
## 单例模式 
> singleton 包下
>包含 懒汉式（推荐）、饿汉式 及对应加锁等的实现

## 策略模式
> 一般包含 策略接口（AdaptorSorter），接口实现（GoodsInfoNumCompareAdaptor等），  
>AdaptorSorter.sort()是不变的，策略只是添加了具体策略实现
### 项目接口
- bean 对象bean
- abstractSimple 包是简单抽象实现，不够灵活，非策略
- adaptor 包策略简单实现，通过抽象比较接口+泛型， 并实现比较器，满足开闭原则，灵活选择比较器