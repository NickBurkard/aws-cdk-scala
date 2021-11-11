package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseStageOptions {

  def apply(
    confirmBroadeningPermissions: Option[Boolean] = None,
    securityNotificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.pipelines.BaseStageOptions =
    (new software.amazon.awscdk.pipelines.BaseStageOptions.Builder)
      .confirmBroadeningPermissions(confirmBroadeningPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityNotificationTopic(securityNotificationTopic.orNull)
      .build()
}
