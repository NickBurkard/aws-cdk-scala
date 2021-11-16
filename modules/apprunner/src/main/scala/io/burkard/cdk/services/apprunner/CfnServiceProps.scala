package io.burkard.cdk.services.apprunner

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceProps {

  def apply(
    sourceConfiguration: software.amazon.awscdk.services.apprunner.CfnService.SourceConfigurationProperty,
    encryptionConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.EncryptionConfigurationProperty] = None,
    instanceConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serviceName: Option[String] = None,
    healthCheckConfiguration: Option[software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty] = None,
    autoScalingConfigurationArn: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnServiceProps =
    (new software.amazon.awscdk.services.apprunner.CfnServiceProps.Builder)
      .sourceConfiguration(sourceConfiguration)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .instanceConfiguration(instanceConfiguration.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serviceName(serviceName.orNull)
      .healthCheckConfiguration(healthCheckConfiguration.orNull)
      .autoScalingConfigurationArn(autoScalingConfigurationArn.orNull)
      .build()
}
