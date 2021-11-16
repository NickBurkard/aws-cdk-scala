package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublisherProps {

  def apply(
    acceptTermsAndConditions: Boolean,
    connectionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnPublisherProps =
    (new software.amazon.awscdk.services.cloudformation.CfnPublisherProps.Builder)
      .acceptTermsAndConditions(acceptTermsAndConditions)
      .connectionArn(connectionArn.orNull)
      .build()
}
