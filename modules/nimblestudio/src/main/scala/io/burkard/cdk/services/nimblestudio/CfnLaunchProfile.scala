package io.burkard.cdk.services.nimblestudio

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchProfile {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    studioComponentIds: Option[List[String]] = None,
    launchProfileProtocolVersions: Option[List[String]] = None,
    studioId: Option[String] = None,
    streamConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty] = None,
    ec2SubnetIds: Option[List[String]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile =
    software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .studioComponentIds(studioComponentIds.map(_.asJava).orNull)
      .launchProfileProtocolVersions(launchProfileProtocolVersions.map(_.asJava).orNull)
      .studioId(studioId.orNull)
      .streamConfiguration(streamConfiguration.orNull)
      .ec2SubnetIds(ec2SubnetIds.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
