package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublisher {

  def apply(
    internalResourceId: String,
    connectionArn: Option[String] = None,
    acceptTermsAndConditions: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnPublisher =
    software.amazon.awscdk.CfnPublisher.Builder
      .create(stackCtx, internalResourceId)
      .connectionArn(connectionArn.orNull)
      .acceptTermsAndConditions(acceptTermsAndConditions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
