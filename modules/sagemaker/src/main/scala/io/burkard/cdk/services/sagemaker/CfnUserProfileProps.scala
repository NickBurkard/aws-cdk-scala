package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProfileProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userProfileName: Option[String] = None,
    singleSignOnUserValue: Option[String] = None,
    singleSignOnUserIdentifier: Option[String] = None,
    domainId: Option[String] = None,
    userSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfileProps =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .userProfileName(userProfileName.orNull)
      .singleSignOnUserValue(singleSignOnUserValue.orNull)
      .singleSignOnUserIdentifier(singleSignOnUserIdentifier.orNull)
      .domainId(domainId.orNull)
      .userSettings(userSettings.orNull)
      .build()
}
