// Shared client-side logic for registration, login, home and change password
function loadUsers(){
  try{
    return JSON.parse(localStorage.getItem('users')||'[]')||[];
  }catch(e){return []}
}
function saveUsers(users){ localStorage.setItem('users', JSON.stringify(users)); }
function findUser(userid){ return loadUsers().find(u=>u.userid===userid); }

function validatePasswordRules(p){
  if(!p || p.length<6) return 'Password must be at least 6 characters.';
  if(!/[0-9]/.test(p)) return 'Password must contain at least one number.';
  if(!/[A-Z]/.test(p)) return 'Password must contain at least one uppercase letter.';
  return '';
}

document.addEventListener('DOMContentLoaded', ()=>{
  // login form
  const loginForm = document.getElementById('loginForm');
  if(loginForm){
    loginForm.addEventListener('submit', e=>{
      e.preventDefault();
      const uid = document.getElementById('userid').value.trim();
      const pwd = document.getElementById('password').value;
      const user = findUser(uid);
      const err = document.getElementById('loginError');
      if(!user || user.password!==pwd){ err.textContent='Invalid credentials'; return; }
      localStorage.setItem('currentUser', uid);
      window.location.href = 'home.html';
    });
  }

  // register form
  const regForm = document.getElementById('registerForm');
  if(regForm){
    regForm.addEventListener('submit', e=>{
      e.preventDefault();
      const uid = document.getElementById('reg_userid').value.trim();
      const pwd = document.getElementById('reg_password').value;
      const dob = document.getElementById('reg_dob').value;
      const contact = document.getElementById('reg_contact').value.trim();
      const addr = document.getElementById('reg_address').value.trim();
      const state = document.getElementById('reg_state').value;
      const gender = document.querySelector('input[name="gender"]:checked').value;
      const errEl = document.getElementById('registerError');
      const okEl = document.getElementById('registerSuccess');
      errEl.textContent=''; okEl.textContent='';

      if(uid.length<4 || uid.length>8){ errEl.textContent='UserID must be 4-8 characters.'; return; }
      const passErr = validatePasswordRules(pwd); if(passErr){ errEl.textContent=passErr; return; }
      if(!dob){ errEl.textContent='Please provide Date of Birth.'; return; }
      if(new Date(dob) >= new Date()){ errEl.textContent='DOB must be earlier than today.'; return; }
      if(!/^[0-9]{10}$/.test(contact)){ errEl.textContent='Contact number must be exactly 10 digits.'; return; }

      const users = loadUsers();
      if(users.find(u=>u.userid===uid)){ errEl.textContent='UserID already exists.'; return; }

      users.push({userid:uid,password:pwd,dob,contact,address:addr,state,gender});
      saveUsers(users);
      okEl.textContent='Registration successful — redirecting to login...';
      setTimeout(()=>window.location.href='index.html',1200);
    });
  }

  // home page
  const welcome = document.getElementById('welcome');
  if(welcome){
    const cur = localStorage.getItem('currentUser');
    if(!cur){ window.location.href='index.html'; return; }
    welcome.innerHTML = `Welcome to ${cur}`;
    document.getElementById('logoutBtn').addEventListener('click', ()=>{ localStorage.removeItem('currentUser'); window.location.href='index.html'; });
  }

  // change password
  const changeForm = document.getElementById('changeForm');
  if(changeForm){
    const cur = localStorage.getItem('currentUser');
    if(!cur){ window.location.href='index.html'; return; }
    changeForm.addEventListener('submit', e=>{
      e.preventDefault();
      const curPwd = document.getElementById('current_password').value;
      const newPwd = document.getElementById('new_password').value;
      const conf = document.getElementById('confirm_password').value;
      const err = document.getElementById('changeError');
      const ok = document.getElementById('changeSuccess');
      err.textContent=''; ok.textContent='';
      const users = loadUsers();
      const user = users.find(u=>u.userid===cur);
      if(!user || user.password!==curPwd){ err.textContent='Current password incorrect'; return; }
      if(newPwd!==conf){ err.textContent='New passwords do not match'; return; }
      const passErr = validatePasswordRules(newPwd); if(passErr){ err.textContent=passErr; return; }
      user.password = newPwd; saveUsers(users);
      ok.textContent='Password changed successfully';
      setTimeout(()=>window.location.href='home.html',900);
    });
  }

});
