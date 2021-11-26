package io.burkard.cdk.services.stepfunctions

sealed abstract class HttpMethod(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod)
  extends Product
    with Serializable

object HttpMethod {
  implicit def toAws(value: HttpMethod): software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod =
    Option(value).map(_.underlying).orNull

  case object Delete
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.DELETE)

  case object Get
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.GET)

  case object Head
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.HEAD)

  case object Options
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.OPTIONS)

  case object Patch
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PATCH)

  case object Post
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.POST)

  case object Put
    extends HttpMethod(software.amazon.awscdk.services.stepfunctions.tasks.HttpMethod.PUT)
}
