import './App.css';
import Employee from './Employee';

import employee1 from './img/employee1.jpg'
import employee2 from './img/employee2.jpg'
import employee3 from './img/employee3.jpg'

function App() {
  return (
    <div className="App">
        <Employee
            name={"Daniel"} 
            surname={"Patel"} 
            func={"Network Administrator"} 
            exp={"10 years of experience in managing and securing large-scale enterprise networks"} 
            image={employee1} 
        />

        <Employee
            name={"Emily"} 
            surname={"Rodriguez"} 
            func={"Software Engineer"} 
            exp={"5 years of experience in developing mobile and web applications"} 
            image={employee2} 
        />

        <Employee
            name={"Marcus"} 
            surname={"Carter"} 
            func={"Data Scientist"} 
            exp={"8 years of experience in data analysis, machine learning, and statistical modeling"} 
            image={employee3} 
        />
    </div>
  );
}

export default App;