def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']], 
        extensions: [], 
        userRemoteConfigs: [[url: 'https://github.com/abhishekbhogal/Youtube-clone-app.git']]
    ])
}
