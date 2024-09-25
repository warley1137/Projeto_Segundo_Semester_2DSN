document.addEventListener('DOMContentLoaded', function () {
    const carousel = document.querySelector('.carousel');
    const prevButton = document.querySelector('.prev-button');
    const nextButton = document.querySelector('.next-button');
    const carouselItems = document.querySelectorAll('.carousel-item');
  
    let currentIndex = 0;
  
    function updateCarousel() {
      carousel.style.transform = `translateX(-${currentIndex * 100}%)`;
    }
  
    prevButton.addEventListener('click', function () {
      if (currentIndex > 0) {
        currentIndex--;
        updateCarousel();
      }
    });
  
    nextButton.addEventListener('click', function () {
      if (currentIndex < carouselItems.length - 1) {
        currentIndex++;
        updateCarousel();
      }
    });
  
    updateCarousel();
  });