async function analyzeResume() {
    const resumeText = document.getElementById('resumeText').value;

    const response = await fetch('http://localhost:8080/api/resume/analyze', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ resumeText })
    });

    const data = await response.json();

    if (data.title) {
        document.getElementById('resultTitle').innerText = data.title;

        const strengthsList = document.getElementById('strengthsList');
        strengthsList.innerHTML = '';
        data.strengths.forEach(item => {
            const li = document.createElement('li');
            li.textContent = item;
            strengthsList.appendChild(li);
        });

        const improvementsList = document.getElementById('improvementsList');
        improvementsList.innerHTML = '';
        data.improvements.forEach(item => {
            const li = document.createElement('li');
            li.textContent = item;
            improvementsList.appendChild(li);
        });
    } else {
        alert("Something went wrong: " + (data.message || "Unknown error"));
    }
}
