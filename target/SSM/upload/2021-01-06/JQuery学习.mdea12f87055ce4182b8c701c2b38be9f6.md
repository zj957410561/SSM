JQuery学习

1. 常用的jQuery事件方法

   1. click()) 单击事件
   2. dblckick() 双击事件
   3. mouseenter  鼠标穿过元素事件 
   4. mouseleave()  鼠标离开事件
   5. mousedown() 鼠标移到元素上方并按键
   6. mouseup() 松开鼠标按钮触发事件
   7. hover()  鼠标光标悬停事件
   8. focus()  获得焦点的事件
   9. blur() 失去焦点的事件
   10. keypress()  计算在一个字段内键盘按键次数
       1. keydown  j键按下的过程
       2. keypress 键被按下
       3. keyup 键被松开
   11. resize（） 计算浏览器窗口大小调整的次数
   12. change（）  字段值发生改变时触发的事件

2. jQuery效果 隐藏和显示

   1. hide(speed，callback) 隐藏  速度和显示后执行的函数
   2. show() 显示
   3. toggle（）  来回切换显示和隐藏函数

3. jQuery效果 淡出淡入

   1. fadeIn(speed，callback) 淡入已隐藏的元素  speed 可以是 slow fast 或毫秒

   2. fadeOut() 淡出可见元素

   3. fadeToggle() 在 fadeIn() 与 fadeOut() 方法之间进行切换。

      如果元素已淡出，则 fadeToggle() 会向元素添加淡入效果。

      如果元素已淡入，则 fadeToggle() 会向元素添加淡出效果。

   4. fadeTo(*speed,opacity,callback*) 允许渐变给定不透明度

4. jQuery效果-滑动

   1. slideDown(speed，callback) 向下滑动
   2. slideUp（）向上滑动
   3. slideToggle（） 向上向下进行切换

5. jQuery效果-动画

   1. $(*selector*).animate({*params*}*,speed,callback*);

      必需的 params 参数定义形成动画的 CSS 属性。

      可选的 speed 参数规定效果的时长。它可以取以下值："slow"、"fast" 或毫秒。

      可选的 callback 参数是动画完成后所执行的函数名称。

      这意味着如果您在彼此之后编写多个 animate() 调用，jQuery 会创建包含这些方法调用的"内部"队列。然后逐一运行这些 animate 调用

6. jQuery 停止动画

   1. stop（） 停止