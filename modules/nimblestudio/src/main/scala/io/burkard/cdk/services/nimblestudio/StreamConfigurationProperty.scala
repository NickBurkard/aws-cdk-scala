package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StreamConfigurationProperty {

  def apply(
    ec2InstanceTypes: Option[List[String]] = None,
    streamingImageIds: Option[List[String]] = None,
    clipboardMode: Option[String] = None,
    maxSessionLengthInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile.StreamConfigurationProperty.Builder)
      .ec2InstanceTypes(ec2InstanceTypes.map(_.asJava).orNull)
      .streamingImageIds(streamingImageIds.map(_.asJava).orNull)
      .clipboardMode(clipboardMode.orNull)
      .maxSessionLengthInMinutes(maxSessionLengthInMinutes.orNull)
      .build()
}
