let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.textContent = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.textContent = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}


document.addEventListener('DOMContentLoaded', (event) =>{
  setPageTitle();
  displayGroceries();
  
  const groceryItems = document.querySelectorAll('li');
  const markAll = document.querySelector('a');
  const item = document.querySelector('i');

  groceryItems.forEach((item) => {
    // when you click on a task mark it completed
    item.addEventListener('click', () => {
      if (!item.classList.contains('completed')) {
        item.classList.add('completed');
        item.querySelector('i').classList.add('completed');
      }
    });

    // when you double click a task remove the completed class
    item.addEventListener('dblclick', () => {
      if (item.classList.contains('completed')) {
        item.classList.remove('completed');
        item.querySelector('i').classList.remove('completed');
      }
    });
  });


    
    markAll.addEventListener('click', (event) => {
    
      event.preventDefault();
      if(allItemsIncomplete){

        groceryItems.forEach((item) => {
        
        item.classList.add('completed');
        item.querySelector('i').classList.add('completed');
         
        })
      
        markAll.textContent = 'Mark All Incomplete';
        allItemsIncomplete = !allItemsIncomplete;  
      }
    else{

      groceryItems.forEach((item) => {
        
        item.classList.remove('completed');
        item.querySelector('i').classList.remove('completed');
         
        })
      
        markAll.textContent = 'Mark All Complete';
        allItemsIncomplete = !allItemsIncomplete;
    }
  }

)});


// document.addEventListener('DOMContentLoaded', (event) =>{
//   setPageTitle();
//   displayGroceries();
  
//   const groceries = document.querySelectorAll('li');
//   const markAll = document.querySelector('#toggleAll');

//   groceries.forEach((item) => {
//     // when you click on a task mark it completed
//     item.addEventListener('click', () => {
//       if (!item.classList.contains('completed')) {
//         item.classList.add('completed');
//         item.querySelector('i').classList.add('completed');
//       }
//     });

//     // when you double click a task remove the completed class
//     item.addEventListener('dblclick', () => {
//       if (item.classList.contains('completed')) {
//         item.classList.remove('completed');
//         item.querySelector('i').classList.remove('completed');
//       }
//     });
//   });

//   groceries.forEach((item) => {
    
//     markAll.addEventListener('click', (event) => {
//       //trying
//       event.preventDefault();
//       for(i=0;i < groceries.length; i++){
//         if (!item.classList.contains('completed')) {
//           item.classList.add('completed');
//           item.querySelector('i').classList.add('completed');
//         }
//       }

//   });

// })})