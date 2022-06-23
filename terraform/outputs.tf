output "kubeconfig" {
  value       = module.cluster.kubeconfig
  description = "Location of the kubeconfig file for the created cluster on the local machine."
}

output "cluster_name" {
  value       = module.cluster.cluster_name
  description = "Name of the created kubernetes cluster"
}

output "cluster_nodes" {
  value       = module.cluster.cluster_nodes
  description = "Name , public and private addresses of the created nodes"
}

output "vpc_id" {
  value       = module.cluster.vpc_id
  description = "ID of the VPC in which the cluster has been created"
}
