package io.burkard.cdk.services.nimblestudio

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStudioComponentProps {

  def apply(
    name: Option[String] = None,
    subtype: Option[String] = None,
    initializationScripts: Option[List[_]] = None,
    ec2SecurityGroupIds: Option[List[String]] = None,
    configuration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentConfigurationProperty] = None,
    studioId: Option[String] = None,
    `type`: Option[String] = None,
    scriptParameters: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps.Builder)
      .name(name.orNull)
      .subtype(subtype.orNull)
      .initializationScripts(initializationScripts.map(_.asJava).orNull)
      .ec2SecurityGroupIds(ec2SecurityGroupIds.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .studioId(studioId.orNull)
      .`type`(`type`.orNull)
      .scriptParameters(scriptParameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
