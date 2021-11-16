package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProfile {

  def apply(
    internalResourceId: String,
    userProfileName: String,
    domainId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    singleSignOnUserValue: Option[String] = None,
    singleSignOnUserIdentifier: Option[String] = None,
    userSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnUserProfile =
    software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder
      .create(stackCtx, internalResourceId)
      .userProfileName(userProfileName)
      .domainId(domainId)
      .tags(tags.map(_.asJava).orNull)
      .singleSignOnUserValue(singleSignOnUserValue.orNull)
      .singleSignOnUserIdentifier(singleSignOnUserIdentifier.orNull)
      .userSettings(userSettings.orNull)
      .build()
}
