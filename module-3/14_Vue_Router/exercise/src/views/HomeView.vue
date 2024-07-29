<template>
    
      <div>
      <BestSellerList />
          
      </div >
      <div>
       
        <NewReleaseList />
      </div>
    
    
  </template>
    
    
    
    
    <script>
    import NewReleaseList from '../components/NewReleasesList.vue';
    import BestSellerList from '../components/BestSellerList.vue';
     
     
     export default {
    components: {
    NewReleaseList,
    BestSellerList
}
    }

    </script>
    
        
    

    
    <style>
    
    
    
    
    </style>