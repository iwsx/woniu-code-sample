<template>
  <div>
      <h1>news page</h1>
      <ul>
          <li v-for="item of news" :key="item.id">
              <router-link :to="`/home/news/detail?id=${item.id}`">{{item.title}}</router-link>
          </li>
      </ul>
      <hr>
      <router-view></router-view>
  </div>
</template>

<script>
export default {
   data(){
       return{
           news:[
               {id: 1, title : 'news01'},
               {id: 2, title : 'news02'},
               {id: 3, title : 'news03'},
            ]
       }
   },
   
}
</script>

<style>

</style>