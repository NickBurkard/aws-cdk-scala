package io.burkard.cdk.services.s3


sealed abstract class HttpMethods(val underlying: software.amazon.awscdk.services.s3.HttpMethods)
  extends Product
    with Serializable


object HttpMethods {
  implicit def toAws(value: HttpMethods): software.amazon.awscdk.services.s3.HttpMethods =
    Option(value).map(_.underlying).orNull

  case object Get
    extends HttpMethods(software.amazon.awscdk.services.s3.HttpMethods.GET)

  case object Put
    extends HttpMethods(software.amazon.awscdk.services.s3.HttpMethods.PUT)

  case object Head
    extends HttpMethods(software.amazon.awscdk.services.s3.HttpMethods.HEAD)

  case object Post
    extends HttpMethods(software.amazon.awscdk.services.s3.HttpMethods.POST)

  case object Delete
    extends HttpMethods(software.amazon.awscdk.services.s3.HttpMethods.DELETE)
}
