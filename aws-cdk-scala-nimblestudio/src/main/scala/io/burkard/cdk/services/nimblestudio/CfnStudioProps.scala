package io.burkard.cdk.services.nimblestudio

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStudioProps {

  def apply(
    tags: Option[Map[String, String]] = None,
    studioName: Option[String] = None,
    adminRoleArn: Option[String] = None,
    userRoleArn: Option[String] = None,
    studioEncryptionConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty] = None,
    displayName: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioProps =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .studioName(studioName.orNull)
      .adminRoleArn(adminRoleArn.orNull)
      .userRoleArn(userRoleArn.orNull)
      .studioEncryptionConfiguration(studioEncryptionConfiguration.orNull)
      .displayName(displayName.orNull)
      .build()
}
