package io.burkard.cdk.pipelines

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddStageOptions {

  def apply(
    extraRunOrderSpace: Option[Number] = None,
    manualApprovals: Option[Boolean] = None,
    confirmBroadeningPermissions: Option[Boolean] = None,
    securityNotificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.pipelines.AddStageOptions =
    (new software.amazon.awscdk.pipelines.AddStageOptions.Builder)
      .extraRunOrderSpace(extraRunOrderSpace.orNull)
      .manualApprovals(manualApprovals.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .confirmBroadeningPermissions(confirmBroadeningPermissions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityNotificationTopic(securityNotificationTopic.orNull)
      .build()
}
