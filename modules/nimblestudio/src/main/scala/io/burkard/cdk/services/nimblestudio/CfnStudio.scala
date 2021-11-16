package io.burkard.cdk.services.nimblestudio

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStudio {

  def apply(
    internalResourceId: String,
    studioName: String,
    adminRoleArn: String,
    userRoleArn: String,
    displayName: String,
    tags: Option[Map[String, String]] = None,
    studioEncryptionConfiguration: Option[software.amazon.awscdk.services.nimblestudio.CfnStudio.StudioEncryptionConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.nimblestudio.CfnStudio =
    software.amazon.awscdk.services.nimblestudio.CfnStudio.Builder
      .create(stackCtx, internalResourceId)
      .studioName(studioName)
      .adminRoleArn(adminRoleArn)
      .userRoleArn(userRoleArn)
      .displayName(displayName)
      .tags(tags.map(_.asJava).orNull)
      .studioEncryptionConfiguration(studioEncryptionConfiguration.orNull)
      .build()
}
