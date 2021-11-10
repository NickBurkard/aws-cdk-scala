package io.burkard.cdk.core


sealed abstract class CustomResourceProviderRuntime(val underlying: software.amazon.awscdk.CustomResourceProviderRuntime)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object CustomResourceProviderRuntime {
  implicit def toAws(value: CustomResourceProviderRuntime): software.amazon.awscdk.CustomResourceProviderRuntime =
    Option(value).map(_.underlying).orNull

  case object Nodejs12
    extends CustomResourceProviderRuntime(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_12)

  case object Nodejs14X
    extends CustomResourceProviderRuntime(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_14_X)
}
