import { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';

function StudentList() {
  const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetchStudents();
  }, []);

  const fetchStudents = async () => {
    try {
      //`${API_BASE_URL}/GetAll-Student`
      const response = await axios.get('/api/Student/GetAll-Student');
      setStudents(Array.isArray(response.data) ? response.data : []);
    } catch (error) {
      console.error('Error fetching students:', error);
      setStudents([]);
    }
  };

  const deleteStudent = async (id) => {
    if (window.confirm('Are you sure you want to delete this student?')) {
      try {
     //   `${API_BASE_URL}/deleteExistingStudentBy-id`
        await axios.delete(`/api/Student/deleteExistingStudentBy-id/${id}`);
        fetchStudents();
      } catch (error) {
        console.error('Error deleting student:', error);
      }
    }
  };

  return (
    <div className="student-list">
      <h2>Students List</h2>
      <div className="table-container">
        <table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Email</th>
              <th>course</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {students.map((student) => (
              <tr key={student.id}>
                <td>{student.name}</td>
                <td>{student.email}</td>
                <td>{student.course}</td>
                <td>
                  <div className="action-buttons">
                    <Link to={`/edit/${student.id}`} className="action-link">Edit</Link>
                    <button className="delete" onClick={() => deleteStudent(student.id)}>Delete</button>
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default StudentList;