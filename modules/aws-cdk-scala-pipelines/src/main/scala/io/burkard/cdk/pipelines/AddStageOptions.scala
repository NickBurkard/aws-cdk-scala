package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
