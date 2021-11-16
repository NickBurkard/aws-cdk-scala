package io.burkard.cdk.services.cloudformation

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResourceProviderConfig {

  def apply(
    serviceToken: String
  ): software.amazon.awscdk.services.cloudformation.CustomResourceProviderConfig =
    (new software.amazon.awscdk.services.cloudformation.CustomResourceProviderConfig.Builder)
      .serviceToken(serviceToken)
      .build()
}
