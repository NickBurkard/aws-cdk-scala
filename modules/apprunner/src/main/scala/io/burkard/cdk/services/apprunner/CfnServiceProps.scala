package io.burkard.cdk.services.apprunner

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServiceProps {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty] = None,
    instanceConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serviceName: Option[String] = None,
    healthCheckConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty] = None,
    autoScalingConfigurationArn: Option[String] = None,
    sourceConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty] = None
  ): software.amazon.awscdk.services.apprunner.CfnServiceProps =
    (new software.amazon.awscdk.services.apprunner.CfnServiceProps.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .instanceConfiguration(instanceConfiguration.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serviceName(serviceName.orNull)
      .healthCheckConfiguration(healthCheckConfiguration.orNull)
      .autoScalingConfigurationArn(autoScalingConfigurationArn.orNull)
      .sourceConfiguration(sourceConfiguration.orNull)
      .build()
}