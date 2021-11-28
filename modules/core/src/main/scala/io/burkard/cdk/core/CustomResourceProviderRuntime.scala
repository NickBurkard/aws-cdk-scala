package io.burkard.cdk.core

sealed abstract class CustomResourceProviderRuntime(val underlying: software.amazon.awscdk.CustomResourceProviderRuntime)
  extends Product
    with Serializable

object CustomResourceProviderRuntime {
  implicit def toAws(value: CustomResourceProviderRuntime): software.amazon.awscdk.CustomResourceProviderRuntime =
    Option(value).map(_.underlying).orNull

  case object Nodejs12X
    extends CustomResourceProviderRuntime(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_12_X)

  case object Nodejs14X
    extends CustomResourceProviderRuntime(software.amazon.awscdk.CustomResourceProviderRuntime.NODEJS_14_X)
}
