Deploy MongoDB replicaset with helm:

```
helm install mongodb-rs --set architecture=replicaset  bitnami/mongodb
```

Run in minikube:
```
skaffold dev
```

Access API
```
curl $(minikube service demo --url)/person
```
