resource "aws_s3_bucket" "example" {
  bucket = "mi-bucket-de-ejemplo"
  acl    = "public-read"
}
