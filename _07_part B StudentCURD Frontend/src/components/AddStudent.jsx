import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';




function AddStudent() {
  const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

  const navigate = useNavigate();
  const [student, setStudent] = useState({
    name: '',
    email: '',
    course: ''
  });

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      // `${API_BASE_URL}/Create-Student`
      await axios.post('/api/Student/Create-Student', student);
      navigate('/');
    } catch (error) {
      console.error('Error adding student:', error);
    }
  };

  const handleChange = (e) => {
    setStudent({ ...student, [e.target.name]: e.target.value });
  };

  return (
    <div className="add-student">
      <form onSubmit={handleSubmit}>
        <h2>Add New Student</h2>
        <div className="form-group">
          <label htmlFor="name">Name</label>
          <input
            type="text"
            id="name"
            name="name"
            value={student.name}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="email">Email</label>
          <input
            type="email"
            id="email"
            name="email"
            value={student.email}
            onChange={handleChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="course">course</label>
          <input
            type="text"
            id="course"
            name="course"
            value={student.course}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit" className="primary">Add Student</button>
      </form>
    </div>
  );
}

export default AddStudent;