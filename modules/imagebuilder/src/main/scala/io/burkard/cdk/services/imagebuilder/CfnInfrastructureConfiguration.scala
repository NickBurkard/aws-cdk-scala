package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInfrastructureConfiguration {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration =
    software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.Builder
      .create(stackCtx, internalResourceId)
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
