package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublisherProps {

  def apply(
    acceptTermsAndConditions: Boolean,
    connectionArn: Option[String] = None
  ): software.amazon.awscdk.CfnPublisherProps =
    (new software.amazon.awscdk.CfnPublisherProps.Builder)
      .acceptTermsAndConditions(acceptTermsAndConditions)
      .connectionArn(connectionArn.orNull)
      .build()
}
