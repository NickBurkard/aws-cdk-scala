package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchProfile {

  def apply(
    internalResourceId: String,
    name: String,
    studioComponentIds: List[String],
    launchProfileProtocolVersions: List[String],
    studioId: String,
    streamConfiguration: software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty,
    ec2SubnetIds: List[String],
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile =
    software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .studioComponentIds(studioComponentIds.asJava)
      .launchProfileProtocolVersions(launchProfileProtocolVersions.asJava)
      .studioId(studioId)
      .streamConfiguration(streamConfiguration)
      .ec2SubnetIds(ec2SubnetIds.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
