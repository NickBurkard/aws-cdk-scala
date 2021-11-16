package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInfrastructureConfigurationProps {

  def apply(
    instanceProfileName: String,
    name: String,
    logging: Option[software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty] = None,
    securityGroupIds: Option[List[String]] = None,
    subnetId: Option[String] = None,
    terminateInstanceOnFailure: Option[Boolean] = None,
    instanceMetadataOptions: Option[software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty] = None,
    snsTopicArn: Option[String] = None,
    keyPair: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    instanceTypes: Option[List[String]] = None,
    resourceTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.Builder)
      .instanceProfileName(instanceProfileName)
      .name(name)
      .logging(logging.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .terminateInstanceOnFailure(terminateInstanceOnFailure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceMetadataOptions(instanceMetadataOptions.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .keyPair(keyPair.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .build()
}
