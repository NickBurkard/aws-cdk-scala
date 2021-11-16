package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPublisher {

  def apply(
    internalResourceId: String,
    acceptTermsAndConditions: Boolean,
    connectionArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnPublisher =
    software.amazon.awscdk.CfnPublisher.Builder
      .create(stackCtx, internalResourceId)
      .acceptTermsAndConditions(acceptTermsAndConditions)
      .connectionArn(connectionArn.orNull)
      .build()
}
