package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PermissionsBroadeningCheckProps {

  def apply(
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    stage: Option[software.amazon.awscdk.Stage] = None
  ): software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps =
    (new software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps.Builder)
      .notificationTopic(notificationTopic.orNull)
      .stage(stage.orNull)
      .build()
}
