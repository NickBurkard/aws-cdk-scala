package io.burkard.cdk.services.imagebuilder

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInfrastructureConfigurationProps {

  def apply(
    logging: Option[software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty] = None,
    securityGroupIds: Option[List[String]] = None,
    instanceProfileName: Option[String] = None,
    subnetId: Option[String] = None,
    terminateInstanceOnFailure: Option[Boolean] = None,
    snsTopicArn: Option[String] = None,
    name: Option[String] = None,
    keyPair: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None,
    instanceTypes: Option[List[String]] = None,
    resourceTags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.Builder)
      .logging(logging.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .instanceProfileName(instanceProfileName.orNull)
      .subnetId(subnetId.orNull)
      .terminateInstanceOnFailure(terminateInstanceOnFailure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .snsTopicArn(snsTopicArn.orNull)
      .name(name.orNull)
      .keyPair(keyPair.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .instanceTypes(instanceTypes.map(_.asJava).orNull)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .build()
}