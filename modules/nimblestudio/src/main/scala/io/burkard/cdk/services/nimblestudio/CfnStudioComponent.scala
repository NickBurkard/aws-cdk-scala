package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStudioComponent {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent =
    software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.Builder
      .create(stackCtx, internalResourceId)
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
