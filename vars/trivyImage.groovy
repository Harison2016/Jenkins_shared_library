def call() {
    sh 'trivy image hokonkwo29/youtube:latest > trivyimage.txt'
}
