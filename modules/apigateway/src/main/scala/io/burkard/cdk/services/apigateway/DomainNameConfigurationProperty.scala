package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DomainNameConfigurationProperty {

  def apply(
    certificateName: Option[String] = None,
    certificateArn: Option[String] = None,
    endpointType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDomainNameV2.DomainNameConfigurationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDomainNameV2.DomainNameConfigurationProperty.Builder)
      .certificateName(certificateName.orNull)
      .certificateArn(certificateArn.orNull)
      .endpointType(endpointType.orNull)
      .build()
}
