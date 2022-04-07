$(function() {
    // Initialize form validation on the registration form.
    // It has the name attribute "registration"
    $("form[name='Edit']").validate({
      // Specify validation rules
      rules: {
    
        description: "required",
        screen: {
          required: true,
          maxlength: 20
        }
      },
      
      // Make sure the form is submitted to the destination defined
      // in the "action" attribute of the form when valid
      submitHandler: function(form) {
        form.submit();
      }
    });
  });
  