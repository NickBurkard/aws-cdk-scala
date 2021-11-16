package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomResourceProps {

  def apply(
    serviceToken: String
  ): software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps =
    (new software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder)
      .serviceToken(serviceToken)
      .build()
}
