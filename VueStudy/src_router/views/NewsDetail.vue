<template>
  <div>
      <h1>{{$route.query.id}}</h1>
      <ul>
          <li>{{news.id}}</li>
          <li>{{news.title}}</li>
          <li>{{news.content}}</li>
      </ul>
  </div>
</template>

<script>
export default {
    data() {
        return {
            news : {}
        }
    },
    mounted() {
        const allNews = [
               {id: 1, title : 'news01', content: 'news01 info...'},
               {id: 2, title : 'news02', content: 'news02 info...'},
               {id: 3, title : 'news03', content: 'news03 info...'},
            ];
        this.allNews = allNews;
        //模拟数据库获取数据
        setTimeout(() => {
            this.news = allNews.find(item => item.id == this.$route.query.id)
        }, 1000);
    },
    //监听$route，改变当前路由组件参数数据时自动调用
    watch: {
        $route: function(value){
            this.news = this.allNews.find(item => item.id == value.query.id)
        }
    }
}
</script>

<style>

</style>