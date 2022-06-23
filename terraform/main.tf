provider "aws" {
  region = "ap-south-1"
}

module "cluster" {
  source               = "weibeld/kubeadm/aws"
  version              = "0.2.4"
  private_key_file     = var.private_key_file
  public_key_file      = var.public_key_file
  master_instance_type = var.master_instance_type
  worker_instance_type = var.worker_instance_type
  num_workers          = var.num_workers
}

