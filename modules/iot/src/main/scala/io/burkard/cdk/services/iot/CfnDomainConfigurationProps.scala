package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDomainConfigurationProps {

  def apply(
    serviceType: Option[String] = None,
    serverCertificateArns: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainConfigurationStatus: Option[String] = None,
    authorizerConfig: Option[software.amazon.awscdk.services.iot.CfnDomainConfiguration.AuthorizerConfigProperty] = None,
    domainName: Option[String] = None,
    validationCertificateArn: Option[String] = None,
    domainConfigurationName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnDomainConfigurationProps =
    (new software.amazon.awscdk.services.iot.CfnDomainConfigurationProps.Builder)
      .serviceType(serviceType.orNull)
      .serverCertificateArns(serverCertificateArns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainConfigurationStatus(domainConfigurationStatus.orNull)
      .authorizerConfig(authorizerConfig.orNull)
      .domainName(domainName.orNull)
      .validationCertificateArn(validationCertificateArn.orNull)
      .domainConfigurationName(domainConfigurationName.orNull)
      .build()
}
