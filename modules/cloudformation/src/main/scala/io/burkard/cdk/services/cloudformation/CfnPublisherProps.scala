package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublisherProps {

  def apply(
    connectionArn: Option[String] = None,
    acceptTermsAndConditions: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudformation.CfnPublisherProps =
    (new software.amazon.awscdk.services.cloudformation.CfnPublisherProps.Builder)
      .connectionArn(connectionArn.orNull)
      .acceptTermsAndConditions(acceptTermsAndConditions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
