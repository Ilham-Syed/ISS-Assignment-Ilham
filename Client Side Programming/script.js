document.getElementById('registrationForm').addEventListener('submit', function (e) {
    e.preventDefault();
  
    let valid = true;
    const fields = ['fullname', 'username', 'email', 'phone', 'dob', 'gender', 'address', 'country', 'password', 'confirmPassword'];
  
    // Clear all errors first
    fields.forEach(field => {
      document.getElementById(field + 'Error').textContent = '';
    });
  
    const values = {};
    fields.forEach(field => {
      values[field] = document.getElementById(field).value.trim();
    });
  
    // Validations
    if (values.fullname.length < 3) {
      setError('fullname', 'Full name must be at least 3 characters.');
    }
  
    if (values.username.length < 3) {
      setError('username', 'Username must be at least 3 characters.');
    }
  
    if (!/^[^ ]+@[^ ]+\.[a-z]{2,3}$/.test(values.email)) {
      setError('email', 'Enter a valid email address.');
    }
  
    if (!/^[0-9]{10}$/.test(values.phone)) {
      setError('phone', 'Enter a valid 10-digit phone number.');
    }
  
    if (!values.dob) {
      setError('dob', 'Please select your date of birth.');
    }
  
    if (!values.gender) {
      setError('gender', 'Please select your gender.');
    }
  
    if (values.address.length < 5) {
      setError('address', 'Address should be at least 5 characters.');
    }
  
    if (!values.country) {
      setError('country', 'Please select your country.');
    }
  
    if (values.password.length < 6) {
      setError('password', 'Password must be at least 6 characters.');
    }
  
    if (values.password !== values.confirmPassword) {
      setError('confirmPassword', 'Passwords do not match.');
    }
  
    function setError(field, message) {
      document.getElementById(field + 'Error').textContent = message;
      valid = false;
    }
  
    if (valid) {
      alert('Registration successful!');
      this.reset();
    }
  });
  