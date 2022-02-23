terraform {
  backend "s3" {
    bucket = "pushbutton-metin"
    key    = "us/app/pushbutton/ec2"
    region = "us-east-1"
  }
}