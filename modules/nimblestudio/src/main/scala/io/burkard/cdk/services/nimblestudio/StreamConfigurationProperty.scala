package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StreamConfigurationProperty {

  def apply(
    ec2InstanceTypes: List[String],
    streamingImageIds: List[String],
    clipboardMode: String,
    maxSessionLengthInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.Builder)
      .ec2InstanceTypes(ec2InstanceTypes.asJava)
      .streamingImageIds(streamingImageIds.asJava)
      .clipboardMode(clipboardMode)
      .maxSessionLengthInMinutes(maxSessionLengthInMinutes.orNull)
      .build()
}
