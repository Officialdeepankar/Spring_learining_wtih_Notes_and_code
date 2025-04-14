import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import StudentList from './components/StudentList';
import AddStudent from './components/AddStudent';
import EditStudent from './components/EditStudent';
import './App.css';

function App() {
  return (
    <Router>
      <div className="app-container">
        <nav>
          <h1>Student Management System</h1>
          <div className="nav-links">
            <Link to="/" className="nav-link">Students List</Link>
            <Link to="/add" className="nav-link">Add New Student</Link>
          </div>
        </nav>

        <Routes>
          <Route path="/" element={<StudentList />} />
          <Route path="/add" element={<AddStudent />} />
          <Route path="/edit/:id" element={<EditStudent />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;