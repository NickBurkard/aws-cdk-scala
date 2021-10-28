package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProfile {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userProfileName: Option[String] = None,
    singleSignOnUserValue: Option[String] = None,
    singleSignOnUserIdentifier: Option[String] = None,
    domainId: Option[String] = None,
    userSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnUserProfile =
    software.amazon.awscdk.services.sagemaker.CfnUserProfile.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .userProfileName(userProfileName.orNull)
      .singleSignOnUserValue(singleSignOnUserValue.orNull)
      .singleSignOnUserIdentifier(singleSignOnUserIdentifier.orNull)
      .domainId(domainId.orNull)
      .userSettings(userSettings.orNull)
      .build()
}
