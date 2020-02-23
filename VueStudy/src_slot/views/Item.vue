<template>
  <li :style='{background:bgColor}' @mouseenter='handleEnter(true)' @mouseleave='handleEnter(false)'>
      <label>
            <input type="checkbox" v-model="todo.check"/>
            <span>{{todo.info}}</span>
      </label>
      <button class="btn btn-danger" v-show="isShow" @click="subItem">删除</button>    
  </li>        
</template>

<script>
export default {
  // 声明接收标签属性
  // 会成为当前组件对象的属性, 可以在模板中直接访问, 也可以通过this来访问
  props:['todo','decrement','index'],
  // 也可以用下面这种方式
  // props:{
  //   todo: Object,
  // }
  data() {
    return {
      bgColor : '#fff',
      isShow : false
    }
  },
  methods: {
    handleEnter(isEnter) {
      if(isEnter){
        this.bgColor = '#ccc';
        this.isShow = true
      }
      else{
        this.bgColor = '#fff';
        this.isShow = false
      }      
    },
    subItem() {
      if(window.confirm('确定删除？')){
        this.decrement(this.index)
      }
    }
  }
}
</script>

<style>
/*item*/
li {
  list-style: none;
  height: 36px;
  line-height: 36px;
  padding: 0 5px;
  border-bottom: 1px solid #ddd;
}

li label {
  float: left;
  cursor: pointer;
}

li label li input {
  vertical-align: middle;
  margin-right: 6px;
  position: relative;
  top: -1px;
}

li button {
  float: right;
  display: none;
  margin-top: 3px;
}

li:before {
  content: initial;
}

li:last-child {
  border-bottom: none;
}

li:hover{
  background-color: #ccc;
}


</style>