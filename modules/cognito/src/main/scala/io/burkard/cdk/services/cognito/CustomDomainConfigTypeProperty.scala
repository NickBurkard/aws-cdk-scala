package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomDomainConfigTypeProperty {

  def apply(
    certificateArn: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolDomain.CustomDomainConfigTypeProperty.Builder)
      .certificateArn(certificateArn.orNull)
      .build()
}