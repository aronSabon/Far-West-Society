jQuery(document).ready(function ($) {
  "use strict";
  const SCROLL_OFFSET = 150;

  // Scroll event listener
  $(window).on("scroll", function () {
    if ($(this).scrollTop() > SCROLL_OFFSET) {
      $(".main-header").addClass("sticky");
    } else {
      $(".main-header").removeClass("sticky");
    }
  });

  $(".header-nav .menu").slicknav({
    appendTo: ".header-offcanvas .offcanvas-body",
    label: "",
    allowParentLinks: true,
    closedSymbol: "",
    openedSymbol: "",
    init: function () {
      $(".slicknav_btn").remove();
    },
  });
  $(".header-nav .menu").slicknav("open");

  var banner = new Swiper(".banner", {
    loop: true,
    speed: 800,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: ".banner .swiper-button-next",
      prevEl: ".banner .swiper-button-prev",
    },
    pagination: {
      el: ".banner .swiper-pagination",
      clickable: true,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
  });

  // doner slider
  const exccellence = new Swiper(".exccellence-swiper", {
    slidesPerView: 4,
    spaceBetween: 30,
    loop: true,
    speed: 800,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
    breakpoints: {
      0: {
        slidesPerView: 1,
        spaceBetween: 30,
      },
      575: {
        slidesPerView: 1,
        spaceBetween: 30,
      },
      768: {
        slidesPerView: 2,
        spaceBetween: 30,
      },
      991: {
        slidesPerView: 3,
        spaceBetween: 30,
      },
      1200: {
        slidesPerView: 4,
        spaceBetween: 30,
      },
    },
  });

  // thumb silder
  var swiper = new Swiper(".patient_thumb_swiper", {
    loop: true,
    spaceBetween: 10,
    slidesPerView: 4,
    freeMode: true,
    watchSlidesProgress: true,
  });
  var swiper2 = new Swiper(".patient_swiper", {
    loop: true,
    spaceBetween: 10,
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
    thumbs: {
      swiper: swiper,
    },
  });
  // condolence slider
  const packageSwiper = new Swiper(".package_swiper", {
    slidesPerView: 3,
    spaceBetween: 24,
    loop: true,
    speed: 800,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
    breakpoints: {
      0: {
        slidesPerView: 1,
        spaceBetween: 30,
      },
      575: {
        slidesPerView: 1,
        spaceBetween: 30,
      },
      768: {
        slidesPerView: 2,
        spaceBetween: 30,
      },
      991: {
        slidesPerView: 2,
        spaceBetween: 30,
      },
      1250: {
        slidesPerView: 3,
        spaceBetween: 30,
      },
    },
  });
  const center = new Swiper(".speciality_center_swiper", {
    slidesPerView: 1,
    spaceBetween: 30,
    loop: true,
    speed: 800,
    autoplay: {
      delay: 5000,
      disableOnInteraction: false,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
  });
  var swiper = new Swiper(".eventSwiper", {
    loop: true,
    slidesPerView: 1,
    spaceBetween: 30,
    speed: 800,
    autoplay: {
      delay: 2000,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
    breakpoints: {
      320: {
        slidesPerView: 1,
        spaceBetween: 30,
      },
      575: {
        slidesPerView: 2,
        spaceBetween: 30,
      },
      768: {
        slidesPerView: 3,
        spaceBetween: 30,
      },
      991: {
        slidesPerView: 3,
        spaceBetween: 30,
      },
      1025: {
        slidesPerView: 4,
        spaceBetween: 30,
      },
    },
  });
  const tooltipTriggerList = $('[data-bs-toggle="tooltip"]');
  tooltipTriggerList.each(function () {
    new bootstrap.Tooltip(this);
  });

  // //   counter
  // var a = 0;
  // $(window).scroll(function () {
  //   if (!$(".achievement")[0]) {
  //     return;
  //   }
  //   var oTop = $(".achievement").offset().top - window.innerHeight;
  //   if (a == 0 && $(window).scrollTop() > oTop) {
  //     $(".counter").each(function () {
  //       var $this = $(this),
  //         countTo = $this.attr("data-count");
  //       $({
  //         countNum: $this.text(),
  //       }).animate(
  //         {
  //           countNum: countTo,
  //         },

  //         {
  //           duration: 5000,
  //           easing: "linear",
  //           step: function () {
  //             $this.text(Math.floor(this.countNum));
  //           },
  //           complete: function () {
  //             $this.text(this.countNum);
  //           },
  //         }
  //       );
  //     });
  //     a = 1;
  //   }
  // });

  // $(".show-btn").click(function (event) {
  //   event.preventDefault();
  //   var para = $(this).closest(".para");
  //   para.find(".content-para").show();
  //   para.find(".show-btn").hide();
  //   para.find(".less-btn").show();
  // });

  // $(".less-btn").click(function (event) {
  //   event.preventDefault();
  //   var para = $(this).closest(".para");
  //   para.find(".content-para").hide();
  //   para.find(".show-btn").show();
  //   para.find(".less-btn").hide();
  // });


  //memer tab script
  // Switch to Address Tab using jQuery
  $('#nextToAddress').on('click', function () {
    $('#address-tab').tab('show');
  });

  // Switch to Contact Tab using jQuery
  $('#nextToContact').on('click', function () {
    $('#contact-tab').tab('show');
  });
  $('#nextToFamily').on('click', function () {
    $('#family-tab').tab('show');
  });
  $('#familyFormTemplate').click(function () {
    $('#familyFormTemplate').toggle();
    $(this).hide();
  });
  $('#addBtn').click(function () {
    var newForm = $('#familyFormTemplate').clone().removeAttr('id').show();
    $('#formsContainer').append(newForm);
    $('#submitContainer').show().appendTo(newForm);
    newForm.find('.removeBtn').click(function () {
      $(this).closest('.familyFormInstance').remove();
      if ($('.familyFormInstance').length === 0) {
        $('#submitContainer').hide();
      }
    });
  });

  $('#removeBtn').click(function () {
    $('#familyForm').hide();
    $('#addBtn').show();
  });

  var swiper = new Swiper(".mySwiper", {
    loop: true,
    slidesPerView: 3,
    spaceBetween: 10,
    pagination: {
      el: ".swiper-pagination",
      type: "progressbar",
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
  });


  // menu 
  document.getElementById('openSecondOffcanvas').addEventListener('click', function () {
    const firstCanvasEl = document.getElementById('offcanvasOne');
    const firstCanvas = bootstrap.Offcanvas.getInstance(firstCanvasEl);
    firstCanvas.hide();
    firstCanvasEl.addEventListener('hidden.bs.offcanvas', function showSecond() {
      const secondCanvas = new bootstrap.Offcanvas(document.getElementById('offcanvasTwo'));
      secondCanvas.show();
      firstCanvasEl.removeEventListener('hidden.bs.offcanvas', showSecond);
    });
  });


  document.getElementById('searchBtn').addEventListener('click', function () {
    const firstCanvasEl = document.getElementById('offcanvasOne');
    const firstCanvas = bootstrap.Offcanvas.getInstance(firstCanvasEl);
    firstCanvas.hide();
  });


// popup 
  function initPopup() {
    const popups = document.querySelectorAll('[data-popup]');

    popups.forEach(popup => {
      const closeBtn = popup.querySelector('[data-popup-close]');

      setTimeout(function () {
        popup.classList.add('d-flex')
      }, 1000);

      setTimeout(function () {
        popup.classList.add('d-none')
      }, 5000);

      closeBtn.onclick = function () {
        popup.classList.add('d-none')
      };
    });
  }

  

  initPopup();

});
