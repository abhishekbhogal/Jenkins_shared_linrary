def call() {
    sh 'trivy image abhishek/youtube:latest > trivyimage.txt'
}
