import Vue from 'vue'
import Router from 'vue-router'
import About from '../views/About.vue'
import Home from '../views/Home.vue'
import Message from '../views/Message.vue'
import News from '../views/News.vue'
import MessageDetail from '../views/MessageDetail.vue'
import NewsDetail from '../views/NewsDetail.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/about',
      component: About
    },
    {
      path: '/home',
      component: Home,
      children:[
        {
          path: 'news',
          component: News,
          children: [
            {
              path: 'detail',
              component: NewsDetail
            }
          ]
        },
        {
          path: 'message',
          component: Message,
          children: [
            {
              path: 'detail/:id',
              component: MessageDetail
            }
          ]
        },
        {
          path: '',
          redirect: '/home/news',          
        }
      ]
    },
    {//默认路由
      path: '/',
      redirect: '/about'
    }
  ]
})
