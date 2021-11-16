package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProfileProps {

  def apply(
    userProfileName: String,
    domainId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    singleSignOnUserValue: Option[String] = None,
    singleSignOnUserIdentifier: Option[String] = None,
    userSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfileProps =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.Builder)
      .userProfileName(userProfileName)
      .domainId(domainId)
      .tags(tags.map(_.asJava).orNull)
      .singleSignOnUserValue(singleSignOnUserValue.orNull)
      .singleSignOnUserIdentifier(singleSignOnUserIdentifier.orNull)
      .userSettings(userSettings.orNull)
      .build()
}
