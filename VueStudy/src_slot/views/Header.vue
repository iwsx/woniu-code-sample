<template>
   <div class="todo-header">
        <input type="text" v-model="todo" @keyup.enter="add" placeholder="请输入你的任务名称，按回车键确认"/>
    </div>
</template>

<script>

export default {
  props:{
    increment: Function 
  },
  data() {
    return {
      todo:''
    }
  },
  methods: {
    add() {
      //1.判断传参是否为空
      if(this.todo === null || this.todo === ''){
        return;
      }
      //2.调用方法，把todo添加到todos
      const inputTodo = {
        check: false,
        info: this.todo
      };
      /*
        组件之间通信方式
        1.通过props传递数组、对象、方法
        2.子组件通过$emit(事件xx, 参数)触发父组件绑定的方法【此方法只适用于父子组件】
          - // 方式一: 通过 v-on 绑定 @delete_todo="deleteTodo"
          - // 方式二: 通过$on() this.$refs.xxx.$on('delete_todo', function (todo) { this.deleteTodo(todo) })
        3.消息订阅与发布(PubSubJS 库)
          - 在某个组件订阅消息，使用PubSub.subscribe('msg', function(msg, data){})
          - 在另一个组件发布消息，使用PubSub.publish('msg', data)
      */
      //方法只定义基本功能，参数封装好再传过去
      //this.increment(inputTodo);
      this.$emit('increment', inputTodo);
      //3.清空文本框
      this.todo = '';
    }
  }
}
</script>

<style>
/*header*/
.todo-header input {
  width: 560px;
  height: 28px;
  font-size: 14px;
  border: 1px solid #ccc;
  border-radius: 4px;
  padding: 4px 7px;
}

.todo-header input:focus {
  outline: none;
  border-color: rgba(82, 168, 236, 0.8);
  box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 8px rgba(82, 168, 236, 0.6);
}
</style>