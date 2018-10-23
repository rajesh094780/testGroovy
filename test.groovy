println 'hello world';
sh """
        docker login $params.registry -u $AZURE_USER -p $AZURE_PASSWORD
    """
