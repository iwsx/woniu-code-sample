<template>
  <div id="app">
    <router-link to="/about">About</router-link>
    <router-link to="/home">Home</router-link>
    <!--缓存组件对象-->
    <keep-alive>
      <router-view/>
    </keep-alive>
    
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
</style>
