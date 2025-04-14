import { useState, useEffect } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';

function EditStudent() {
  const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

  const { id } = useParams();
  const navigate = useNavigate();
  const [student, setStudent] = useState({
    name: '',
    email: '',
    course: ''
  });

  useEffect(() => {
    fetchStudent();
  }, [id]);

  const fetchStudent = async () => {
    try {
      // // `${API_BASE_URL}/GetStudentBy-Id`
      const response = await axios.get(`/api/Student/GetStudentBy-Id/${id}`);
      setStudent(response.data);
    } catch (error) {
      console.error('Error fetching student:', error);
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      //`${API_BASE_URL}/updateExistingStudentBy-id`
      await axios.put(`/api/Student/updateExistingStudentBy-id/${id}`, student);
      navigate('/');
    } catch (error) {
      console.error('Error updating student:', error);
    }
  };

  const handleChange = (e) => {
    setStudent({ ...student, [e.target.name]: e.target.value });
  };

  return (
    <div className="edit-student">
      <form onSubmit={handleSubmit}>
        <h2>Edit Student</h2>
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
        <button type="submit" className="primary">Update Student</button>
      </form>
    </div>
  );
}

export default EditStudent;