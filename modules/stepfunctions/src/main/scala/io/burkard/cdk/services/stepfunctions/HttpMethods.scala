package io.burkard.cdk.services.stepfunctions

sealed abstract class HttpMethods(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods)
  extends Product
    with Serializable

object HttpMethods {
  implicit def toAws(value: HttpMethods): software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods =
    Option(value).map(_.underlying).orNull

  case object Get
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.GET)

  case object Post
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.POST)

  case object Put
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PUT)

  case object Delete
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.DELETE)

  case object Patch
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.PATCH)

  case object Head
    extends HttpMethods(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethods.HEAD)
}
